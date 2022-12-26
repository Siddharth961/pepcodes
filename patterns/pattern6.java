import java.util.*;
public class pattern6 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int r = 1; r<=n; r++){
            for(int c = 1; c<=n+2; c++){
                if(r+c<(n+5)/2){System.out.print("*\t");}
                else if(r+c>(3*n+3)/2){System.out.print("*\t");}
                else if(r-c>(n-3)/2){System.out.print("*\t");}
                else if(c-r>(n+1)/2){System.out.print("*\t");}
                else{System.out.print("\t");}
            }
            System.out.println();
        }
    }
}
