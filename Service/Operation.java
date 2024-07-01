package Service;

import Model.ComplexNumber;
import Utility.Loggable;

public interface Operation extends Loggable {
    ComplexNumber execute(ComplexNumber a, ComplexNumber b);
}
