package by.it.group473601.barkouskaya.lesson01;

import java.math.BigInteger;
import java.util.ArrayList;

/*
 * Вам необходимо выполнить способ вычисления чисел Фибоначчи с вспомогательным массивом
 * без ограничений на размер результата (BigInteger)
 */

public class FiboB {

    private long startTime = System.currentTimeMillis();

    private long time() {
        return System.currentTimeMillis() - startTime;
    }

    public static void main(String[] args) {

        //вычисление чисел простым быстрым методом
        FiboB fibo = new FiboB();
        int n = 55555;
        System.out.printf("fastB(%d)=%d \n\t time=%d \n\n", n, fibo.fastB(n), fibo.time());
    }

    BigInteger fastB(Integer n) {

        ArrayList<BigInteger> arrayFibo = new ArrayList<>();

        for (int i = 0; i < 2; i++)
            arrayFibo.add(BigInteger.ONE);

        for (int k = 2; k < n; k++) {
            arrayFibo.add(arrayFibo.get(k - 1).add(arrayFibo.get(k - 2)));
        }

        return arrayFibo.get(n - 1);
    }

}

