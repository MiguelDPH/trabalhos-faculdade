package prova_exercicio8;

public class ConversorTemperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }
}