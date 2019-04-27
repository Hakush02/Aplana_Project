package Task_10;

//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3.

import java.util.Scanner;

public class Task_10 {
    public static void main (String [] args ){

        System.out.println("Введите размеры матрицы");
        Scanner sc = new Scanner(System.in);
        int strings = sc.nextInt();
        int colomns = sc.nextInt();
        int [][] numbers = new int [strings][colomns];
        System.out.println("Введите значения для матрицы");
        for ( int i=0; i<strings; i++ ) {
            for ( int j=0; j<colomns; j++ ){
                numbers[i][j] = sc.nextInt();
            }
        }


        for ( int i=0; i<1; i++ ) {
            for ( int j=0; j<colomns; j++ ){
                System.out.print(numbers [i][j] *3 + " ");
            }
            System.out.println();
        }
    }
}