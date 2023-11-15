import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        int yearOfBirth, monthOfBirth, dayOfBirth;

        System.out.println("Введите имя: ");
        name = scanner.nextLine();

        System.out.println("Введите день рождения: ");
        dayOfBirth = scanner.nextInt();

        System.out.println("Введите месяц рождения: ");
        monthOfBirth = scanner.nextInt();

        System.out.println("Введите год рождения: ");
        yearOfBirth = scanner.nextInt();

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + dayOfBirth + "."
                            + monthOfBirth + "." + yearOfBirth);
    }

}
