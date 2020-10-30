import static java.lang.System.exit;
import java.util.Scanner;
public class SortArray{
    public static void main(String[] args){
        
        Scanner in  = new Scanner(System.in);
        
        System.out.print("Input size:");
        int size = in.nextInt();
        
        String[] intArray = new String[size];
        System.out.print("Enter your array:");
        for(int i=0;i<size;i++){
            intArray[i] = in.next();
        }
        double[] doubleArray = new double[size]; 
        //double sum = 0;
        for (int i=0; i < size; i++) { 
            doubleArray[i] = Double.parseDouble(intArray[i]); 
        }
        
        double sum = 0;
        for(int i=0;i<size;i++){
            sum+= doubleArray[i];
        }
        System.out.print("Sum of array: " +sum);
        
        double temp = 0;  
        for(int i=0; i < size; i++){  
            for(int j=1; j < (size-i); j++){  
                if(doubleArray[j-1] > doubleArray[j]){  
                    //swap elements  
                    temp = doubleArray[j-1];  
                    doubleArray[j-1] = doubleArray[j];  
                    doubleArray[j] = temp;  
                }       
            } 
        }
        System.out.print("\n");
        System.out.print("Sorted Array: ");
        for(int i=0;i<size;i++){
            System.out.print(doubleArray[i] + " ");
        }
        
        System.out.print("\n");
        System.out.print("Insert number that you need to find: ");
        String findElement = in.next();
        double doubleElement = Double.parseDouble(findElement);
        System.out.print("\n");
        //System.out.print(doubleElement);
        for(int i=0;i<size;i++){
            if(doubleArray[i]== doubleElement){
                System.out.print("Yes we have that number");
                exit(0);
            }
            else{
                System.out.print("No we don't have that");
                exit(0);
            }
        }
    }
}//NhutNguyen