import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double number = scanner.nextDouble();

        if (Math.round(number) == number) {

            System.out.println("Число " + number + " не имеет вещественную часть");

        } else {
            System.out.println("Число " + number + " имеет вещественну часть");

        }

    }

}
