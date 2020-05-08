package ru.job4j.calculator;

public class Fit {
    public static double manWeight(double height) {
        double rls = (height - 100) * 1.15;
        return rls;
    }
    public static double womanWeight(double height) {
        double rls = (height - 110) * 1.15;
        return rls;
    }
    public static void main(String[] args) {
        double man = Fit.manWeight(180);
        double woman = Fit.womanWeight(170);
        System.out.println("The ideal man weight for height 180 centimeters is " + man + " kg.");
        System.out.println("The ideal woman weight for height 170 centimeters is " + woman + " kg.");
    }
}
