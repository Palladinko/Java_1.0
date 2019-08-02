//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
//где каждый элемент массива умножается на 2. Размер массива задается пользователем.
import java.util.Scanner;
public class Task_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int razmer;
        int i;
        System.out.println("Введите размер массива:");
        razmer = in.nextInt();
        int massiv[] = new int[razmer];
        System.out.println("Введите элементы массива:");
        for (i = 0; i < razmer; i=i+1) {
            massiv[i] = in.nextInt();
        }
        System.out.println("Покажем на экране наш массив, где каждый элемент умнжен на 2:");
        for (i = 0; i < razmer; i=i+1) {
            System.out.print(massiv[i]*2 + " ");
        }
    }
}