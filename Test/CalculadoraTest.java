import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void calculo() {
        Calculadora calc = new Calculadora();

        String exp = "9/3";
        int val = Integer.parseInt(calc.calculo(exp));

        assertEquals(3,val);
    }
}