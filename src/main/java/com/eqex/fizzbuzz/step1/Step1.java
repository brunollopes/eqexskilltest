package com.eqex.fizzbuzz.step1;

public class Step1 {
    public String step1(int n) {
        StringBuilder step1 = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                // number divisible by 15(divisible by both 3 & 5), print 'FizzBuzz' in place of the number
                System.out.print("fizzbuzz" + " ");
                step1.append("fizzbuzz" + " ");
            } else if (i % 5 == 0) {
                // number divisible by 5, print 'Buzz' in place of the number
                System.out.print("buzz" + " ");
                step1.append("buzz" + " ");
            } else if (i % 3 == 0) {
                // number divisible by 3, print 'Fizz' in place of the number
                System.out.print("fizz" + " ");
                step1.append("fizz" + " ");
            } else {
                // print the numbers
                System.out.print(i + " ");
                step1.append(i + " ");
            }
        }
        return step1.toString();
    }
}
