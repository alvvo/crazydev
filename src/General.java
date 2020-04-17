import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введите количество столбцов:");
        int weight = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int height = sc1.nextInt();
        Matrix matr = new Matrix(weight,height);
        matr.setData();
    }
}
