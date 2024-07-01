package Service;

import Model.ComplexNumber;


public class Division implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        double denom = b.getReal() * b.getReal() + b.getImag() * b.getImag();
        double real = (a.getReal() * b.getReal() + a.getImag() * b.getImag()) / denom;
        double imag = (a.getImag() * b.getReal() - a.getReal() * b.getImag()) / denom;
        ComplexNumber result = new ComplexNumber(real, imag);
        log("Деление: " + a + " / " + b + " = " + result);
        return result;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}
