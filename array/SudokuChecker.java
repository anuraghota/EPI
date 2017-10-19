import java.util.Arrays;

public class SudokuChecker
{
    public static void main(String args[])
    {
        Integer sudoku[][] = {
                {5,3,0,0,7,0,0,0,0},
                {6,0,0,1,9,5,0,0,0},
                {0,9,8,0,0,0,0,6,0},
                {8,0,0,0,6,0,0,0,3},
                {4,0,0,8,0,3,0,0,1},
                {7,0,0,0,2,0,0,0,6},
                {0,6,0,0,0,0,2,8,0},
                {0,0,0,4,1,9,0,0,5},
                {0,0,0,0,8,0,0,7,9}};
        printArray(sudoku);
        System.out.println(checkSudoku(sudoku));

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

    public static boolean checkSudoku(Integer sudoku[][])
    {
        //Check region
        int regionSize = (int)Math.sqrt(sudoku.length);

        for(int i = 0; i < regionSize; i++)
        {
            for(int j = 0; j < regionSize; j++)
            {
                if(hasDuplicate(sudoku,regionSize*i,regionSize*(i+1)-1,regionSize*j,regionSize*(j+1)-1) == true)
                {
                    return false;
                }
            }
        }


        //Check column
        for(int col = 0; col < sudoku.length; col++)
        {
            if(hasDuplicate(sudoku,0,sudoku.length-1,col,col) == true)
            {
                return false;
            }
        }



        //Check row
        for(int row = 0; row < sudoku.length; row++)
        {
            if(hasDuplicate(sudoku,row,row,0,sudoku.length-1) == true)
            {
                return false;
            }
        }


        return true;
    }

    public static boolean hasDuplicate(Integer arr[][], int startRow, int endRow, int startCol, int endCol)
    {
        boolean duplicateArray[] = new boolean[10];
        Arrays.fill(duplicateArray,false);
        for(int i = startRow; i <= endRow; i++)
        {
            for(int j = startCol; j <= endCol; j++)
            {
                if(arr[i][j] != 0 && duplicateArray[arr[i][j]] == true)
                {
                    return true;
                }
                duplicateArray[arr[i][j]] = true;
            }
        }
        return false;
    }
}
