//Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие
// переменные. Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку №1 с клавиатуры, товарисчЬ!");
        String stroka1 = in.nextLine();
        System.out.println("Введите строку №2 с клавиатуры, товарисчЬ!");
        String stroka2 = in.nextLine();
        int len = stroka1.length();
        int len1 = stroka2.length();
        if (len>len1)
            System.out.println(stroka1);
        else if (len<len1)
            System.out.println(stroka2);
        else if (len==len1)
            System.out.println("Введенные Вами строки равной длины!");
    }
}