import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        final double HEIGHT;
        final double WEIGHT;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите свой рост");
        HEIGHT = scanner.nextDouble();
        System.out.println("Введите свой вес");
        WEIGHT = scanner.nextDouble();
        if (WEIGHT < HEIGHT - 110) {
            double plus = Math.round((HEIGHT - 110 - WEIGHT) * 10) / 10d;
            System.out.println("Вам нужно набрать " + plus + " килограмм");
        } else {

            if (WEIGHT > HEIGHT - 110) {

                double minus = Math.round((Math.abs(HEIGHT - 110 - WEIGHT)) * 10) / 10d;
                System.out.println("Вам нужно сбросить " + minus + " килограмм");

            } else {

                System.out.println("У вас идеальный баланс");

            }

        }


    }

}
