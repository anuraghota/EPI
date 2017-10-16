public class BuyAndSellStockTwice
{
    public static void main(String args[])
    {
        int arr[] = {210,310,210,260,260,260,290,230,340};
        int maxProfit = getMaxProfit(arr);
        System.out.println(maxProfit);
    }

    public static void printArray(int arr[])
    {
        int size = arr.length;
        for(int i = 0; i < size; i ++)
        {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
    }

    public static int getMaxProfit(int arr[])
    {
        int maxProfit = 0;
        int firstSellProfit[] = new int[arr.length];
        int minPriceSoFar = arr[0];

        for(int i = 0; i < arr.length; i++)
        {
            int profit = arr[i] - minPriceSoFar;
            maxProfit = Math.max(maxProfit,profit);
            minPriceSoFar = Math.min(minPriceSoFar,arr[i]);
            firstSellProfit[i] = maxProfit;
        }
        printArray(firstSellProfit);

        maxProfit = 0;
        int maxPriceSoFar = arr[arr.length-1];

        for(int i = arr.length-1; i > 0; i--)
        {
            maxPriceSoFar = Math.max(maxPriceSoFar,arr[i]);
            int profit = maxPriceSoFar - arr[i] + firstSellProfit[i-1];
            maxProfit = Math.max(maxProfit,profit);
        }

        return maxProfit;
    }
}
