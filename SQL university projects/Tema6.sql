use dbFarmacie
select * from tAngajati
select * from tDepartamente

--Insereaza informatii noi la Animale si Hrana

insert into tAngajati values ('A10','Andreea Alexandru','04/07/2001','Costesti','D2')
insert into tMedicamente(codMed,denumire,dataExp) values ('H3','Fluviflex','02/17/2023')


--Sa se stearga toate hranile care au trecut de Data expirarii

delete from tMedicamente where getdate()>dataExp

--Sa se modifice data de nastere a tuturor angajatilor cu o zi in plus

update tAngajati set dataNasterii=DATEADD(day,1,dataNasterii)

--Sa se stearga continutul tabelului tAngajati

truncate table tPui