import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        final int HEIGHT;
        final int WEIGHT;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой рост");
        HEIGHT = scanner.nextInt();
        System.out.println("Введите свой вес");
        WEIGHT = scanner.nextInt();
        if (WEIGHT < HEIGHT - 110) {
            int plus = HEIGHT - 110 - WEIGHT;
            System.out.println("Вам нужно набрать " + plus + " килограмм");
        } else {

            if (WEIGHT > HEIGHT - 110) {

                int minus = Math.abs(HEIGHT - 110 - WEIGHT);
                System.out.println("Вам нужно сбросить " + minus + " килограмм");

            } else {

                System.out.println("У вас идеальный баланс");

            }

        }


    }

}
