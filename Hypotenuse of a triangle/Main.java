#include<stdio.h>
#include<math.h>
int main()
{
  float o, a;
  scanf("%f%f", &o, &a) ;
  float h = sqrt((o*o) +(a*a)) ;
  printf("%.2f", h) ;
  return 0;
}