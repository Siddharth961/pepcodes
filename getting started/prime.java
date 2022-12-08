import java.util.*;
public class prime{
    public static void main(String[]args)
    {
        Scanner scn= new Scanner(System.in);
        int t= scn.nextInt();
        for(int i=0; i<t; i++)
        {
            int factor=2;
            int num= scn.nextInt();
            for(int div=2; div*div<= num; div++)
            {
                if(num%div==0){factor++;
                }
            }
            if(factor==2){System.out.println("prime");}
            else{System.out.println("not prime");}
        }
    }
}