use dbFarmacie
select *from tAngajati
--Sa se creeze un cursor care afiseaza informatiile din tAngajati

declare cursorul1 cursor
for select codAng,nume_prenume,dataNasterii, localitate,codDep from farmacie.tAngajati
open cursorul1
declare @codAng varchar(10) ,@nume_prenume varchar(30),@dataNasterii date, @localitate char(20),@codDep varchar(20)
fetch next from cursorul1 into @codAng,@nume_prenume,@dataNasterii, @localitate,@codDep
while @@FETCH_STATUS=0
  begin
   
    print @codAng+' '+@nume_prenume +' '+ CONVERT(varchar, @dataNasterii)  +' '+ @localitate +' '+ @codDep
	fetch next from cursorul1 into @codAng,@nume_prenume,@dataNasterii, @localitate,@codDep
  end
close cursorul1
deallocate cursorul1

--Sa se creeze un cursor care afiseaza informatiile din tMedicamente dar in ordine inversa

select *from tMedicamente
declare cursorul2 cursor scroll
for select codMed, denumire,dataexp from farmacie.tMedicamente
open cursorul2
declare @codMed char(50), @denumire varchar(50), @dataexp date
fetch last from cursorul2 into @codMed,@denumire,@dataexp
while @@fetch_status=0
  begin
    print @codMed+' '+@denumire+' '+convert(varchar,@dataexp)
	fetch prior from cursorul2 into @codMed,@denumire,@dataexp
  end
close cursorul2
deallocate cursorul2

--Sa se creeze un cursor care afiseaza informatiile din 2 in 2  randuri, din tMedicamente in ordine descrescatoare

declare cursorul3 cursor scroll
for select codMed, denumire,dataexp from farmacie.tMedicamente
open cursorul3
declare @codMed char(50), @denumire varchar(50), @dataexp date
fetch last from cursorul3 into @codMed,@denumire,@dataexp
while @@fetch_status=0
  begin
    print @codMed+' '+@denumire+' '+convert(varchar,@dataexp)
	fetch  relative-2 from cursorul3 into @codMed,@denumire,@dataexp
  end
close cursorul3
deallocate cursorul3




--Sa se creeze un cursor care afiseaza numarul de angajati pe baza de localitate in ordine descrescatoare cu un numar mai mare decat 2

go
declare @nr int 
declare cursorul4 cursor scroll
for select localitate,count(codAng) as [NrAngajati] from farmacie.tAngajati group by localitate order by [NrAngajati] desc
open cursorul4
declare @localitate varchar(50), @NrAngajati int
set @nr=1
fetch absolute @nr from cursorul4 into @localitate,@NrAngajati
while @@fetch_status=0
  begin
    if(@NrAngajati>2)
	  print @localitate+' '+str(@NrAngajati)
	set @nr+=1
	fetch absolute @nr from cursorul4 into @localitate,@NrAngajati
  end
close cursorul4
deallocate cursorul4