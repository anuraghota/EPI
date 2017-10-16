public class BuyAndSellStockOnce
{
    public static void main(String args[])
    {
        int arr[] = {310,310,275,260,260,260,290,230,230};
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
        int minPriceSoFar = arr[0];

        for(int i = 1; i < arr.length; i++)
        {
            int profit = arr[i] - minPriceSoFar;
            maxProfit = Math.max(profit,maxProfit);
            minPriceSoFar = Math.min(minPriceSoFar,arr[i]);
        }

        return maxProfit;
    }
}
