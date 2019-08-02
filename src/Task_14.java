/*Необходимо написать программу, которая будет реализовывать следующие действия:

        1. Ввод числа с клавиатуры и запись его в строковую переменную S

        2. Конвертация строковой переменной S в числовую переменную X типа int

        3. Конвертация числа X типа int в число Y типа double


        Все три числа разных типов необходимо в столбик вывести на экран*/

import java.util.Scanner;

public class Task_14 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите с клавиатуры число S");
        String s = in.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);

    }
}