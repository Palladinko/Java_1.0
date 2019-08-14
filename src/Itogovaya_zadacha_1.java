//Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
//Необходимо использовать циклы, нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

import java.util.Scanner;

public class Itogovaya_zadacha_1 {

    public static void main(String[] args) {
        int[] binaryPow = new int[32];
        for (int i = 0; i < binaryPow.length; i++) {
            binaryPow[i] = (int) Math.pow(2, i);
        }
        System.out.println("Введите с консоли число в бинарном формате: ");
        Scanner sc = new Scanner(System.in);
        String binary = sc.nextLine();
        StringBuilder sb = new StringBuilder(binary);
        String binaryReverse = sb.reverse().toString();
        int result = 0;
        for (int i = 0; i < binaryReverse.length(); i++) {
            if (Integer.valueOf("" + binaryReverse.charAt(i)) == 1) {
                result += binaryPow[i];
            }
        }
        System.out.println("Число в десятичном формате:\n" + result);
        sc.close();
    }
}