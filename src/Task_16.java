import java.io.IOException;

//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
import java.io.*;
public class Task_16 {
    public static void main(String args[]){
        String s;
        try (BufferedReader br = new BufferedReader (new FileReader("C://Users//Святослав//IdeaProjects//Java 1.0//test.txt")))
        {
                    while((s = br.readLine()) !=null) {
            System.out.println(s);
        }
        }catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}
