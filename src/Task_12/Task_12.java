package Task_12;

//Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Task_12 {
    public static void main (String [] args ){

        System.out.println("Введите строку");
        Scanner s = new Scanner(System.in);
        String st = s.nextLine();
        String noSpaces = st.replace( " ", "");


   /* Через цикл написать не удалось, не принимает пустое значение ''

        char[] charArray = st.toCharArray();
        for (int i=0; i<st.length(); i++) {
            if ( charArray[i] == ' ' ) charArray[i] = '' ;
        }
        String noSpaces = new String(charArray);

    */

        System.out.println(noSpaces);



    }
}
