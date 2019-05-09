package Task_17;

//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt. Запись
// ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании программы
// по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

import java.io.*;
import java.util.Scanner;

public class Task_17 {
    public static void main (String [] args ) throws IOException {

        String textData;
        File file = new File("C://Users//Hayk//Desktop//file17.txt"); //изменить для себя
        file.createNewFile();

        do {
        System.out.println("Введите текст. Если ввести больше нечего, введите команду Stop");
        Scanner sc = new Scanner(System.in);
        textData = sc.nextLine() + " \r\n";

            if (!textData.equals("Stop \r\n"))  {

        FileWriter out = new FileWriter(file, true);
        out.write(textData);
        out.close();
            }
            } while (!textData.equals("Stop \r\n"));

        System.out.println("Введенные вами данные записаны в созданном file17.txt");

    }
}
