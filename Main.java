import Controller.CalculatorController;
import Service.ComplexNumberService;
import View.Menu;

public class Main {
    public static void main(String[] args) {
        ComplexNumberService service = new ComplexNumberService();  
        CalculatorController controller = new CalculatorController(service); 
        Menu menu = new Menu(controller);  
        menu.start(); 
    }
}

