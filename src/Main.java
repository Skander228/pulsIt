import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

//Использование класса Collections, так как работаем с коллекциями, иные сортировки использовал бы при применении массива
public class Main {
    static ArrayList<Double> coll = new ArrayList<>(10);
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while (coll.size() <= 10) {
            System.out.println("Введите значение цифрой");
            try {
                Double num = Double.valueOf(bufferedReader.readLine());
                coll.add(num);
            } catch (NumberFormatException е) {
                System.out.println("Не удалось преобразовать введённую строку в число.");
            }
        }

        Double max = Collections.max(coll);
        Double min = Collections.min(coll);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}