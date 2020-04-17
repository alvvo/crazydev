public class MethodsForSolvingMatrices {
    public static int matrixDeterminant(Matrix matrix){
        int determinant = 0;
        if (matrix.getColumn() == matrix.getLine()){
            if ((matrix.getLine() == 2) && (matrix.getColumn() == 2)){
                determinant = SquareDeterminant(matrix);
            }
            else if ((matrix.getLine() == 3) && (matrix.getColumn() == 3)){
                determinant = theDeterminantOfTheMatrixOfTheThirdOrder(matrix);
            }
            else{

            }
        }
        else if (matrix.getColumn() > matrix.getLine()){

        }
        else {

        }
        return determinant;
    }
    public static int SquareDeterminant(Matrix matrix){
        int[][] arr = matrix.getData();
        int determinant = (arr[0][0] * arr[1][1]) - (arr[1][0] * arr[0][1]);
        return determinant;
    }
    public static int theDeterminantOfTheMatrixOfTheThirdOrder(Matrix matrix){
        int[][] arr = matrix.getData();
        int firstDiagonal = ((arr[0][0] * arr[1][1] * arr[2][2]) + (arr[0][2] * arr[1][0] * arr[2][1]) + (arr[2][0] * arr[0][1] * arr[1][2]));
        int secondDiagonal = ((arr[0][2] * arr[1][1] * arr[2][0]) + (arr[0][0] * arr[2][1] * arr[1][2]) + (arr[2][2] * arr[1][0] * arr[0][1]));
        int determinant = firstDiagonal - secondDiagonal;
        return determinant;
    }
}
