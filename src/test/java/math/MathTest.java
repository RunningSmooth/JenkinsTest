package math;

import de.materna.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathTest {
    public Main main = new Main();

    @Test
    void addition() {
        assertEquals(4, main.sum(2, 2));
    }
}
