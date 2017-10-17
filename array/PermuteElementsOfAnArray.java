public class PermuteElementsOfAnArray
{
    public static void main(String args[])
    {
        Integer permutation[] = {3,2,1,0};
        Integer arr[] = {1,2,3,4};
        permute(permutation,arr);

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

    public static void swap(Integer arr[], int index1, int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void permute(Integer permutation[], Integer arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            int next = i;
            while(permutation[next] >= 0)
            {
                swap(arr,i,permutation[next]);
                int temp = permutation[next];
                permutation[next] -= permutation.length;
                next = temp;
            }
        }
        printArray(arr);
    }
}
