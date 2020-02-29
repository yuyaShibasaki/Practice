package calc.model;

import calc.enumeration.CalcType;
import lombok.Getter;
import lombok.Setter;

/**
 * 計算データ
 * @author shibasaki
 */
@Getter
@Setter
public class CalcData {

    /** 値1 */
    private Integer value1;

    /** 値2 */
    private Integer value2;

    /** 計算種別 */
    private CalcType calcType;
}
