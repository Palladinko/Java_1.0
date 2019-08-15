//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//Пользователь программы должен задавать размер массива и наполнять его числами.
//Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Scanner;

public class Itogovaya_zadacha_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int razmer;
        int i;
        System.out.println("Введите размер массива:");
        razmer = in.nextInt();
        int massiv[] = new int[razmer];
        System.out.println("Введите элементы массива:");
        for (i = 0; i < razmer; i = i + 1) {
            massiv[i] = in.nextInt();
        }
        System.out.println("Покажем на экране введеный нами массив:");
        for (i = 0; i < razmer; i = i + 1) {
            System.out.print(massiv[i] + " ");
        }
        insertIntoSort(massiv);
    }
    public static void insertIntoSort(int massiv[]) {
        System.out.println();
        System.out.println("А теперь выведем на экран отсортированный по возрастанию массив (метод сортировки - выбором):");
        for (int l = 0; l < massiv.length; l++) {
            int min = massiv[l];
            int minId = l;
            for (int j = l+1; j < massiv.length; j++) {
                if (massiv[j] < min) {
                    min = massiv[j];
                    minId = j;
                }
            }
            // замена
            int temp = massiv[l];
            massiv[l] = min;
            massiv[minId] = temp;
        }
        for (int i = 0; i < massiv.length; i = i + 1) {
            System.out.print(massiv[i] + " ");
        }
    }
}
