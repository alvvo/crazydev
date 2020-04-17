import java.util.Arrays;
import java.util.Scanner;
public class Matrix {
    private int weight;
    private int height;
    // Двумерный массив всех ячеек матрицы
    private int[][] data;
    public Matrix(){
        weight = 0; height = 0;
    }
    public Matrix(int weight, int height){
        this.weight = weight; this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setData() {
        this.data = MethodsLibrary.fillingInTheMatrix(weight,height);
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int[][] getData() {
        return data;
    }

}
