
import java.util.*;
import java.util.Arrays;


public class Binaryvalue{
    public static void main(String[] args) {
        int col=3;

        int row = 1<<col;
        int[][] grid = new int[row][col];
        for(int i=0;i<row;i++)
        {
            int num=i;
           int c=col-1;
            while(num>0)
            {
                grid[i][c--]=num%2;
                num=num/2;
            }
            System.out.println(Arrays.toString(grid[i]));
        }
    }
}
