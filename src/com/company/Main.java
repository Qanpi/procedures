package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        hw1();
        System.out.println(sumUpTo(20));
        //everything else works i swear i checked
    }

    static void hw1() {
        System.out.println("1a. Easier to understand (less code + functions can be named.");
        System.out.println("1b. Easier to debug if something goes haywire.");
        System.out.println("1c. Saves time (less repetitions).");

        System.out.println("2. The signature of a method is a description of the method (e.g. return type, name, etc.)");

        System.out.println("3.1. foo");
        System.out.println("3.2. Two");
        System.out.println("3.3. int");
    }

    static int sumUpTo(int n) {
        int sum = 0;
        for (int i=1; i<=n; i++) {
            sum += i;
        }
        return sum;
    }

    static boolean contains(int[] array, int value) {
        for (int i : array) {
            if (i == value) return true;
        }
        return false;
    }

    static boolean any(int[] a, int[] b) {
        for(int x : a) {
            if (contains(b, x)) return true;
        }
        return false;
    }

    static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i=0; i < a.length; i++) {
            b[i] = a[a.length-1-i];
        }
        System.out.println(Arrays.toString(b));
        return b;
    }

    static boolean equal(int[] a, int[] b) {
        for (int i=0; i<a.length; i++) { //assumed the arrays are of equal length
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    static boolean isPalindrome(int[] a) {
        return equal(a, reverse(a));
    }

    static void REMOVE(int[] IN, int X, int[] OUT) {
        int j = 0;
        for (int i=0; i<IN.length; i++) {// once again, assume the arrays are of equal length
            if (IN[i] == X) continue;
            OUT[j] = IN[i];
            j++;
        }
        for (; j<OUT.length; j++) {
            OUT[j] = 0;
        }
        System.out.println(Arrays.toString(OUT));
    }

    static int[] alternate(int[] a) { //interesting problem
        int[] b = new int[a.length];
        int i=0, j = a.length-1;
        for (int k=0; k<b.length; k++) {
            if (k%2==0) {
                b[k] = a[i];
                i++;
            }
            else {
                b[k] = a[j];
                j--;
            }
        }
        return b;
    }

    static boolean prime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) { //<= make sure to include the equal sign
            if (n % i == 0) return false;
        }
        return true;
    }

    static void primesUnder100() {
        for (int i=2; i<100; i++) {
            if (prime(i)) System.out.println(i);
        }
    }

    static void first100primes() {
        int count=0;
        int i=2;
        while(count<100) {
            if(prime(i)) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
