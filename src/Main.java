import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int value = new Random().nextInt(100);
        System.out.println("Введите число:");
        int attempt = new Scanner(System.in).nextInt();

        while (value != attempt) {

            if (attempt > value) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Загаданное число больше");
            }
            attempt = new Scanner(System.in).nextInt();
        }
        System.out.println("Вы угадали!");
    }
}

