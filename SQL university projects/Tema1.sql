/*Modelul conceptual al datelor corespunzator unei farmacii (Sistem Simplificat)

Entitati : Angajat,  Departament, Medicament;

Atribuite si identificatori :

Angajat ( codAngajat, nume_prenume, dataNasteri, localitate)
Departament ( codDepartament, denumire, locuriMedicamente)
Medicament ( codMedicament, denumire, dataExpirare)

Asocieri intre entitati:

Intre entitatea Angajat si Departament exista o asociere de tip n:1
Intre entitatea Departament si Medicament exista o asociere de tip n:n
Intre entitatea Medicament si Angajat exista o asociere de tip 1:1

Modelul relational al datelor :
tAngajati ( codAng, nume_prenume, dataNasteri, localitate, codDep) codAng cheie primara, codDep cheie straina
tDepartamente ( codDep, denumire, locuriMedicamente) codDep cheie primara
tMedicamente( codMed, denumire, dataExp) codMed cheie primara

*/

--Crearea bazei de date dbFarmacie

create database dbFarmacie

--Activare baza de date

use dbFarmacie

--Crearea Schemei "Farmacie"

create schema farmacie

--Crearea tabelelor

create table farmacie.tDepartamente( codDep char(10) constraint pk_dep primary key, denumire varchar(40), locuriMedicamente tinyint)
create table farmacie.tMedicamente(codMed char(10) constraint pk_med primary key, denumire varchar(40), dataexp date)
create table farmacie.tAngajati(codAng char(10) constraint pk_ang primary key, nume_prenume varchar(100), dataNasterii date, localitate varchar(50), codDep char(10) constraint fk_dep1 foreign key references farmacie.tDepartamente(codDep))

--Alter table 

alter table farmacie.tAnimalMedicamente alter column codMed char(10) not null
alter table farmacie.tMedicamente add constraint fk_med foreign key (codMed) references farmacie.tMedicamente(codMed)
