
#include <stdio.h>

void transposeMatrix(int a[4][5], int b[5][4]);

void
transposeMatrix(int a[4][5], int b[5][4])
{
        int row, column;

        for (row = 0; row < 4; ++row)
                for (column = 0; column < 5; ++column)
                        a[row][column] = b[column][row];
}

int
main(void)
{
        int a, b;
        int array1[4][5] = { {1, 2, 3, 4, 5},
                         	     {1, 2, 3, 4, 5},
                            	     {1, 2, 3, 4, 5},
                            	     {1, 2, 3, 4, 5} };

        int array2[5][4] = {0};

        printf("Matrix before transposal:\n");
        for (a = 0; a < 4; ++a) {
                for (b = 0; b < 5; ++b)
                        printf("%5i", array1[a][b]);
                printf("\n");
        }

        transposeMatrix(array1, array2);

        printf("Matrix after transposal:\n");
        for (a = 0; a < 5; ++a) {
                for (b = 0; b < 4; ++b)
                        printf("%5i", array2[a][b]);
                printf("\n");
        }
        return 0;
}
