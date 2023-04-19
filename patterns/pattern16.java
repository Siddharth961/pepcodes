import java.util.*;
public class pattern16 {
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int r =1; r<=n; r++){
            int val=1;
            for(int c=1; c<=2*n-1;c++){
                if(r>=c){
                    System.out.print(val+"\t");
                val++;}
                else if(r+c>=2*n){
                    if(r==n&&c==n+1)val--;
                    val--;
                System.out.print(val +"\t");}
                else{System.out.print("\t");}
            }
            System.out.println();
        }

    }
    
}
