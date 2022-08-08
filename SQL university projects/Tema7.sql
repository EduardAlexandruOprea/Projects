use dbFarmacie

--Sa se creeze o vedere in care gasesti varsta angajatilor si in ce departament se gasesc

create view vAngajati as
select codAng nume_prenume,datediff(yy, dataNasterii, getdate()) as [Varsta],denumire 
from tAngajati as A inner join tDepartamente as B on A.codDep=B.codDep

select * from vAngajati

--Sa se afiseze media varstei pe departament 

select denumire,avg(varsta) as [Varsta Medie] from vAngajati group by denumire

--Sa se modifice vederea sa arate si ce medicamente vinde fiecare angajat

alter view vAngajati as
select A.codAng,nume_prenume,datediff(yy, dataNasterii, getdate()) as [Varsta],B.denumire,C.denumire as [Medicamente]
from (tAngajati as A inner join tDepartamente as B on A.codDep=B.codDep) left join tMedicamente as C on A.codAng=C.codMed


--Sa se stearga vederea

drop view vAngajatiCriptat

--Sa se creeze o vedere criptata la Angajati

create view vAngajati_Criptat with encryption as
select codAng,nume_prenume,dataNasterii,localitate,denumire from tAngajati as A left join tDepartamente as B on A.codDep=B.codDep

select * from vAngajati_Criptat

--Sa se mute angajatii nascuti in 2001, exceptand luna mai, din localitatea Pitesti, in departamentul de Calmante

update vAngajati_Criptat set denumire='Departament Calmante' 
where (year(dataNasterii)=2001 and localitate='Pitesti') and month(dataNasterii)=1

--Sa se creeze vederea vAngajati_Criptat2 doar cu angajatii din departamentul de anti inflamatoare, cu optiunea check

go
create view vAngajati_Criptat2 as 
select * from vAngajati_Criptat where denumire='Departament Anti Inflamatoare'
with check option

select*from vAngajati_Criptat2