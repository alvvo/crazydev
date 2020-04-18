import java.util.Scanner;

public class MethodsLibrary {
    // Метод для инициализации матрицы
    public static void initMatrix(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int line = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество столбцов:");
        int column = sc1.nextInt();
        Matrix matr = new Matrix(line,column);
        matr.setData();
        sc2.close();
    }
    // Метод для заполнения ячеек матрицы
    public static double[][] fillingInTheMatrix(int line, int column){
        double [][] arr = new double[line][column];
        Scanner sc1 = new Scanner(System.in);
        for(int j = 0; j < line; j++) {
            for (int i = 0; i < column; i++) {
                arr[j][i] =(float)Double.parseDouble(sc1.nextLine());
            }
        }
        sc1.close();
        return arr;
    }
    // Вывод матрицы на экран
    public static void printArr(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static double SquareDeterminant(Matrix matrix){
        double[][] arr = matrix.getData();
        double determinant = (arr[0][0] * arr[1][1]) - (arr[1][0] * arr[0][1]);
        return determinant;
    }

    public static double thirdDeterminant(Matrix matrix){
        double[][] arr = matrix.getData();
        double firstDiagonal = ((arr[0][0] * arr[1][1] * arr[2][2]) + (arr[0][2] * arr[1][0] * arr[2][1]) + (arr[2][0] * arr[0][1] * arr[1][2]));
        double secondDiagonal = ((arr[0][2] * arr[1][1] * arr[2][0]) + (arr[0][0] * arr[2][1] * arr[1][2]) + (arr[2][2] * arr[1][0] * arr[0][1]));
        double determinant = firstDiagonal - secondDiagonal;
        return determinant;
    }
}