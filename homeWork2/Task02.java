import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите рехзначное число");
        int n = scanner.nextInt();

        int part1 = n / 100;
        int part2 = (n - part1 * 100) / 10;
        int part3 = n - part1 * 100 - part2 * 10;

        int summ = part1 + part2 + part3;

        System.out.println("Сумма цифр числа " + n + " равна " + summ);

    }

}
