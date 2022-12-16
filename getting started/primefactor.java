import java.util.*;
public class primefactor {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int c = num;
        for(int i = 2; i<=num; i++){
            while(c%i==0){
                c=c/i;
                System.out.print(i + " ");
               
                
            }
            if(c==1){break;}
        }
        //Way 2
        int div =2;
        System.out.println("  ");
        while(div*div<=num){
            if(num%div==0){System.out.print(div + " ");
            num=num/div;}
            else{div++;}
        }
        System.out.print(num);
        }
    
}
