#include <stdio.h>
#include <stdlib.h>

int main()
{
    int i;
    int number;
    scanf("%i",&number);

    for(i = 2; i <= number/2; ++i){
        printf("%i\n",i);
        if(number%i==0){
            printf("number is not prime");
           // break;
        }

    }

    return 0;
}
