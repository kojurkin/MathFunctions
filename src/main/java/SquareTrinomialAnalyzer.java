import org.example.SquareTrinome;

import java.util.ArrayList;
import java.util.List;

public class SquareTrinomialAnalyzer {
    private SquareTrinome s;
    public static double trinomialAnalyzer(SquareTrinome trinome) throws Exception {
        List<Double> list = trinome.Solution();
        if (list.size() == 0) {
            throw new Exception("No roots!!");
        } else {
            if(list.get(0) < list.get(1)) {
                return list.get(1);
            } else {
                return list.get(0);
            }
        }
    }
}
