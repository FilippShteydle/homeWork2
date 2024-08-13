import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        int vklad = scanner.nextInt();
        System.out.println("Введите годовую процентную ставку");
        double percent = scanner.nextDouble();

        double firstYear = vklad + vklad * percent / 100;
        System.out.println("Через год сумма вклада составит " + firstYear);

        double secondYear = firstYear + firstYear * percent / 100;
        System.out.println("Через два года сумма вклада составит " + secondYear);

    }

}
