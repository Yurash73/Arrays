public class Task5 {
    public static void main(String[] args) {
        System.out.println(" Таблица умножения на 10: ");

        int i = 1;
        while (i < 11) {
            int j = 1;
            while (j < 11) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
