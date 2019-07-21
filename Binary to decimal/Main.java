#include<stdio.h>
#include<stdio.h>
int main()
{
  int n, sum=0,p=0, rem;
  scanf("%d", &n) ;
  while(n!=0) 
  {
    rem=n%10;
    sum =sum+rem*pow(2, p) ;
    n=n/10;
    p++;
  }
  printf("%d", sum) ;
  return 0;
}