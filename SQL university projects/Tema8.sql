use dbFarmacie

--Sa se creeze un tabel cu multe informatii generate 

create table farmacie.tDepozite (codDepozit int identity (1,1) primary key, denumire varchar(20), numarDepozit int)
create synonym tDepozite for farmacie.tDepozite

SET IDENTITY_INSERT farmacie.tDepozite ON; 

declare @cod int, @i int
set @i=0

while @i<1000
  begin
    set @i+=1
	set @cod=rand()*10000
	if not exists (select * from tDepozite where @cod=numarDepozit)
	insert into tDepozite(denumire,codDepozit) values ('Depozit'+str(@cod),@cod)
  end

select * from tDepozite

--Sa se creeze un index pentru a cauta informatii pe baza codDepozit

create index idx_depozit on farmacie.tDepozite (codDepozit)

select * from tDepozite with (index=idx_depozit)

--Sa se creeze un index pentru a cauta informatii pe baza numarului depozitului
create index idx_depozit2 on farmacie.tDepozite (numarDepozit)

select * from tDepozite with (index=idx_depozit2)