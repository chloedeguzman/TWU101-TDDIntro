package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    static int balance = 0;

    public static void main(String args[]){

    }

    public static void deposit(int n){
        balance += n;
    }

    public static void withdraw(int n){
        if(balance < n) System.out.println("Insufficient funds");
        else {
            balance -= n;
        }
    }
}
