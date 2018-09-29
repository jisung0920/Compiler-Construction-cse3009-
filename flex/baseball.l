%{
  int strike = 0;
  int ball = 0;
  int out = 0;
  int a_point = 0;
  int b_point = 0;
  int g_round = 0;
%}

%%
s|S     {
       if(g_round>5)
        return 0;
       if(strike <2)
        strike++;
       else{
         strike =0;
         ball =0;
         if(out<2)
          out++;
         else{
          g_round++;
          out = 0;
         }
       }
      }
b|B     {
       if(g_round>5)
        return 0;
       if(ball <3)
        ball++;
       else{
         strike =0;
         ball =0;
         if(g_round%2==0)
          a_point++;
         else
          b_point++;
         }
       }
h|H     {
       if(g_round>5)
        return 0;
       strike =0;
       ball =0;
       if(g_round%2==0)
        a_point++;
       else
        b_point++;
      }
.     {}
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
  printf("a : %d\n",a_point );
  printf("b : %d\n",b_point );
  if(g_round>5)
    printf("게임 종료\n");
  else
    printf("게임 진행 중\n");
  return 0;
}
