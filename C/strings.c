#include <stdio.h>
#include <string.h>

int main(){
    char *palabra = "casa";
     printf("%S", palabra);
     for(int i = 0; i < strlen(palabra); i++){
        printf("palabra[%d] = %d\n", i, palabra[i]);
    }
    char *frase = "cristina";
     printf("%s", frase);
     for(int i = 0; i < strlen(frase); i++){
        printf("palabra[%d] = %c\n", i, frase[i]);
    }
    char letra = 'a';
    printf("letra = %c y el numero es: %d\n", letra, letra);

}
/*int main(){
for (int i=0; i<128;i++){
    printf("%c \n", i);
}
}*/
