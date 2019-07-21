#include<stdio.h>
int main()
{
int n,n1,n2,o,e,a,d;
  scanf("%d",&n);
	if(n%2==1)
    {
      a=0,d=2;
      n1=(n+1)/2;
      o=a+(n1-1)*d;
      printf("%d",o);
    }
  else
  {
    a=0,d=1;
     n2=n/2;
    e=a+ (n2-1)*d;
    printf("%d",e);
  }
  return 0;
}