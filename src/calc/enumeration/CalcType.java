package calc.enumeration;

import lombok.Getter;

/**
 * 計算種別
 * @author shibasaki
 */
@Getter
public enum CalcType {
    PLUS("足し算"),
    MINUS("引き算"),
    MULTIPLY("掛け算"),
    DIVIDE("割り算")
    ;

    /** 種別名 */
    private String name;

    /**
     * コンストラクタ
     * @param name 種別名
     */
    private CalcType(String name) {
        this.name = name;
    }
}
