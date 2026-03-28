public class Set_matrix_zero {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1,1},
                {1, 0, 1,1},
                {1, 1, 0,1},
                {0, 1, 1,1}
        };
//        Mark_zero(arr);
        Optimal_Mark_zero(arr);
    }

    static void Mark_zero(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Step 1: Mark -1
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    Markrow(arr, i);
                    Markcol(arr, j);
                }
            }
        }

        // Step 2: Convert -1 to 0
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == -1) {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void Markrow(int[][] arr, int row) {
        for (int j = 0; j < arr[0].length; j++) {
            if (arr[row][j] != 0) {
                arr[row][j] = -1;
            }
        }
    }

    static void Markcol(int[][] arr, int col) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][col] != 0) {
                arr[i][col] = -1;
            }
        }
    }

    static void Optimal_Mark_zero(int[][]arr){
        int col0=1 ;
        int n= arr.length;
        int m=arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    //mark ith row
                    if(j!=0){
                        arr[0][j]=0;
                    }

                    else{
                        col0=0;
                    }
                }


            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if(arr[i][j]!=0){
                    //check their row n col indexes
                    if(arr[0][j] ==0|| arr[i][0]==0){
                        arr[i][j]=0;
                    }
                }
            }
        }
        if(arr[0][0]==0){
            for (int j = 0; j < m; j++) {
                arr[0][j]=0;
            }
        }
        if(col0==0){
            for (int i = 0; i < n; i++) {
                arr[i][0]=0;
            }
        }

        //print matrix:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}