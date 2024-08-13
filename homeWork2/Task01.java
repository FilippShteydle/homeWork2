import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int x= scanner.nextInt();
        System.out.println("Введите второе число число");
        int y = scanner.nextInt();

        int division = x / y;
        int remDivision = x % y;
        double root = Math.sqrt(x);

        System.out.println("Деление числа " + x + " на число " + y + " равно " + division);
        System.out.println("Остаток от деления числа " + x + " на число " + y + " равен " + remDivision);
        System.out.println("Квадратный корень числа " + x + " равен " + root);

    }

}
