import java.util.*;
public class pattern10 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int r =1; r<=n; r++){
            for(int c = 1; c<=n; c++){
                if(r+c==(n+3)/2 || r+c==(3*n+1)/2 || r-c==(n-1)/2 || c-r==(n-1)/2){System.out.print("*\t");}
                else{System.out.print("\t");}
            }
            System.out.println();
            
        
        }
    }
}
