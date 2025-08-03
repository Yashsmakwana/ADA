import java.util.*;
class Items implements Comparable<Items> {
    int profit, weight;
    double ratio;
    Items(int profit, int weight){
        this.profit = profit;
        this.weight = weight;
        this.ratio = (double) profit / weight;
    }
    public int compareTo(Items o){
        return Double.compare(o.ratio,this.ratio); //descending
    }
}
public class Knapsack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements for sack:");
        int n = sc.nextInt();
        System.out.println("Enter the capacity of the sack:");
        int capacity = sc.nextInt();
        Items[] items = new Items[n];
        int[] profit = new int[n];
        int[] weight = new int[n];
        for (int i = 0; i<n;i++){
            System.out.println("Enter the profit and weight by index "+(i+1)+(":"));
            profit[i] = sc.nextInt();
            weight[i] = sc.nextInt();
            items[i] = new Items(profit[i],weight[i]);
        }
        Arrays.sort(items);
        long[] Portion = new long[n];
        double Countprofit = 0;
        int Countcapacity = capacity;
        for (int i =0 ; i<n && Countcapacity >0 ; i++){
            if(items[i].weight <= Countcapacity){
                Countprofit += items[i].profit;
                Countcapacity -= items[i].weight;
                Portion[i] = 1;
            }
            else{
                Portion[i] = Countcapacity / capacity;
                Countprofit += items[i].ratio * Countcapacity;
                Countcapacity =0;
            }
        }
        sc.close();
        System.out.println("\nThe Max profit "+Countprofit);
        for(int i = 0; i<n; i++){
            System.out.println("Index of Item: "+(i+1));
            System.out.println(" Profit: "+items[i].profit);
            System.out.println(" Weight: "+items[i].weight);
            System.out.println(" Portion used: "+Portion[i]);
        }
    }
}

