 Program ex;
Var
  n,x: Longint;
  c,par ,impar: Byte;
  i: Integer;
Begin
  Write('n=');
  Readln(n);
  For i:=1 To n Do
    Begin
      par := 0;
      impar := 0;
      Write('introduceti numar=');
      Readln(x);
      While x<>0 Do
        Begin
          c := x Mod 10;
          If c Mod 2 =0 Then Inc(par)
          Else Inc(impar);
          x := x Div 10;
        End;
      Writeln('numarul cifrelor pare=', par ) ;
      Writeln ('numarul cifrelor impare=', impar ) ;
      Writeln(' ');
    End;
  Readln;
End.
