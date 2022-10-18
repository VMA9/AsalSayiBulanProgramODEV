import java.util.Scanner;

public class Main {
    static void asal(int number, int n) {

        if (n == number) {
            System.out.print(number + " sayısı ASALDIR !");
            return;
        } else if (number % n == 0) {
            System.out.print(number + " sayısı ASAL değildir !");
            return;
        }
        asal(number, n + 1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz :  ");
        int number = input.nextInt();
        asal(number, 2);
    }
}