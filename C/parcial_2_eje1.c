#include <stdio.h>
#include <string.h>

int main(){
    float precios[] = {4299.09, 400, 500.55, 150, 5002, 10, 67, 1003, 250, 11};
    char *productos[] =
        {"cif", "blen", "aquarius", "coca", "agua", "pintura", "jorgito", "gel", "celu", "teclado"};
    int h = 10;
   for (int j = 0; j < h; j++){
        for (int i = 0; i < h - 1; i++){
            if (precios[i + 1] < precios[i]){
                float aux = precios[i];
                precios[i] = precios[i + 1];
                precios[i + 1] = aux;

                char *aux1 = productos[i];
                productos[i] = productos[i + 1];
                productos[i + 1] = aux1;
            }
        }
    }
    printf("lista \n");
    for(int i=0; i < h; i++){
        printf("%f %s\n", precios[i], productos[i] );
    }
}