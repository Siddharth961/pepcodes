import java.util.*;
public class pattern5 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spc=n/2;
        int str=1;          
        for(int r= 1; r<=n; r++){
            
                for(int i =1;i<=spc;i++){
                    System.out.print("\t");
                }
                for(int i= 1; i<=str; i++){
                    System.out.print("*\t");
                }
                System.out.println();
                if(r<=n/2){spc--;
                str+=2;}
                else if(r>n/2){str-=2;
                spc++;}
            
        }

        //WAY 2
        for(int r = 1; r<=n; r++){
            for(int c = 1; c<=n; c++){
                if(r+c<(n+3)/2){System.out.print("\t");}
                else if(r+c>(3*n+1)/2){System.out.print("\t");}
                else if(r-c>(n-1)/2){System.out.print("\t");}
                else if(c-r>(n-1)/2){System.out.print("\t");}
                else{System.out.print("*\t");}
            }
            System.out.println();
        }




    }
    
}
