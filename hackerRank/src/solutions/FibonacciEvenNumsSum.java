package solutions;

import java.util.*;

public class FibonacciEvenNumsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("T: ");
        int t = in.nextInt();
        long[] numbers = new long[t];
        int sum = 0;
        for (int a0 = 0; a0 < t; a0++) {
            System.out.println("N= ");
            long n = in.nextLong();
            numbers[a0] = n;
        }
        Arrays.sort(numbers);
        long[] evenSums = evenFibonacciSum(numbers);
        for (long evenSum: evenSums) {
            System.out.println(evenSum);
        }

    }

    public static long[] evenFibonacciSum(long[] numbers) {
        int fibFirst = 1;
        int fibSecond = 2;
        int fibPreviousOne = fibFirst;
        int fibPreviousTwo = fibSecond;
        int fibNext = 0;
        long[] evenSums= new long[numbers.length];
        evenSums[0] = 2;
        int i = 0;
        while(i<numbers.length){
            while (fibNext + fibPreviousOne < numbers[i]) {
                fibNext = fibPreviousOne + fibPreviousTwo;

                if (fibNext % 2 == 0) {
                    evenSums[i] += fibNext;
                }
                fibPreviousOne = fibPreviousTwo;
                fibPreviousTwo = fibNext;
            }
            if((i+1)<numbers.length){
                evenSums[i+1]=evenSums[i];
            }
            i++;
        }
        return evenSums;
    }

}
