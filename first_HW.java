import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class first_HW {
    public static void main(String[] args) {
        Random rand = new Random();

        // 1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
        int i = rand.nextInt(2001);
        System.out.println("i = " + i);

        // 2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
        int n = 0;
        for (int j = 1 << 15; j > 0; j >>= 1) {
            if ((i & j) != 0) {
                n = (int) Math.ceil(Math.log(j + 1) / Math.log(2));
                break;
            }
        }
        System.out.println("n = " + n);

        // 3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
        List<Integer> m1 = new ArrayList<Integer>();
        for (int j = i; j <= Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                m1.add(j);
            }
        }
        System.out.println("m1 = " + m1);

        //4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2
        List<Integer> m2 = new ArrayList<Integer>();
        for (int j = Short.MIN_VALUE; j <= i; j++) {
            if (j % n != 0) {
                m2.add(j);
            }
        }
        System.out.println("m2 = " + m2);
    }
}
