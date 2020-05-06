package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }
    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return  rls;
    }
    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 ruble are " + euro + " euros. ");
        System.out.println("140 ruble are " + dollar + " dollars. ");
        //test Euro result
        float in = 140;
        double expected = 2.0;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 ruble are 2.0 euro. Test result: " + passed);
        //test Dollar result
        expected = 2.3333333;
        out = rubleToDollar(in);
        System.out.println("140 ruble are 2.3333333 dollar. Test result: " + passed);
    }
}