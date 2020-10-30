import java.util.*;
public class Ex1_Ex2 {
    public static void print_dot(){
        Scanner input = new Scanner(System.in);
        int num_of_dot;
        System.out.print("Enter number of dots here: ");
        num_of_dot = input.nextInt();
        for(int i=0;i<num_of_dot;i++){
            for(int j=0;j<num_of_dot;j++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
    public static void CozaLozaWoza(){
        Scanner input = new Scanner(System.in);
        int low, up;
        System.out.print("Enter lower and upperbound: ");
        low = input.nextInt();
        up = input.nextInt();
        boolean flag;
        for(int i=low;i<=up;i++){
           flag = false; 
           if(i%3==0){
               System.out.print("Coza ");
               flag = true;
           }
           if(i%5==0){
               System.out.print("Loza ");
               flag = true;
           }
           if(i%3==0 && i%5==0){
               System.out.print("CozaLoza ");
               flag = true;
           }
           if(i%7==0){
               System.out.print("Woza ");
               flag = true;
           }
           if(flag==false){
               System.out.print(i+" ");
           }
           if(i%11==0){
               System.out.print("\n");
           }
        }
    } 
    public static void main(String[] args) {
        print_dot();
        CozaLozaWoza();
        // TODO code application logic here
    }
}
