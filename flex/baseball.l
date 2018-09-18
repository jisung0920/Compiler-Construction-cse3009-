%{
  int strike = 0;
  int ball = 0;
  int out = 0;
  int a_point = 0;
  int b_point = 0;
  int g_round = 0;
%}

%%
S     {
       if(strike <2)
        strike++;
       else{

         if(out<2)
          out++;
         else{
          g_round++;
          out = 0;
         }

         strike =0;
         ball =0;
       }
      }
B     {
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
H     {strike =0;
       ball =0;
       if(g_round%2==0)
        a_point++;
       else
        b_point++;
      }
.     {}
%%

int main(int argc, char** argv){

  yylex();
  printf("apoint : %d\n",a_point );
  printf("bpoint : %d\n",b_point );
  return 0;
}
