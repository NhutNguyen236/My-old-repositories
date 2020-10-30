/*
which prompts user for a String (case insensitive), and converts 
to a sequence of keypad digits. Use a nested-if (or switch-case) 
in this exercise.
 */
import java.util.Scanner;
public class PhoneKeyPad {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String str;
        System.out.print("Please input a string: ");
        str = in.nextLine();
        String new_str = str.toLowerCase();
        String no_sp = new_str.replaceAll("\\s+", "_");
        System.out.println(no_sp);
        for(int i=0;i<no_sp.length();i++){
            switch(no_sp.charAt(i)){
                case 'a': case 'b': case 'c': System.out.print('2'); break;
                case 'd': case 'e': case 'f': System.out.print('3'); break;
                case 'g': case 'h': case 'i': System.out.print('4'); break;
                case 'j': case 'k': case 'l': System.out.print('5'); break;
                case 'm': case 'n': case 'o': System.out.print('6'); break;
                case 'p': case 'q': case 'r': case 's': System.out.print('7'); break;
                case 't': case 'v': case 'u': System.out.print('8'); break;
                case 'w': case 'x': case 'y': case 'z': System.out.print('9'); break;
                case '_': System.out.print('0'); break;
            }
        }
        System.out.print("\n");
    }
}