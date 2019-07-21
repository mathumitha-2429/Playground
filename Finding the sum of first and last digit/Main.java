#include <stdio.h>
int main() {
	int n, fd, ld;
  scanf("%d", &n) ;
  ld=n%10;
  while(n>=10) 
  {
    n=n/10;
  }
  fd=n;
  printf("%d", ld+fd) ;
	return 0;
}