import java.util.Scanner;

public class Itog_1 {
    static int a, des = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int binInput = scan.nextInt();
        System.out.println("Соответствует десятичному числу: " + bin(binInput, 0));
    }

    public static int bin(int number, int count) {
        if (number > 0) {
            a = number&1;
            number = number / 10;
            des = des + (a << count);
            return bin(number, ++count);
        }
        return des;
    }
}