package Final_task_1;

//Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран. Необходимо использовать циклы,
//нельзя использования готовые методы языка Java, для перевода числа из одной системы счисления в другую.

import java.util.Scanner;

public class Final_task_1 {
    public static void main (String [] args ) throws Exception {

        System.out.println("Enter a binary number!");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();

        for (int i = 0; i < number.length(); i++) {
            if ( Character.getNumericValue(number.charAt(i)) != 0 && Character.getNumericValue(number.charAt(i)) != 1) {
                throw new Exception("Number You entered is not binary");
            }
        }

        int decimal = 0;
        int j = 0;
        for ( int i = number.length()-1; i >= 0; i-- ) {
            decimal += Character.getNumericValue(number.charAt(j)) * (int) Math.pow(2, i);
                j++;
        }
        System.out.println(decimal);

    }
}
