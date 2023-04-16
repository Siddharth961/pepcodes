import java.util.*;
public class pattern11 {
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int count=0;
        for(int r=1; r<=n; r++){
            for(int c =1;c<=n;c++){
                if(c<=r){count++;
                System.out.print(count);
                System.out.print(" ");}
                else{System.out.print(" ");}
            }
            System.out.println();
                }
    }
    
}
