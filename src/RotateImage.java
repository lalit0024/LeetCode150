import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
       int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       int[][] rotateMatrix = new int[matrix.length][matrix[0].length];
        int n = matrix.length-1;
       for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[i].length; j++) {
               rotateMatrix[j][n-i] = matrix[i][j];
           }
       }

        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(rotateMatrix));
    }
}
