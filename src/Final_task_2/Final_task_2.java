package Final_task_2;

//Написать программу сортировки по возрастанию заданного пользователем массива чисел.
//Пользователь программы должен, задавать размер массива и наполнять его числами.

import java.util.Scanner;

public class Final_task_2 {
    public static void main (String [] args ){

        System.out.println("Введите размер массива");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        double[] array = new double[size];
        System.out.println("Введите значения массива");
        for (int i=0; i<size; i++)
            array[i] = sc.nextDouble();

        for(int i = size-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                if( array[j] > array[j+1] ){
                    double tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }

        for (int i=0; i<size; i++)
            System.out.print(array[i] + " ");

    }
}
