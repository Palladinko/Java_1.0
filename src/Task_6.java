/* Написать программу, которая будет выполнять следующие действия:

        1. Ввод трех чисел с клавиатуры x, y, z

        2. Нахождение и вывод на экран среднего арифметического чисел x, y, z

        3. Деление среднего арифметического на 2 без остатка

        4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно" */
import java.util.Scanner;
public class Task_6 {
    public static void main(String[]args) {

        Scanner in=new Scanner(System.in);
        double x,y,z;
        System.out.println("Введите число X");
        x=in.nextDouble();
        System.out.println("Введите число Y");
        y=in.nextDouble();
        System.out.println("Введите число Z");
        z=in.nextDouble();

        double srednee= (x+y+z)/3;
        System.out.println("Среднее арифметическое= " + srednee);

        double delenie_srednego= srednee/2;
        System.out.println("Среднее арифметическое деленное на два без остатка= " + delenie_srednego);
        if (delenie_srednego > 3)
            System.out.println("Программа выполнена корректно");
    }
}
