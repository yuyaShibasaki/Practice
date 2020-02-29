package calc.service;

import calc.enumeration.CalcType;
import calc.logic.AbstractCalcLogic;
import calc.logic.DivideCalcLogic;
import calc.logic.MinusCalcLogic;
import calc.logic.MultiplyCalcLogic;
import calc.logic.PlusCalcLogic;
import calc.model.CalcData;

/**
 * 計算サービス
 * @author shibasaki
 */
public class CalcService {

    /**
     * 計算を行います。
     * @param calcData 計算データ
     * @return 計算結果
     */
    public Number execCalc(CalcData calcData) {

        CalcType calcType = calcData.getCalcType();

        AbstractCalcLogic<?> logic = null;
        if (calcType == CalcType.PLUS) {
            logic = new PlusCalcLogic();
        } else if(calcType == CalcType.MINUS) {
            logic = new MinusCalcLogic();
        } else if(calcType == CalcType.MULTIPLY) {
            logic = new MultiplyCalcLogic();
        } else if(calcType == CalcType.DIVIDE) {
            logic = new DivideCalcLogic();
        } else {
            throw new IllegalArgumentException("計算種別が不正");
        }

        return logic.calc(calcData.getValue1(), calcData.getValue2());
    }
}
