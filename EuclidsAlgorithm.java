import java.util.*;
public class EuclidsAlgorithm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\n ENTER THE FIRST DIGIT: ");
        int n = sc.nextInt();
        System.out.print("\n ENTER THE SECOND DIGIT: ");
        int m = sc.nextInt();
        sc.close();
        long t1  = System.nanoTime();
        gcd(n,m);
        long t2  = System.nanoTime();
        System.out.println("\n TIME ANALYSIS: "+ (t2-t1)/1000000+"ms");

    }
    public static void gcd(int n , int m){

        if(m==0 && n==0){
            System.out.print("\n NOT DEFINED YOU SLUMMY, GET OUT AND ENTER REAL ONE.");
        }
        else{
            m = Math.abs(m);
            n = Math.abs(n);
            while(n != 0){
                int r = m % n ;
                m = n;
                n = r;
            }
            System.out.print("\n THE GCD IS : "+ m);
        }
    }
}

