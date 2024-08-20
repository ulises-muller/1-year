#include <stdio.h>
int main(){
    float kw; 
    float tf=2000; 
    printf("Ingrese la cantidad de KW consumidos por el usuario \n");
    scanf("%f", &kw);
    if (kw<=200){
        printf("El cliente debera pagar: %f ", tf);
    }
    else {
        kw -= 200;
        kw *= 225.5;
        float it = (kw + tf + 18999.99);
        printf("El cliente debera pagar: %f ", it);
    }
    return 0;
}