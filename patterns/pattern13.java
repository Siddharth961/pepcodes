import java.util.*;
public class pattern13 {
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int r = 0; r<n; r++){
            for(int c=0; c<=r; c++){
                int a=1;
                for(int i = r; i>=1; i--){
                    a=a*i;
                }
                int b=1;
                
                for(int i = c; i>=1; i--){
                    b=b*i;
                }
                int d=1;
                for(int i = r-c; i>=1; i--){
                    d=d*i;
                 }
               int e = a/(b*d);
               System.out.print(e);
            }
            System.out.println();
        }
        //WAY 2
        for(int r=0;r<n;r++){
            int val=1;
            for(int c=0; c<=r;c++){
                System.out.print(val);
                val=val*(r-c)/(c+1);
            }
        System.out.println();
    }
        
    }
    
}
