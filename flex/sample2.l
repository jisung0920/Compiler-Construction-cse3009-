%{
  int num_char = 0;
  int num_line = 0;
%}

%%
[ ]   {}
\n    {num_line++; num_char++;}
.     {num_char++;}
%%

int main(){
  yylex();
  printf("# of lines : %d\n",num_line );
  printf("# of chars : %d\n",num_char );
  return 0;
}
