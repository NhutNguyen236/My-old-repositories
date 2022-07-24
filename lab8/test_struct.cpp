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
  	return R;
}
float Arimis(int HP1, int HP2, int Q1, int Q2, int d, int arr[]){
	if(d==1000){
		return 0;
	}
	else{
	if(Q1<Q2&&d>100){
		d = 100;
		return_value(HP1,HP2,Q1,Q2,d,arr);
	}
	else
		return_value(HP1,HP2,Q1,Q2,d,arr);
	}
}
float calculate(int HP1, int HP2, int Q1, int Q2, int d){
	int arr[2];
	switch(HP1){
		case 777:
			Arimis(HP1,HP2,Q1,Q2,d,arr);
			break;
	}
  	return return_value(HP1,HP2,Q1,Q2,d,arr);
}
