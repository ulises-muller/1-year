#include <stdio.h>
int main() {
    float x;
    float z;
    printf("Poner coords del overword\n pone x\n");
    scanf("%f", &x);
    printf(" pone z\n");
    scanf("%f", &z);
    float x2 = x/8;
    float z2 = z/8;
    printf("Coord x : %f y : %f\n", x2, z2);
    system("pause");
}