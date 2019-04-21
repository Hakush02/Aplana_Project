package Task_10;

//Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
// где каждый элемент умножается на 3.

import java.util.Scanner;

public class Task_10 {
    public static void main (String [] args ){

    int [][] numbers = new int [3][4];
        System.out.println("Введите значения для матрицы");
        Scanner sc = new Scanner(System.in);
        numbers[0][0] = sc.nextInt();
        numbers[0][1] = sc.nextInt();
        numbers[0][2] = sc.nextInt();
        numbers[0][3] = sc.nextInt();
        numbers[1][0] = sc.nextInt();
        numbers[1][1] = sc.nextInt();
        numbers[1][2] = sc.nextInt();
        numbers[1][3] = sc.nextInt();
        numbers[2][0] = sc.nextInt();
        numbers[2][1] = sc.nextInt();
        numbers[2][2] = sc.nextInt();
        numbers[2][3] = sc.nextInt();

        for ( int i=0; i<1; i++ ) {
            for ( int j=0; j<4; j++ ){
                System.out.print(numbers [i][j] *3 + " ");
            }
            System.out.println();

        }
    }


}