#include <stdio.h>

const int n = 9;

int main() {
		float notas[n]; 		/*DECLARO UN ARRAY DE 9 DATOS (SE CUENTA DESDE EL 0)*/ 
								/*Longitud fija, todos los datos son del mismo tipo y consecutivos en la memoria*/
			notas[0] = 7;		/*Se accede indexando (meter numero entre corchetes)*/
			notas[1] = 1;
			notas[2] = 4.5;
			notas[3] = 4;
			notas[4] = 9;
			notas[5] = 6;
			notas[6] = 2;
			notas[7] = 3.99;
			notas[8] = 8;
		
		int suma[]={0,0,0,0,0,0,0,0,0,0,0};
		
		for (int i = 0; i < n; i++) {
			suma[i] += notas[i];
		}
		
		
		printf("El promedio es %f\n", suma[1]);
		
		return 0;
}
	