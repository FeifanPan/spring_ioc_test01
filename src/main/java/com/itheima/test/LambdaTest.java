package com.itheima.test;

import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

public class LambdaTest {

    public static void main(String[] args) {

  /*      new Thread(() -> {
            System.out.println("新线程中run方法被执行了");
        }).start();*/

 /*       int i = calculateNum((left, right) -> left + right);
        System.out.println(i);*/

/*        printNum((int value) -> {
            return value % 2 == 0;
        });*/
/*

        Integer integer = typeConver((String s) -> {
            return Integer.valueOf(s);

        });
        System.out.println(integer);

        String s = typeConver((String str) -> {
            return str + "三更";
        });
        System.out.println(s);
*/

        foreachArr((int value) -> {

            System.out.println(value);

        });


    }


    public static void foreachArr(IntConsumer consumer) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            consumer.accept(i);
        }
    }

    public static int calculateNum(IntBinaryOperator operator) {
        int a = 10;
        int b = 20;
        return operator.applyAsInt(a, b);
    }

    public static void printNum(IntPredicate predicate) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : arr) {
            if (predicate.test(i)) {
                System.out.println(i);
            }
        }
    }

    public static <R> R typeConver(Function<String, R> function) {
        String str = "1235";
        R result = function.apply(str);
        return result;
    }

}
