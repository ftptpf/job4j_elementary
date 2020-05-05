package ru.job4j.condition;

public class SqArea {
    public static double square (double p, double k){
        double h = p / ( 2 * ( k + 1 ) );
        double L = h * k;
        double rls = h * L;
        return rls;
    }
    public static void main (String [] args){
        double result = SqArea.square(6, 2);
        System.out.println("Result for p=6, k=2 is " + result);
    }
}
