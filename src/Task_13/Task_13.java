package Task_13;


//Необходимо провести сравнение длинны двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
//Вывести на экран строку с наибольшей длинной.


import java.util.Scanner;

public class Task_13 {
    public static void main (String [] args ){

        System.out.println("Введите две строки");
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int str1Count = str1.length();
        int str2Count = str2.length();
        if ( str1Count> str2Count ) System.out.println(str1);
        else System.out.println(str2);


    }
}
