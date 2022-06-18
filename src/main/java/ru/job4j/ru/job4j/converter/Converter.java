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
            float in = 140;
            float expected = 2;
            float out = Converter.rubleToEuro(in);
            boolean passed = expected == out;
            System.out.println("140 rubles are " + euro + " euro. Test result: " + passed);

            euro = Converter.dollarToEuro(17);
            System.out.println("17 dollar are " + euro + " euro.");
            in = 17;
            expected = 17.679972f;
            out = Converter.dollarToEuro(in);
            passed = expected == out;
            System.out.println("17 dollar are " + euro + " euro.Test result : " + passed);

            float dollar = Converter.rubleToDollar(120);
            System.out.println("120 rubles are " + dollar + " dollar.");
            in = 120;
            expected = 2;
            out =  Converter.rubleToDollar(in);
            passed = expected == out;
            System.out.println("120 rubles are " + dollar + " dollar.Test result : " + passed);

            dollar = Converter.euroToDollar(18);
            System.out.println("18 euro is " + dollar + " dollars.");
            in = 18;
            expected = 17.307693f;
            out =  Converter.euroToDollar(in);
            passed = expected == out;
            System.out.println("18 euro is " + dollar + " dollars. Test result : " + passed);
        }

}
