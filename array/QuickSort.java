import java.util.*;

public class QuickSort
{
    public static void main(String args[])
    {
        System.out.println("Enter Size of array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = scanner.nextInt();
        }
        quicksort(arr,0,n-1);
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

    public static void swap(int arr[], int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quicksort(int arr[], int start, int end)
    {
        if( start < end)
        {
            int partitionIndex = partition(arr,start,end);
            quicksort(arr,start,partitionIndex-1);
            quicksort(arr,partitionIndex+1,end);
        }
    }

    public static int partition(int arr[], int start, int end)
    {
        int pivot = arr[end];
        int partitionIndex = start;
        for(int i = start; i < end; i++)
        {
            if(arr[i] < pivot)
            {
                swap(arr,i,partitionIndex);
                partitionIndex++;
            }
        }
        swap(arr,partitionIndex,end);
        return partitionIndex;
    }
}
