package lt.techin.praktinis;

public class Main {
    public static void main(String[] args) {
        CupsCalculator calc = new CupsCalculator();
        calc.calculateCups(10);
        calc.calculateCups(12);
        NumberReverter nr = new NumberReverter();
        nr.revert(489);
        nr.revert(123456789);
        TemperatureConverter tc = new TemperatureConverter();
        tc.toFahrenheit(0);
        tc.toFahrenheit(58);
    }
}
