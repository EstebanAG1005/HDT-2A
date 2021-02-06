import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackVectorTest {

    @Test
    void push() {
        StackVector<Integer> calc = new StackVector<Integer>();
        calc.push(3);
        calc.push(5);

        int val = calc.pop();
        assertEquals(5,val);
    }
}