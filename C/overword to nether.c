#include <stdio.h>
int main() {
    float x;
    float z;
    printf("Poner coords del overword\n pone x\n");
    scanf("%f", &x);
    printf("Pone z\n");
    scanf("%f", &z);
    float x2 = x/8;
    float z2 = z/8;
    printf("Coord x : %f y : %f", x2, z2);
    return 0;
}