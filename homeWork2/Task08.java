import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

        int TIME = 10;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите скорость распространения звука в м/с");
        double speed = scanner.nextDouble();

        double distance = TIME * speed;
        System.out.println("Расстояние до места удара молнии составит " + distance + " м");

    }

}
