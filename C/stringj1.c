//Hacer una función que tome un string y cuente la cantidad de veces que aparece la letra 'e'.

#include <stdio.h>
#include <string.h>

int main(){
    int cantidad=0;
    char *palabra = "heladoeee";
     printf("%S", palabra);
     for(int i = 0; i < strlen(palabra); i++){
        printf("palabra[%d] = %c\n", i, palabra[i]);
        if(palabra[i] == 'e') {
            cantidad += 1;
        } if(palabra[i] == 'E'){
            cantidad += 1;
        }
    }
    if(cantidad>3){
        printf("fua wacho hay muchas E's");
    } else
    printf("hay %d e", cantidad);
}