package Task_16;

//Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
import java.io.*;

public class Task_16 {
    public static void main(String[] args) throws IOException {

        File f = new File("C://Users//Hayk//Desktop//file16.txt"); //путь указать свой
        f.createNewFile();

        FileWriter writer = new FileWriter(f);
        writer.write("Вот этот текст записываем в созданный объект f");
        writer.close();

        FileReader freader = new FileReader(f);
        BufferedReader breader = new BufferedReader(freader);
        String line = breader.readLine();
        while (line != null) {
            System.out.println(line);
            line = breader.readLine();
        }
        breader.close();
        /*char[] txt = new char[200];
        reader.read(txt);
        System.out.println(txt);
        reader.close(); */

    }
}

