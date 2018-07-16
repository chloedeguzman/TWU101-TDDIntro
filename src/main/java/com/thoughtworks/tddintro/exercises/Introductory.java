package com.thoughtworks.tddintro.exercises;

import java.util.ArrayList;

public class Introductory {
    public static void main(String args[]){
        int n = 5;
        asterisk();
        horizontal(n);
        vertical(n);
        right(n);
        isosceles(n);
        diamond(n);
        name(n);
        fizzbuzz();
        generate(315);
    }

    public static void asterisk(){
        System.out.println("*");
    }

    public static void horizontal(int n){
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
    }

    public static void vertical(int n){
        for(int i = 0; i < n; i++){
            System.out.println("*");
        }
    }

    public static void right(int n){
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void isosceles(int n){
        for(int i = 1; i <= n; i++){
            for(int j = n - 1; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void diamond(int n){
        // top half
        for(int i = 1; i <= n; i++){
            for(int j = n - 1; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= (2 * i - 1); k++){
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for(int a = n - 1; a >= 1; a--){
            System.out.print(" ");
            for(int b = n - 1; b > a; b--){
                System.out.print(" ");
            }
            for(int c = 1; c < a * 2; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void name(int n){
        // top half
        for(int i = 1; i <= n; i++){
            if(i == n){ // if middle
                System.out.println("Chloe");
            } else {
                for(int j = n - 1; j >= i; j--){
                    System.out.print(" ");
                }
                for(int k = 1; k <= (2 * i - 1); k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        // lower half
        for(int a = n - 1; a >= 1; a--){
            System.out.print(" ");
            for(int b = n - 1; b > a; b--){
                System.out.print(" ");
            }
            for(int c = 1; c < a * 2; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void fizzbuzz(){
        for(int i = 1; i < 101; i++){
            // case fizz
            if(i % 3 == 0){
                System.out.print("Fizz");
                if(i % 5 == 0){ // case fizzbuzz
                    System.out.print("Buzz");
                }
                System.out.println();
            } else if(i % 5 == 0){
                // case buzz
                System.out.println("Buzz");
            } else {
                // case none
                System.out.println(i);
            }
        }
    }

    public static ArrayList<Integer> generate(int n){
        ArrayList<Integer> list = new ArrayList<>();

        // take care of 2's first
        while(n % 2 == 0){
            list.add(2);
            n /= 2;
        }
        // n is odd, so skip 1 and 2 and check the rest of the prime numbers
        for (int i = 3; i < Math.sqrt(n); i += 2){
            while(n % i == 0){
                list.add(i);
                n /= i;
            }
        }

        // add remaining to list if not 2 or 1
        if(n > 2) list.add(n);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        return list;
    }
}
