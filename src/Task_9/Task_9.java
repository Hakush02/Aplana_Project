package Task_9;

//Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
// где каждый элемент массива умножается на 2.

import java.util.Scanner;

public class Task_9 {
    public static void main (String [] args ){

        int [] numbers = new int[4];
        System.out.println("Введите значения для массива");
        Scanner sc = new Scanner(System.in);
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[2] = sc.nextInt();
        numbers[3] = sc.nextInt();
        for (int i : numbers) {
        System.out.println(i*2);

        }

    }


}
