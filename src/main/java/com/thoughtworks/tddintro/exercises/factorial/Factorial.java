package com.thoughtworks.tddintro.exercises.factorial;

import java.lang.*;

public class Factorial {
    public Integer compute(int i) {
        if(i < 0) throw new IllegalArgumentException();
        if(i == 0 || i == 1) return 1;
        else return (i * compute(i-1));
    }
}
