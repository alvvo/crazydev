import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int line = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество столбцов:");
        int column = sc1.nextInt();
        Matrix matr = new Matrix(line,column);
        matr.setData(); //Метод для заполнения матрицы
        sc2.close(); //Метод для удаление объекта sc2 чтобы не засорял память
        matr.determinant(matr);
    }

}