import java.util.*;
public class pattern12 {
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int a=0;
        int b = 1;
        for(int r=1; r<=n; r++){
            for(int c =1;c<=r;c++){
                int d = a+b;
                System.out.print(a);
                System.out.print(" ");
                a=b;
                b=d;
            }
            System.out.println();
                }
    }
    
}
