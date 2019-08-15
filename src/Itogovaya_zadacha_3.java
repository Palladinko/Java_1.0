//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
//Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
//(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.text.DecimalFormat;
import java.util.Scanner;

public class Itogovaya_zadacha_3 {
    public static void main(String[]args) {
        Scanner in=new Scanner(System.in);
        double x,y;
        System.out.println("Введите текущий курс доллара:");
        x=in.nextDouble();
        System.out.println("Введите количество рублей, которое хотите обменять на доллары:");
        y=in.nextDouble();
        double convertation= y/x;

        {
            String pattern = "##0.00";
            DecimalFormat decimalFormat = new DecimalFormat(pattern);
            String format = decimalFormat.format(convertation);

            System.out.println("При нынешнем курсе доллара = " + x + " наша контора ООО Конвертер готова предложить за Ваши " + y + " рублей" + " ровным счетом " + format + " хрустящих зеленых бумажек");
        }
    }
}
