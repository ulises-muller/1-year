#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int final = 0;
    int a[10];
    srand(time);
    for (int j = 0; j < 100000; j++)
    {
        for (int k = 0; k < 10; k++)
        {
            int ruleta = ((float)rand() / RAND_MAX) * 36;
            a[k] = ruleta;
        }
        for (int h = 0; h < 10; h++){
            printf(" %d ", a[h]);
        }
        for (int i = 0; i < 10; i++)
        {
            if (a[i] == 36){
                printf(" %d ", j);
                final += 1;
                printf(" %d hay %d", a[i], final);
            }
        }
    }
    float b = final / 100000;
    printf(" promedio %f", b);
    return 0;
}