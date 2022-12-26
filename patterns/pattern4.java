import java.util.*;
public class pattern4 {

    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        for(int r = 1; r<=n; r++){
            for(int c=1; c<=n; c++){
                if(r<=c){
                    System.out.print("*");    
                }
                else{System.out.print(" ");}
            }
            System.out.println();
        }
    }
}
