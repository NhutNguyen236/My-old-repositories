// Modified program using structures 
#include <stdio.h> 
struct greaterSmaller { 
	int P1, P2; 
}; 

typedef struct greaterSmaller Struct; 

Struct findGreaterSmaller(int HP1, int HP2, int Q1, int Q2, int d) 
{ 
	Struct s; 
	float P1, P2;
	if(Q1>1.5*Q2&&d<=300)
	{
		P1 = HP1 + ((Q1-Q2)*d)/Q1;
		P2 = HP2;
	}
	else
	{
		if(Q2>1.5*Q1&&d>=700)
		{
			P1 = HP1;
			P2 = HP2 + (Q2-Q1)*(1000-d)/Q2;
		}
		else
		{
			P1 = HP1;
			P2 = HP2;
		}
	}
	s.P1 = P1;
	s.P2 = P2;
	return s; 
} 

// Driver code 
int main() 
{ 
	int HP1,HP2,Q1,Q2,d; 
	Struct result; 

	printf("Enter 5 numbers: \n"); 
	scanf("%d%d%d%d%d", &HP1, &HP2, &Q1, &Q2, &d); 

	// The last two arguments are passed 
	// by giving addresses of memory locations 
	result = findGreaterSmaller(HP1,HP2,Q1,Q2,d); 
	printf("\nThe greater number is %f and the"
		"smaller number is %f", 
		result.P1, result.P2); 

	return 0; 
} 

