use dbFarmacie

alter table farmacie.tAngajati add Major char(6)
--Sa se elaboreze o tranzactie in care se adauga Maturitatea angajatilor(minor/major)

begin try
  begin transaction
    update tAngajati set Major='NU' where datediff(yy,dataNasterii,getdate())<18
	update tAngajati set Major='DA' where datediff(yy,dataNasterii,getdate())>=18
	commit transaction
  print 'Tranzactia reusita'
end try
  begin catch
    rollback transaction
	  print 'Tranzactia intoarsa'
end catch

select * from tAngajati



--Sa se insereze 3 medicamente prin intermediul unei tranzanctii(TranzactieNR2), cu 2 save point-uri astfel incat sa se insereze doar doua din ele , iar a treia primeste rollback.

begin try
  begin transaction
    insert into tMedicamente values ('M101','ParasinusForte','07/09/2023')
	save transaction tranzactieNR2
	insert into tMedicamente values ('M142','AntiNevralgic','01/01/2022')
	save transaction tranzactieNR2
	insert into tMedicamente values ('M951','Laxatin','06/05/2024')
	rollback transaction tranzactieNR2
	commit
  print 'Tranzactia reusita!'
  end try
  begin catch
    rollback transaction
	  print 'Tranzactia intoarsa'
end catch

select * from tMedicamente