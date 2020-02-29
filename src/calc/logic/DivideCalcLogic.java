package calc.logic;

/**
 * 割り算計算ロジック
 * @author shibasaki
 */
public class DivideCalcLogic extends AbstractCalcLogic<Double> {

    @Override
    Double eachCalc(Integer value1, Integer value2) {
        if (value2.intValue() == 0) {
            return null;
        }
        return value1.doubleValue() / value2.doubleValue();
    }

}
