package main.java.com.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            System.out.println("10/2 = " + calculator.divide(10, 2));
            System.out.println("10/0= " + calculator.divide(10, 0));
        } catch (DivisionByZeroException e) {
            System.err.println(e.getMessage());
        }







    }
}