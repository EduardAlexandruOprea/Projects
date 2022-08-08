
select *from [HumanResources].Department

--Numele tuturor departamentelor

select name from HumanResources.Department

--Numele tuturor grupurilor
select GroupName from HumanResources.Department

--toate grupurile cu numele distincte

select distinct GroupName from HumanResources.Department

--Toate departamentele  de manufacturing
select name, groupname from HumanResources.Department
where GroupName like 'MANUFACTURING'

--Numele tuturor angajatilor care au nivelul de autoritate mai mare sau egal cu 2

SELECT *FROM HumanResources.Employee
--ORGLEVEL=2--
SELECT *FROM HumanResources.Employee WHERE OrganizationLevel=2

--ORGLEVEL=2 OR 3
SELECT *FROM HumanResources.Employee WHERE OrganizationLevel IN (2,3)

--angajati cu jobul "Facilities Manager"

SELECT *from HumanResources.Employee where JobTitle like 'Facilities Manager'


--cauta dupa un anumit cuvant
SELECT *from HumanResources.Employee where JobTitle like '%control%'

--Toti angajatii nascuti dupa data de ""
SELECT *from HumanResources.Employee where BirthDate > '1985-01-02'

--Toti angajatii nascuti intre "" si ""
SELECT *from HumanResources.Employee where BirthDate > '1/1/1970' and BirthDate<'1/1/1980'
SELECT *from HumanResources.Employee where BirthDate between '10/10/1975' and '10/1/1980'

--Coloane calculate

select name, ListPrice from [Production].[Product]
select name , listprice,listprice+10 as adjusted_list_price from [Production].[Product]

select name , listprice,listprice+10 as adjusted_list_price into [Production].[Product_2] from [Production].[Product]
select *from [Production].[Product_2]

select name, listprice, listprice+10 as adjusted_list_price into # from [Production].[Product]

select *from [Production].[Product]
select name, listprice, listprice+10 as adjusted_list_price into #tmpname from [Production].[Product] -- # inseamna temporar
select *from #tmpname