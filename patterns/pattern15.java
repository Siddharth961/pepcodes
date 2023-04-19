import java.util.*;
public class pattern15 {
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int smt =1;
        for(int r =1; r<=n; r++){
            
            int num=smt;
            for(int c =1;c<=n;c++){
                if(r+c<(n+3)/2 || r+c>(3*n+1)/2 || r-c>(n-1)/2 || c-r>(n-1)/2 ){System.out.print("\t");}
                
                else{
                    System.out.print(num+"\t");
                     if(c<(n+1)/2){
                         
                        num++;}
                     else{
                         num--;}
                    }
            }
            System.out.println();
            if(r>=(n+1)/2){smt--;}
            else{smt++;}
        }
    }
    
}
