import java.util.*;
public class inverse 
{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ans=0;
        int a=0;
        while(num!=0){
            a++;
            int b = (num%10)-1;
            ans = ans + a * (int)(Math.pow(10,b));
            num = num/10;
        }
        System.out.print(ans);
    }
    
}
