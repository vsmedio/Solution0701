import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Массивный максимум
1. В методе initializeArray():
1.1. Создайте массив на 20 чисел
1.2. Считайте с консоли 20 чисел и заполните ими массив
2. Метод max(int[] array) должен находить максимальное число из элементов массива


Требования:
1. Метод initializeArray должен создавать массив из 20 целых чисел.
2. Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
3. Метод max должен возвращать максимальный элемент из переданного массива.
4. Метод main изменять нельзя.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.valueOf(reader.readLine());
        }
        return arr;
    }

    public static int max(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array[0];
    }
}
