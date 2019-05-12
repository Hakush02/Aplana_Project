package Final_task_3;

//Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
//Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.

import java.util.Scanner;

public class Final_task_3 {
    public static void main (String [] args ) {

        System.out.println("Введите текущий курс $:");
        Scanner sc = new Scanner(System.in);
        double usd_rate = sc.nextDouble();
        System.out.println("Введите сумму в рублях");
        double rub_amount = sc.nextDouble();

        double usd_amount = rub_amount/usd_rate;
        usd_amount = usd_amount*100;
        double a = Math.round(usd_amount);
        double b = a/100;
        System.out.println(b);

    }
}
