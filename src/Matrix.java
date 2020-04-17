import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    private int line;
    private int column;
    // Двумерный массив всех ячеек матрицы
    private int[][] data;

    public Matrix() {
        line = 0;
        column = 0;
    }

    public Matrix(int line, int column) {
        this.line = line;
        this.column = column;
    }

    public void setLine(int line) {
        this.line = line;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public void setData() {
        this.data = MethodsLibrary.fillingInTheMatrix(line, column);
    }

    public int getColumn() {
        return this.column;
    }

    public int getLine() {
        return this.line;
    }

    public int[][] getData() {
        return data;
    }

    public void determinant(Matrix matrix) {
        int determinant = 0;
        if (matrix.getColumn() == matrix.getLine()){
            if ((matrix.getLine() == 2) && (matrix.getColumn() == 2)){
                determinant = MethodsLibrary.SquareDeterminant(matrix);
                System.out.print("Определитель матрицы = ");
                System.out.println(determinant);
            }
            else if ((matrix.getLine() == 3) && (matrix.getColumn() == 3)){
                determinant = MethodsLibrary.thirdDeterminant(matrix);
                System.out.print("Определитель матрицы = ");
                System.out.println(determinant);
            }
            else{
                System.out.println("Матрицы данного размера пока не поддерживаются, введите квадратную матрицу.");
            }
        }
        else {
            System.out.println("Прямоугольные матрицы пока не поддерживаются, введите квадратную матрицу.");
        }
    }
}
