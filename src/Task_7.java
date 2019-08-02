/* Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
В программе должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры
со значением констант и вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
*/
import java.util.Scanner;
public class Task_7 {
    public static void main(String[]args) {

        Scanner in=new Scanner(System.in);
        int number;
        final int X = 5;
        final int Y = 15;
        final int Z = 25;
        System.out.println("Введите переменную NUMBER");
        number=in.nextInt();

        switch (number) {
            case X:
                System.out.println("Данное значение имеется в константах");
                break;
            case Y:
                System.out.println("Данное значение имеется в константах");
                break;
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default: System.out.println("Такой константы нет");
        }
    }
}
