import java.util.*;
public class primeinbw {
    public static void main(String[]args)
    {
        Scanner scn = new Scanner(System.in);
        int l1 = scn.nextInt();
        int u1 = scn.nextInt();
        System.out.println(l1);
        System.out.println(u1);
        
        while(l1<=u1)
        {
            boolean prime = true;
            for(int div=2; div*div<=l1; div++)
            {
                if(l1%div>0)
                {
                    prime = false;
                    break;
                }
            }
            if(prime==true){System.out.println(l1);}
            l1++;
        }

    }
}
