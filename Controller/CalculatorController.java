package Controller;

import Model.ComplexNumber;
import Service.ComplexNumberService;
import Service.Operation;

public class CalculatorController {
    private final ComplexNumberService service;

    public CalculatorController(ComplexNumberService service) {
        this.service = service;
    }

    public ComplexNumber execute(Operation operation, ComplexNumber a, ComplexNumber b) {
        return service.executeOperation(operation, a, b);
    }
}

