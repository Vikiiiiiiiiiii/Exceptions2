// Дан следующий код:                                       Исправьте код, примените
                                                         // подходящие способы обработки исключений.

/* 
public class SomeClass {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[2];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (Throwable e) {
            e.printStackTrace();
        } catch (StackOverflowError error) {
            System.out.println("asdfasdfdsa");
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }

    public static void test() throws IOException {
        File file = new File("1");
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}
*/
// Решение: 

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        InputStream inputStream;
        try {
            String[] strings = {"asdf", "asdf"};
            String strings1 = strings[strings.length - 1];
            test();
            int a = 1 / 0;
            inputStream = new FileInputStream("sdafgdsaf");
        } catch (StackOverflowError error) {
            System.out.println("Стек переполнен");
        } catch (Throwable e) {
            e.printStackTrace();
        } finally {
            System.out.println("Я все равно выполнился!");
        }
        System.out.println("Я жив!");
    }


    public static void test() throws IOException {
        File file = new File("l");                  // имя файла в качестве примера
        file.createNewFile();
        FileReader reader = new FileReader(file);
        reader.read();
        test();
    }
}