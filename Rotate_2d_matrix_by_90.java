public class Rotate_2d_matrix_by_90 {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
//        Brute_rotate(arr);
        Optimal_Rotate(arr);
    }
    static void swap(int[][] arr, int r1, int c1, int r2, int c2){
        int temp = arr[r1][c1];
        arr[r1][c1] = arr[r2][c2];
        arr[r2][c2] = temp;
    }

    static void Brute_rotate(int[][] arr){

        int row = arr.length;
        int col = arr[0].length;

        int[][] rotated = new int[row][col];  // new matrix

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rotated[j][row-1-i] = arr[i][j];
            }
        }

        // print rotated matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(rotated[i][j] + " ");
            }
            System.out.println();
        }
    }
    static  void Optimal_Rotate(int [][]arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int i = 0; i < row - 1; i++) {
            for (int j = i + 1; j < col ; j++) {
                swap(arr, i, j, j, i);
            }
        }

        for (int i = 0; i < row; i++) {

            int left = 0;
            int right = col - 1;

            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    }

