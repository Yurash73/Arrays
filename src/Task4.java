import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        while (true) {
            System.out.println("Введите число: ");
            int inputNumber = scanner.nextInt();
            if (inputNumber == -1) {
                System.out.println(" Сумма чисел: " + (--sum));
                break;
            }
            else sum = sum + inputNumber;
        }
    }
}
