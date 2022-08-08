use dbFarmacie

--Sa se creeze un trigger care sa opreasca inserarea datelor din tMedicamente sau actualizarea acestora cu o data trecuta de ziua de azi.

create function validareaMedicamentelor(@dataintrodusa date)
returns int
as
begin
  if(@dataintrodusa<getdate())  return 0
  return 1
end

--Undo marca SQL :)

go
create trigger trigger_validareaMedicamentelor on farmacie.tMedicamente
for insert, update
as
begin
  declare @nrRanduri int=@@rowcount
  if @nrRanduri>1
    begin
	  print 'Triggerul nu permite modificarea a mai mult de un rand'
	  rollback transaction
	  print 'Modificarile au fost anulate cu succes'
	  return
	end

	--blocarea adaugarii de medicamente expirate
  declare @dataCurenta varchar(30)
  select @dataCurenta=convert(varchar,dataexp,101) from inserted
  if(dbo.validareaMedicamentelor(cast(@dataCurenta as datetime))=0)
    begin
	  print 'Eroare! Medicamente expirate din data:'+@dataCurenta
	  rollback transaction
	  print 'Modificarile au fost anulate cu succes'
	end
end

insert into tMedicamente values ('M561','PentolMax','06/01/2019') --Eroare, produsul fiind expirat

insert into tMedicamente values ('M941','Anstix','01/03/2022'),('M101','Ampax','09/11/2023') --Mai mult de un produs, Eroare!

insert into tMedicamente values ('M511','Corega','01/01/2023') --Un singur produs + nu este expirat => Operatiune validata de trigger

select * from tMedicamente