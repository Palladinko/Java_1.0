//Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
import java.util.Scanner;
public class Task_5 {
    public static void main(String[]args) {

        Scanner in=new Scanner(System.in);
        int x;
        System.out.println("Введите любое число X");
        x=in.nextInt();
        System.out.print(x + "x1"+"="+ x*1 +";" + "  ");  //+ x + "x2"+"="+  x*2 +" "+ x*3 +" "+ x*4 +" "+ x*5 +" "+ x*6 +" "+ x*7 +" "+ x*8 +" "+ x*9 +" "+ x*10);
        System.out.println(x + "x6"+"="+ x*6 +";");
        System.out.print(x + "x2"+"="+ x*2 +";" + " ");
        System.out.println(x + "x7"+"="+ x*7 +";");
        System.out.print(x + "x3"+"="+ x*3 +";" + " ");
        System.out.println(x + "x8"+"="+ x*8 +";");
        System.out.print(x + "x4"+"="+ x*4 +";" + " ");
        System.out.println(x + "x9"+"="+ x*9 +";");
        System.out.print(x + "x5"+"="+ x*5 +";" + " ");
        System.out.println(x + "x10"+"="+ x*10 +";");


    }
}
