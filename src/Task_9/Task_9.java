package Task_9;

//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2.

import java.util.Scanner;

public class Task_9 {
    public static void main (String [] args ){

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        System.out.println("Введите значения для массива");
        int [] numbers = new int[size];
        for (int i=0; i<size; i++)  {
            numbers [i]  = sc.nextInt();
        }
        for (int i=0; i<size; i++)
        System.out.print(numbers[i]*2 + " ");

        }

    }



