package Task_11;

//Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

import java.util.Scanner;

public class Task_11 {
    public static void main (String [] args ){

        System.out.println("Введите строку");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        System.out.println(st);



    }
}
