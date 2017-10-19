public class RotateClockwise
{
    public static void main(String args[])
    {
        Integer arr[][] = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}};
        printArray(arr);
        rotateClockwise(arr);
        printArray(arr);

    }

    public static <T> void printArray(T arr[][])
    {
        for(int i = 0; i < arr.length; i ++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.printf(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void rotateClockwise(Integer arr[][])
    {
        int size = arr.length;

        for(int i = 0; i < size/2; i++)
        {
            for(int j = i; j < size-i-1;j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][size-i-1];
                arr[j][size-i-1] = arr[size-i-1][size-j-1];
                arr[size-i-1][size-j-1] = arr[size-j-1][i];
                arr[size-j-1][i] = temp;
            }
        }
    }
}
