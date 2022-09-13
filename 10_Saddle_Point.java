import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elements: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int min_row =-1,max_col=-2,temp_col=0;
        for(int i=0;i<arr.length;i++)
        {
            min_row = arr[i][0];
            for(int j=0;j<arr[i].length;j++)
            {
                if(arr[i][j] < min_row)
                {
                    min_row = arr[i][j];
                    temp_col = j;
                }
            }
            for(int k=0;k<arr.length;k++)
            {
                max_col = arr[0][temp_col];
                if(arr[k][temp_col] > max_col)
                {
                    max_col = arr[k][temp_col];
                }         
            }
            if(min_row == max_col)
                System.out.println("Saddle point" + min_row + max_col);
        }
    }
}
