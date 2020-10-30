import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckVowelsDigits {
    public static void main(String args[]){
        
        String str = "Harry Potter1254", new_str;
        new_str = str.replaceAll("\\s", "");
        int str_len = new_str.length();
        System.out.println("String is: " + new_str);
        System.out.println("String length: " + str_len);
        int vow_num = 0,digit_num=0;
        
        
        if(str_len!=0){
            Pattern vowelPattern = Pattern.compile("[aeiou]");
            Matcher vowelMatcher = vowelPattern.matcher(new_str);
            Pattern digit = Pattern.compile("[0-9]");
            Matcher digit_matcher = digit.matcher(new_str);
            while (vowelMatcher.find()) 
                vow_num++;
            while (digit_matcher.find())
                digit_num++;
        }
        
        
        double vow_per = vow_num*100 / str_len, digit_per = digit_num*100 / str_len;
        
        System.out.println("Number of vowels: " + vow_num + " (" + vow_per + "%" + ")");
        System.out.print("Number of digits: " + digit_num + " (" + digit_per + "%" + ")");
    }
}