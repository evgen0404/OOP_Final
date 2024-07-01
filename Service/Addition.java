package Service;

import Model.ComplexNumber;

public class Addition implements Operation {
    @Override
    public ComplexNumber execute(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber(a.getReal() + b.getReal(), a.getImag() + b.getImag());
        log("Сложение: " + a + " + " + b + " = " + result);
        return result;
    }

    @Override
    public void log(String message) {
        System.out.println(message);
    }
}


