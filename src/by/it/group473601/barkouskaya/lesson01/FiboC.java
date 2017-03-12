package by.it.group473601.barkouskaya.lesson01;

/*
 * Даны целые числа 1<=n<=1E18 и 2<=m<=1E5,
 * необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * время расчета должно быть не более 2 секунд
 */

import java.util.ArrayList;

public class FiboC {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {
        FiboC fibo = new FiboC();
        int n = 10;
        int m = 2;
        System.out.printf("fasterC(%d)=%d \n\t time=%d \n\n", n, fibo.fasterC(n, m), fibo.time());
    }

    long fasterC(long n, int m) {

        ArrayList<Long> consistencyFibo = new ArrayList<>();

        consistencyFibo.add(0L);
        consistencyFibo.add(1L);

        for (int i = 2; i < m * 6; i++) {
            consistencyFibo.add((consistencyFibo.get(i - 1) + consistencyFibo.get(i - 2)) % m);

            if (consistencyFibo.get(i) == 1 && consistencyFibo.get(i - 1) == 0) {
                break;
            }
        }

        long period = consistencyFibo.size() - 2;
        int val = (int)(n % period);
        return consistencyFibo.get(val);
    }


}

