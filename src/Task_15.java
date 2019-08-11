//Необходимо написать программу для сортировки данных массива по возрастанию. Использовать пузырьковый метод сортировки.
import java.util.Scanner;
public class Task_15 {
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
        bubbleSorter(massiv);
    }

    /*Внешний цикл каждый раз сокращает фрагмент массива,
      так как внутренний цикл каждый раз ставит в конец
      фрагмента максимальный элемент*/
    public static void bubbleSorter(int massiv[]) {
        System.out.println();
        System.out.println("А теперь выведем на экран отсортированный по возрастанию массив:");
        for (int l = massiv.length - 1; l > 0; l--) {
            for (int j = 0; j < l; j++) {
            /*Сравниваем элементы попарно,
              если они имеют неправильный порядок,
              то меняем местами*/
                if (massiv[j] > massiv[j + 1]) {
                    int tmp = massiv[j];
                    massiv[j] = massiv[j + 1];
                    massiv[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < massiv.length; i = i + 1) {
            System.out.print(massiv[i] + " ");
        }
    }
}

