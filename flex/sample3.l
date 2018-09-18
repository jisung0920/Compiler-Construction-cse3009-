%{
  int num_char = 0;
  int num_line = 1;
%}

%%
\n    {num_line++; num_char++;}
.     {num_char++;}
%%

int main(int argc, char** argv){
  FILE *file;
  file = fopen(argv[1],"r");
  if(!file){
    perror("no file\n");
    exit(1);
  }
  yyin = file;
  yylex();
  printf("# of lines : %d\n",num_line );
  printf("# of chars : %d\n",num_char );
  return 0;
}
