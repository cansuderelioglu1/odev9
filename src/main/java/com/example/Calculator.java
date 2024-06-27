package main.java.com.example;

public class Calculator {
    public double divide(double numerator, double denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Sıfıra bölme işlem hatası");
        }
        return numerator / denominator;
    }
}
