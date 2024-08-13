import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {

        final int RADIUS;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга");
        RADIUS = scanner.nextInt();


        double square = Math.PI * Math.pow(RADIUS, 2);
        double length = 2 * Math.PI * RADIUS;

        System.out.println("Для круга с радиусом " + RADIUS + " Площадь круга равна " + square);
        System.out.println("Для круга с радиусом " + RADIUS + " Длина окружности равна" + length);

    }

}
