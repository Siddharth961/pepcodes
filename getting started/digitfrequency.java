import java.util.*;
public class digitfrequency {
    public static int digits(int n,int d){
        int count=0;
        while(n>0){
            int b=n%10;
            if(b==d)count++;
            n=n/10;
        }
        return count;
    }
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int d =scn.nextInt();
        int a = digits(n,d);
        System.out.print(a);
    }
    
}
