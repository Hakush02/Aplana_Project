package Task_7;

//Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную T. В программе
// должны присутствовать константы X, Y, Z. Программа должна сравнивать введенное значение с клавиатуры со значением констант
// и вывести на экран сообщение "Данное значение имеется в константах" если T=X или Y или Z. Если переменная отличается от констант,
// нужно вывести оповещение "Такой константы нет!"

import java.util.Scanner;

public class Task_7 {

    public static void main (String [] args )   {

        System.out.println("Введите число");
        Scanner t = new Scanner(System.in);
        int T = t.nextInt();
        final int X = 3; final int Y = 4; final int Z = 5;

        switch (T)  {
            case X:
            case Y:
            case Z: System.out.println("Данное значение имеется в константах");
                break;
            default: System.out.println("Такой константы нет!");
                break;

        }

    }
}
