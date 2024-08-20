#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    srand(time(NULL));
    for(int i=0; i < 5; i++){
    float r0 = (float)rand() / RAND_MAX; // de 0 a 1
    float r1 = ((float)rand() / RAND_MAX) * 9; // de 0 a 9
    float r2 = (int)(((float)rand() / RAND_MAX) * 9);
    float r3 = r0  > 0.5 ? 0.5 : 0.0;
    float r4 = r2 + r3;
    printf("%f  ", r4);
    }
    return 0;
}