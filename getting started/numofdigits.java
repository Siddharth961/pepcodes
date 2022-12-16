import java.util.*;
public class numofdigits {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int digits = 0;
        int c = num;
        
        while(c>0){
            c = c/10;
            digits++;
        }
        System.out.print(digits);
        
        
    }
    
}
