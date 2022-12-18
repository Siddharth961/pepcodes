import java.util.*;
public class rotate {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt();
        int c =num ;
        int dig =1;
        while(c>=10){
            c=c/10;
            dig++;
        }
        k= k%dig;
        if(k<0){k=dig+k;}
        while(k!=0){
            int a = num%10;
            System.out.print(a);
            num=num/10;
            k--;
        }
        System.out.print(num);

    }
    
}
