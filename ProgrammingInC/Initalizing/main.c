#include <stdio.h>
#include <stdlib.h>


void printArr(int arr[]);

int main()
{
    int arr[5] = {1};
    int arrTwo[5] = {[2] = 500,[1]=100};
    int i = 0;

    printArr(arrTwo);

    return 0;
}

void printArr(int arr[]){
    int i;
    for(i = 0; i < 5; i++)
        printf("arr[%i] = %i\n",i,arr[i]);
}
