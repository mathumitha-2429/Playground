#include <stdio.h>
#include<math.h>
int main()
{
  	int b, p;
  scanf ("%d%d", &b, &p) ;
  if(p>=0) 
  {
    int low=pow(b, p) ;
    printf("%d", low) ;
  }
  else
  {
    printf("Wrong input") ;
  }
  
    return 0;
}