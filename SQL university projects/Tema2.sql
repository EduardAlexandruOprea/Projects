use dbFarmacie

--Creare sinonime pentru tabelele schemei "Farmacie"

create synonym tAngajati for farmacie.tAngajati
create synonym tDepartamente for farmacie.tDepartamente
create synonym tMedicamente for farmacie.tMedicamente

--Inserare valori pentru Departamente

insert into tDepartamente values ('D1','Departament Calmante',100),('D2','Departament Anti Gripale',120),('D3','Departament Vitamine',120),
                                 ('D4','Departament Anti Inflamatoare', 50)

--Inserare valori pentru Medicamente

insert into tMedicamente values ('M1','Paracetamol','03/03/2022'),('M2','Aerius','04/04/2022'),('M3','Ospamox','05/05/2022'),
                                ('M4','Parasinus','06/06/2022'),('M5','Herbion','07/07/2022'),('M6','Faringosept','08/08/2022')

--Inserare valori pentru Angajati

insert into tAngajati values ('A1','Andrei Alexandru','01/07/2001','Pitesti','D1'),('A2','Andreea Matei','01/03/2002','Bradu','D2'),
                             ('A3','Savu Mihai','01/05/1996','Telesti','D3'),('A4','Dragos Cristescu','05/10/2002','Pitesti','D4'),
							 ('A5','Laurentiu Dedu','08/11/2000','Brosteni','D4'),('A6','Ilie Ana ','07/07/2001','Pitesti','D4')
							


 --Inserare valori pentru Medicamente

insert into tMedicamente values ('F2','M1','10/05/2021'),('F2','M2','10/05/2021'),('F2','M3','10/05/2021'),('F3','M4','10/05/2021'),
                                      ('F4','M5','10/04/2021'),('F5','M6','10/04/2021'),('F6','M6','10/04/2021'),('F7','M5','10/03/2021'),
									  ('F8','M1','10/05/2021'),('F9','M3','10/03/2021'),('F10','M2','01/01/2021')

--Interogari simple

--Sa se afiseze numele angajatilor in ordinea descrescatoare a datii de nastere

select nume_prenume from tAngajati order by dataNasterii desc


--Sa se afiseze medicamentele a caror denumire incepe cu B sau P

select * from tMedicamente where denumire like '[BP]%'

--Sa se afiseze medicamentele a caror date de expirare este in anul 2022

select * from tMedicamente where year(dataExp)=2022

--Sa se afiseze numarul de departamente

select count(*) as [Numarul de departamente] from  tDepartamente

--Sa se afiseze numarul de angajati la nivel de localitate ordonat crescator

select localitate,count(codAng) as [Numar de angajati] from tAngajati group by localitate order by [Numar de angajati]

--Sa se afiseze numele celor doi din cei mai tineri angajati

select top 2 nume_prenume from tAngajati order by dataNasterii desc


--Sa se afiseze numarul de angajati la nivel de localitate, cu cel putin 3 angajati

select localitate, count(*) as [Numarul de angajati] from tAngajati group by localitate having count(*)>=3
