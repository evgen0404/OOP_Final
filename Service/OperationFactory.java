package Service;

public class OperationFactory {
    public static Operation getOperation(String operation) {
        switch (operation) {
            case "add":
                return new Addition();
            case "multiply":
                return new Multiplication();
            case "divide":
                return new Division();
            default:
                throw new IllegalArgumentException("Неизвестная операция");
        }
    }
}

