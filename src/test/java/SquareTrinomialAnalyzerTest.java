import static org.junit.jupiter.api.Assertions.*;
import org.example.SquareTrinome;

import java.util.ArrayList;
import java.util.List;

class SquareTrinomialAnalyzerTest {

    @org.junit.jupiter.api.Test
    void trinomialAnalyzer() throws Exception {
        SquareTrinome s = new SquareTrinome(4, 64, -78);
        double res = SquareTrinomialAnalyzer.trinomialAnalyzer(s);
        assertEquals(1.137, res, 0.001);
    }
}