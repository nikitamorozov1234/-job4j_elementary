package ru.job4j.ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value / 0.96154f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value / 1.04f;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        euro = Converter.dollarToEuro(17);
        System.out.println("17 dollar are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollar.");
        dollar = Converter.euroToDollar(18);
        System.out.println("18 euro is " + dollar + " dollars.");
    }

}
