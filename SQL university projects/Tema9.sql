--Sa se creeze o functie care sa arate cel mai mic divizor comun a doua numere

create function CelMaiMicDivizorComun (@nr1 int, @nr2 int)
returns int
as
begin
  while @nr1<>@nr2
    begin
	  if @nr1>@nr2
	    set @nr1-=@nr2
	  if @nr1<@nr2
	    set @nr2-=@nr1
	end
  return @nr1
end

--Sa se afiseze cel mai mic divizor comun dintre 12 si 420

print dbo.CelMaiMicDivizorComun(12,420)

--Sa se altereze functia dpdv al eficientei

alter function CelMaiMicDivizorComunEficienta (@nr1 int, @nr2 int)
returns int
as
begin
  declare @x int
  while @nr2<>0
    begin
	  set @x=@nr1%@nr2
	  set @nr1=@nr2
	  set @nr2=@x
	end
  return @nr1
end

print dbo.CelMaiMicDivizorComun(4,400)

--Sa se stearga functia CelMaiMicDivizorComun

drop function CelMaiMicDivizorComun

--Sa se creeze o functie care arata angajatii nascuti dupa 1 Ianuarie 2000 
use dbFarmacie
create function Angajati2000 (@dataNastereReferinta varchar(50))
returns table
as
return (select * from tAngajati where dataNasterii > @dataNastereReferinta)

select *from Angajati2000('01/01/2001')