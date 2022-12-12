import java.util.*;
public class fubucanni {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int l1 = scn.nextInt();
        int l2 = scn.nextInt();
        
        for(int i = 0; i<num; i++ )
        {
            int c= l1 + l2;
            System.out.println(l1);
            l1=l2;
            l2=c;

        }
    }

    
}
