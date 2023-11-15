import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int columns, rows;

        while (true) {
            System.out.println("Введите число строк массива: ");
            rows = scanner.nextInt();
            if (rows <= 0) {
                System.out.println("Строк должно быть больше 0 !!");
                continue;
            }

            System.out.println("Введите число столбцов массива: ");
            columns = scanner.nextInt();
            if (columns <= 0) {
                System.out.println("Столбцов должно быть больше 0 !!");
                continue;
            }

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("8");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
