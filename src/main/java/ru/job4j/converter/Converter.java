package ru.job4j.converter;

/**
* Class Converter конвертер валют Ruble-Dollar, Ruble-Euro
* @author Andrey
 * @since 16.05.2020
 * @version 1.0.0
*/
public class Converter {
    /**
    * Метод конвертации рублей в евро
     * @param value значение в рублях
     * @return rls возращает значение в евро
    */
    public static float rubleToEuro(float value) {
        float rls = value / 70;
        return rls;
    }
    /**
     * Метод конвертации рублей в доллары
     * @param value значение в рублях
     * @return rls возращает значение в доларах
     */
    public static float rubleToDollar(float value) {
        float rls = value / 60;
        return  rls;
    }
    /**
     * Главный метод класса
     * @param args - args массив строковых параметров метода
     */
    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(140);
        System.out.println("140 ruble are " + euro + " euros. ");
        System.out.println("140 ruble are " + dollar + " dollars. ");
        //test Euro result
        float in = 140;
        double expected = 2.0;
        float out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 ruble are 2.0 euro. Test result: " + passed);
        //test Dollar result
        expected = 2.3333332538604736;
        out = rubleToDollar(in);
        passed = expected == out;
        System.out.println("140 ruble are 2.3333332538604736 dollar. Test result: " + passed);
    }
}