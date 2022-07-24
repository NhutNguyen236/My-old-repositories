// Modified program using structures 
#include <stdio.h> 
struct greaterSmaller { 
	float P1, P2; 
}; 

typedef struct greaterSmaller Struct; 

Struct findGreaterSmaller(int hp1, int hp2, int q1, int q2, int d) 
{ 
  	float p1, p2;
	Struct s; 
	if (q1>1.5*q2&&d<=300) 
    { 
		p1 = hp1; 
		p2 = hp2; 
	} 
	else { 
		p1 = hp2; 
		p2 = hp1; 
	} 
	s.P1 = p1;
  	s.P2 = p2;
	return s; 
} 

// Driver code 
int main() 
{ 
	 
	Struct result; 

	 

	// The last two arguments are passed 
	// by giving addresses of memory locations 
	result = findGreaterSmaller(467,144,100,100,102); 
	printf("\nThe greater number is %f and the"
		"smaller number is %f", 
		result.P1, result.P2); 

	return 0; 
} 

