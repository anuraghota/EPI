
import java.util.Arrays;

public class NaiveGeneratePrimes
{
    public static void main(String args[])
    {
        int n = 27;
        generatePrimes(n);

    }

    public static <T> void printArray(T arr[])
    {
        int size = arr.length;
        for(int i = 0; i < size; i ++)
        {
            System.out.printf(arr[i]+" ");
        }
        System.out.println();
    }

    public static void generatePrimes(int n)
    {
        Boolean arr[] = new Boolean[n+1];
        Arrays.fill(arr,true);
        arr[0] = arr[1] = false;

        for(int i = 2; i <= n; i++)
        {
            if(arr[i] == true)
            {
                for(int j = 2*i; j <= n; j=j+i)
                {
                    arr[j] = false;
                }
            }
        }
        printArray(arr);
    }
}
