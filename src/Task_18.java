/*Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.*/

import java.io.*;

public class Task_18 {
    public static void main(String[] args) {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            int lineCountReader = 0;
            String s,b;
            System.out.println("В файле следующие строки :\n");
            while ((s=br.readLine()) !=null){
                lineCountReader++;
                System.out.println(s);
            }
            int lineCountWriter =0;
            try (BufferedWriter fw = new BufferedWriter(new FileWriter("test.txt",false))) {
                System.out.println("\nВведите новые данные в файл: \n");
                while (lineCountReader>lineCountWriter){
                    b = read.readLine();
                    b+="\r\n";
                    fw.write(b);
                    lineCountWriter++;
                }
            }
            System.out.println("Файл обновлен");
        }
        catch(IOException exc){
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}

