#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{

    int a[10];
    srand(time);
    for (int i = 0; i < 10; i++)
    {
        int ruleta = ((float) rand() / RAND_MAX) * 36;
        a[i] = ruleta;
    }
    for (int i = 0; i < 10; i++)
    {
        printf(" %d ", a[i]);
    }
    return 0;
}