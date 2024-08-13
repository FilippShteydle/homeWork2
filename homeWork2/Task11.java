import java.util.Scanner;

public class Task11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество секунд");
        int time = scanner.nextInt();

        int day = time / 3600 / 24;
        int hour = (time - day * 3600 * 24) / 3600;
        int minute = (time - day * 3600 * 24 - hour * 3600) / 60;
        int second = time - day * 3600 * 24 - hour * 3600 - minute * 60;

        String days = "";
        String hours = "";
        String minutes = "";
        String seconds = "";

        if (day % 10 == 1 || day == 1) {
            days = " день, ";
        }
        else {
            if (day < 12 || day > 14) {
                if (day % 10 == 2 || day % 10 == 3 || day % 10 == 4) {
                    days = " дня, ";
                }
                else {
                    days = " дней, ";
                }
            }
            else {
                days = " дней, ";
            }
        }
        if (hour % 10 == 1 || hour == 1) {
            hours = " час, ";
        }
        else {
            if (hour < 12 || hour > 14) {
                if (hour % 10 == 2 || hour % 10 == 3 || hour % 10 == 4) {
                    hours = " часа, ";
                }
                else {
                    hours = " часов, ";
                }
            }
            else {
                hours = " часов, ";
            }
        }
        if (minute % 10 == 1 || minute == 1) {
            minutes = " минута, и ";
        }
        else {
            if (minute < 10 || minute > 16) {
                if (minute % 10 == 2 || minute % 10 == 3 || minute % 10 == 4) {
                    minutes = " минуты, и ";
                }
                else {
                    minutes = " минут, и ";
                }
            }
            else {
                minutes = " минут, и ";
            }
        }
        if (second % 10 == 1 || second == 1) {
            seconds = " секунда";
        }
        else {
            if (second < 12 || second > 14) {
                if (second % 10 == 2 || second % 10 == 3 || second % 10 == 4) {
                    seconds = " секунды";
                }
                else {
                    seconds = " секунд";
                }
            }
            else {
                seconds = " секунд";
            }
        }
        System.out.println("До Нового Года осталось " + day + days + hour + hours + minute + minutes + second + seconds);

    }

}
