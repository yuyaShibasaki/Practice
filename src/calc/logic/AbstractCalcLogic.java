package calc.logic;

/**
 * 計算ロジック基底クラス
 * @author shibasaki
 * @param <T> 計算結果のオブジェクト型
 */
public abstract class AbstractCalcLogic<T extends Number> {

    /**
     * 指定された2つの値で計算を行います。
     * @param value1 値1
     * @param value2 値2
     * @return 計算結果
     */
    public T calc(Integer value1, Integer value2) {
        if (value1 == null || value2 == null) {
            return null;
        }
        return eachCalc(value1, value2);
    }

    /**
     * 計算種別に応じた計算を行います。
     * @param value1 値1
     * @param value2 値2
     * @return 計算結果
     */
    abstract T eachCalc(Integer value1, Integer value2);
}
