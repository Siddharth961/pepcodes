import java.util.*;
public class pattern3 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 1; i<=n; i++){
            int c = n-i;
            while(c!=0){
                System.out.print(" ");
                c--;
            }
            int a =i;
            while(a!=0){
                System.out.print("*");
                a--;
            }
            System.out.println();
        }
        for(int r =1; r<=n; r++){
            for(int c = 1; c<=n; c++){
                if(r+c>=n+1){System.out.print("*");}
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
    
}
