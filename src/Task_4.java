/*Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.*/

import java.util.Scanner;

public class Task_4 {
    public static void main(String[]args) {
        System.out.println("Введите с консоли число в бинарном формате:");
        Scanner Svyat = new Scanner(System.in);
        String x=Svyat.nextLine();
        System.out.println(Integer.parseInt(x, 2));

    }
}
