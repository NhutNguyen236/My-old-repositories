#include <stdio.h>
float standard_calculate(int *a, int *b){
	if(*a>1&&*b>5){
		*a = 0.2;
		*b = 0.5;
	}
	else{
		*a = *b = 0.5;
	}
}
float standard_calculate_output(int a, int b){
	standard_calculate(&a,&b);
	return a + b;
}
int main()
{
	int a,b;
	scanf("%d%d",&a,&b);
	standard_calculate(&a,&b);
	printf("%.2f",standard_calculate_output(a,b));
	return 0;
}
