//Для введенной с клавиатуры строки необходимо провести отсев пробелов.
//Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку с клавиатуры, товарисчЬ!");
        String stroka = in.nextLine();
        String bezprobelov = stroka.replaceAll(" ","");
        System.out.println (bezprobelov);
    }
}