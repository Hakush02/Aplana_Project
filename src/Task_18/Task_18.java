package Task_18;

//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
// а потом в этот же файл перезаписывать текстовые данные, введенные вручную. Количество строк после
// перезаписи должно быть столько же, сколько и в изначальном варианте.

import java.io.*;
import java.util.Scanner;

public class Task_18 {
    public static void main (String [] args ) throws IOException {

        /* File f = new File("C://Users//Hayk//Desktop//file18.txt"); //путь указать свой
        f.createNewFile();

        FileWriter writer = new FileWriter(f);
        writer.write("Вот этот текст записан в созданный file18.txt\r\nВторая строчка");
        writer.close(); */

        FileReader freader = new FileReader("C://Users//Hayk//Desktop//file18.txt"); //указать свой путь к файлу
        BufferedReader breader = new BufferedReader(freader);
        String line = breader.readLine();
        int i = 0;
        while (line != null) {
            System.out.println(line);
            line = breader.readLine();
            i++ ;
        }
        breader.close();
        /*char[] txt = new char[200];
        reader.read(txt);
        System.out.println(txt);
        reader.close();*/

        System.out.println("Введите текстовые данные, которыми вы хотите перезаписать файл");
        Scanner sc = new Scanner(System.in);
        /* String newText = sc.nextLine() + "\r\n" + sc.nextLine() */;

        FileWriter writer2 = new FileWriter("C://Users//Hayk//Desktop//file18.txt");
        while (i > 0)    {
            String newText = sc.nextLine();
            writer2.write(newText + "\r\n");
            i--;
        }

        writer2.close();

    }


}
