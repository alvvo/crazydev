import java.util.Scanner;

public class MethodsLibrary {
    // Метод для инициализации матрицы
    public static void initMatrix(){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество столбцов:");
        int weight = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int height = sc1.nextInt();
        Matrix matr = new Matrix(weight,height);
        matr.setData();
        sc2.close();
    }
    // Метод для заполнения ячеек матрицы
    public static int[][] fillingInTheMatrix(int weight, int height){
        int[][] arr = new int[weight][height];
        Scanner sc1 = new Scanner(System.in);
        for(int j = 0; j < weight; j++) {
            for (int i = 0; i < height; i++) {
                arr[j][i] = sc1.nextInt();
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
}
