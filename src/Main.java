import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод количества секунд
        System.out.print("Введите количество секунд: ");
        int total_seconds = scanner.nextInt();

        // Расчет времени
        int hours = total_seconds / 3600;
        int minutes = (total_seconds % 3600) / 60;
        int seconds = total_seconds % 60;

        // Вывод времени
        System.out.printf("CURRENT TIME: %d HOURS %d MINUTES %d SECONDS.", hours, minutes, seconds);
    }
}
