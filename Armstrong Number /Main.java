#include <stdio.h>
int main() {
	int n,r,b,sum=0;
  scanf("%d",&n);
  b=n;
  while(n!=0)
  {
    r=n%10;
    sum=sum+(r*r*r);
    n=n/10;
  }
  if(b==sum)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}