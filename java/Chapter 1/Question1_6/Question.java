package Question1_6;

public class Question {
    //try use-case with 4x4 to draw conclusions
    public void rotate(int[][] matrix) {
        
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = i; j < matrix.length - 1 - i; j++) {
            
                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
            }
        }
    }
}
