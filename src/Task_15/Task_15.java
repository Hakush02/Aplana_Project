package Task_15;
//Необходимо написать программу для сортировки данных массива по возрастанию.
//Использовать пузырьковый метод сортировки.

import java.util.Scanner;

public class Task_15 {
    public static void main (String [] args ){

        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Введите значения массива");
        for (int i=0; i<size; i++)
        array[i] = sc.nextInt();

        for(int i = size-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                int tmp = array[j];
                array[j] = array[j+1];
                array[j+1] = tmp;
                }
            }
        }

        for (int i=0; i<size; i++)
            System.out.print(array[i] + " ");
    }
}
