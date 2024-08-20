#include <stdio.h> //printf
#include <stdlib.h> //srand, rand
#include <time.h> //time

int main() { 
	
	srand(time(NULL));
	int a[10];
	for(int i = 0; i < 10; i++){
		int ruleta = ((float) rand() / (float) RAND_MAX) * 36;
		a[i] = ruleta;
	}
	for(int j = 0; j < 10; j++) {
		for(int i = 0; i < 10 - 1; i++) {
			if (a[i + 1] < a[i]) {
				int aux = a[i];
				a[i] = a[i + 1];
				a[i + 1] = aux;
			}
		}
	}	
	for (int i = 0; i < 10; i++) {
		printf("a[%d]: %d\n", i, a[i]);
	}
	return 0;
}