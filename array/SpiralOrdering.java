public class SpiralOrdering
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
        printSpiral(arr);

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

    public static void printSpiral(Integer arr[][])
    {
        int kShift[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        int dir = 0;
        int row = 0;
        int col = 0;

        for(int count = 0; count < arr.length*arr[0].length;count++)
        {
            System.out.printf(arr[row][col]+" ");
            arr[row][col] = Integer.MIN_VALUE;
            int nextRow = row + kShift[dir][0];
            int nextCol = col + kShift[dir][1];
            if(nextRow < 0 || nextRow >= arr.length || nextCol < 0 || nextCol >= arr[0].length || arr[nextRow][nextCol] == Integer.MIN_VALUE)
            {
                dir = (dir+1)%4;
                nextRow = row + kShift[dir][0];
                nextCol = col + kShift[dir][1];
            }
            row = nextRow;
            col = nextCol;
        }
    }
}
