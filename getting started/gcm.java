import java.util.*;
public class gcm {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int num1= scn.nextInt();
        int num2= scn.nextInt();
        int min = Math.min(num1,num2);
        
        // way 1
        if(num1%min==0 && num2%min==0){
            System.out.print(min);}
        else{
            for(int i= min/2; i>=0; i--){
                if(num1%i==0 && num2%i==0)
                {System.out.println(i);
                break;}
            }
        }
        //way 2
        int dividend = num1;
        int divisor = num2;
        
       while(dividend%divisor>0){
           int a = dividend%divisor;
            dividend=divisor;
            divisor = a;
            
        }
        System.out.println(divisor);


       //LCM
      int lcm = (num1*num2)/divisor;
       System.out.println(lcm);
        

    }
}
