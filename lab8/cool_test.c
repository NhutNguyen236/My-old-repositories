#include <stdio.h> 
  
// Store the greater element at 0th index 
void findGreaterSmaller(int a, int b, float arr[]) 
{ 
  
    // Store the greater element at 
    // 0th index of the array 
    if (a > b) { 
        arr[0] = a; 
        arr[1] = b; 
    } 
    else { 
        arr[0] = b; 
        arr[1] = a; 
    } 
} 
  
// Driver code 
int main() 
{ 
    int x, y; 
    float arr[2]; 
  
    printf("Enter two numbers: \n"); 
    scanf("%d%d", &x, &y); 
  
    findGreaterSmaller(x, y, arr); 
  
    printf("\nThe greater number is %d and the"
           "smaller number is %d", 
           arr[0], arr[1]); 
  
    return 0; 
} 
