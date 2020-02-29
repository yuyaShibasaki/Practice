package calc.logic;

/**
 * 引き算計算ロジック
 * @author shibasaki
 */
public class MinusCalcLogic extends AbstractCalcLogic<Integer> {

    @Override
    Integer eachCalc(Integer value1, Integer value2) {
        return value1.intValue() - value2.intValue();
    }

}
