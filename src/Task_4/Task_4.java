package Task_4;

import java.util.Scanner;

public class Task_4 {

    public static void main (String [] args )   {

        System.out.println("Enter a binary number!");
        Scanner input = new Scanner(System.in) ;
        String number = input.nextLine() ;

        int toInt = Integer.parseInt( number, 2 ) ;
        System.out.println(toInt);


    }

}
