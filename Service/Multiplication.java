package Service;

import Model.ComplexNumber;

public class Multiplication implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImag() * b.getImag();
        double imag = a.getReal() * b.getImag() + a.getImag() * b.getReal();
        ComplexNumber result = new ComplexNumber(real, imag);
        log("Умножение: " + a + " * " + b + " = " + result);
        return result;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
