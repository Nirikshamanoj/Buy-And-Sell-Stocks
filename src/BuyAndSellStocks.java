import java.util.Scanner;
public class BuyAndSellStocks {
    static void findProfit(int A[],int n)
    {
        int min =Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<n;i++)
        {
           if(min>A[i])
           {
               min=A[i];
               j=i;
           }
        }
        for(int i=j;i<n;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println(max-min);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] A=new int[n];
        for (int i=0;i<n;i++)
        {
            A[i]=scanner.nextInt();
        }
        findProfit(A,n);
    }
}
