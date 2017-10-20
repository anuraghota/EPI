import java.util.Scanner;

public class PascalsTriangle
{
    public static void main(String args[])
    {
        System.out.println("Enter no. of rows:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = generatePascalsTriangle(n);
        printArray(arr);
        scanner.close();
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

    public static int[] generatePascalsTriangle(int n)
    {
        int arr[] = new int[n*(n+1)/2];
        arr[0] = 1;
        int count = 1;
        for(int i = 1; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                if(j == 0 || j == i)
                {
                    arr[count] = 1;

                }
                else
                {
                    arr[count] = arr[count-i-1] + arr[count-i];
                }
                count++;
            }
        }
        return arr;
    }

}
