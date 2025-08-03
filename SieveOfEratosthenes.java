import java.util.*;

public class SieveOfEratosthenes {
    public static List<Integer> SummonPrimes(int n){
        int[] Array = new int[n+1];
        Array[2] = 2;
        for(int p = 3; p <= n; p+=2){
            Array[p] = p;
        }
        for(int p = 3; p*p <= n;p+=2){
            if(Array[p] != 0){
                int j = p*p;
                while(j<=n){
                    Array[j] = 0;
                    j += 2*p;
                }
            }
        }
        List<Integer> L = new ArrayList<>();
        if (n>=2) L.add(2);
        for(int p = 3; p<=n; p+=2){
            if(Array[p] != 0){
                L.add(Array[p]);

            }
        }
        return L;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NUMEROS:");
        int n = sc.nextInt();
        sc.close();
        long t1 = System.nanoTime();
        List<Integer> primes = SummonPrimes(n);
        long t2 = System.nanoTime();
        System.out.println(primes);
        System.out.println("TIME ANALYSIS : "+ (t2 - t1)/1_000_000.0+"ms");
    }
}

