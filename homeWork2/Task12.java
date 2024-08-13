import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество учеников 1-го класса");
        int n = scanner.nextInt();
        System.out.println("Введите процент учеников с весом меньше 30 кг");
        int p = scanner.nextInt();

        double dop = n * p / 100d;
        int children = (int) Math.ceil(dop);
        int pirog = n + children;
        int milk = children * 200;
        double box = milk / 900d;
        int boxMilk = (int) Math.ceil(box);
        String pirogs = "";
        String boxMilks = "";

        if (pirog % 10 == 1 || pirog == 1) {
            pirogs = " пирог, и ";
        }
        else {
            if (pirog < 12 || pirog > 14) {
                if (pirog % 10 == 2 || pirog % 10 == 3 || pirog % 10 == 4) {
                    pirogs = " пирога, и ";
                }
                else {
                    pirogs = " пирогов, и ";
                }
            }
            else {
                pirogs = " пирогов, и ";
            }
        }

        if (boxMilk % 10 == 1 || boxMilk == 1) {
            boxMilks = " пакет молока";
        }
        else {
            if (boxMilk < 12 || boxMilk > 14) {
                if (boxMilk % 10 == 2 || boxMilk % 10 == 3 || boxMilk % 10 == 4) {
                    boxMilks = " пакета молока ";
                }
                else {
                    boxMilks = " пакетов молока";
                }
            }
            else {
                boxMilks = " пакетов молока";
            }
        }

        System.out.println("Для " + n + " учеников, при условии, что " + p + " процентов учеников весит меньше 30 кг "
                + "понадобится " + pirog + pirogs + boxMilk + boxMilks);

    }

}
