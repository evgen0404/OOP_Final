package Service;

import Model.ComplexNumber;

public class ComplexNumberService {
    public ComplexNumber executeOperation(Operation operation, ComplexNumber a, ComplexNumber b) {
        return operation.execute(a, b);
    }
}
