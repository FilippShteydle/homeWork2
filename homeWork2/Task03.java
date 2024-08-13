import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вещественное число, дробь вводится через запятую");
        double n;
        n = scanner.nextDouble();

        int rez = (int) Math.round(n);

        System.out.println("Целочисленное значение вещественного числа " + n + " равно " + rez);


    }

}
