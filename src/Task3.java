import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int first, second, third;

        while (true) {
            System.out.println("Введите первое число: ");
            first = scanner.nextInt();

            System.out.println("Введите второе число: ");
            second = scanner.nextInt();

            System.out.println("Введите третье число: ");
            third = scanner.nextInt();

            int x = Math.max(first, second);
            int y = Math.max(first, third);

            if (x == y) {
                System.out.println(" Среднее число:" + Math.max(second, third));
            } else {
                System.out.println("Среднее значение: " + Math.min(x, y));
            }

        }

    }
}
