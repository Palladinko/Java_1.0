//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
//где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

import java.util.Scanner;
public class Task_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int stroki;
        int stolbtsi;
        int i, t;
        System.out.println("Введите количество строк матрицы:");
        stroki = in.nextInt();
        System.out.println("Введите количество столбцов матрицы:");
        stolbtsi = in.nextInt();
        int matrix[][] = new int[stroki][stolbtsi];
        System.out.println("Введите элементы массива:");
        for (i = 0; i < stroki; ++i)
            for (t = 0; t < stolbtsi; ++t) {
                matrix[i][t] = in.nextInt();
            }

        System.out.println("Покажем на экране 1-ую строку матрицы, где каждый элемент умножен на 3:");
        //for (i = 0; i < stroki; ++i) {
        for (t = 0; t < stolbtsi; ++t) {
            System.out.print(matrix[0][t]*3 + "\t");
        }
        System.out.println();
    }
}