#include <stdio.h>

const int n = 3;

int main() {
		float notas[n]; 
			for (int k = 0; k < n; k++) {
				printf("Ingresa la nota[%d]: \n", k);
				scanf("%f",&notas[k]);
			}
		float suma = 0;
		
		for (int i = 0; i < n; i++) {
			suma += notas[i];
		}
		
		float prom = suma / n;
		
		printf("El promedio es %f\n", prom);
		
		return 0;
}