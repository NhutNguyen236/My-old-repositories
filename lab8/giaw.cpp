 #include <stdio.h> 
float findGreaterSmaller(int HP1, int HP2, int Q1, int Q2, int d, int arr[]) 
{ 
  	float p1, p2;
	if(Q1>1.5*Q2&&d<=300){
    	p1 = HP1 + (Q1-Q2)*d/Q1;
      	p2 = HP2;
    }
  	else{
    	if(Q2>1.5*Q1&&d>=700){
        	p1 = HP1;
          	p2 = HP2 + (Q2-Q1)*(1000-d)/Q2;
        }
      	else{
        	p1 = HP1;
          	p2 = HP2;
        }
    }
  	arr[0] = p1;
  	arr[1] = p2;
}
float return_value(int HP1, int HP2, int Q1, int Q2, int d, int arr[]){
	float h, R;
  	h = (HP1+HP2)%100;
  	findGreaterSmaller(HP1,HP2,Q1,Q2,d,arr);
  	R = (arr[0]+h-arr[1])/(arr[0]+arr[1]);
  	return 1;
}
float calculate(int HP1, int HP2, int Q1, int Q2, int d){
	int arr[2];
  	return return_value(HP1,HP2,Q1,Q2,d,arr);
}
int main() 
{ 
	int HP1,HP2,Q1,Q2,d;  

	printf("\nThe greater number is %.2f", 
		calculate(467,144,100,100,102)); 

	return 0; 
} 

