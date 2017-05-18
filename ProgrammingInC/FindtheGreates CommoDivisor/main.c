#include <stdio.h>
void gcd (int u, int v){
    int temp;

    while ( v != 0 ) {
        temp = u % v;
        printf("temp: %i\n",temp);
        u = v;
        v = temp;
    }
    printf ("%i\n", u);
}
int main (void){
    gcd (15, 20);
    //gcd (1026, 405);
    //gcd (83, 240);
    return 0;
}
