package Task_6;

import java.util.Scanner;

public class Task_6 {

    public static void main (String [] args )   {

        System.out.println("Введите X, Y, Z");
        Scanner num = new Scanner(System.in) ;

        int X = num.nextInt() ;
        int Y = num.nextInt() ;
        int Z = num.nextInt() ;
        double AVG = (X+Y+Z)/3 ;
        int halfOfAVG = (int) AVG/2 ;

        if ( halfOfAVG > 3 )
        System.out.println( "Программа выполнена корректно" );

    }

}
