package calc.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calc.enumeration.CalcType;
import calc.model.CalcData;

/**
 * 計算サービステストクラス
 * @author shibasaki
 */
public class CalcServiceTest {

    @Test
    void testExecCalc() {

        CalcService service = new CalcService();

        // 足し算
        assertEquals(3, service.execCalc(createData(2, 1, CalcType.PLUS)));

        // 引き算
        assertEquals(5, service.execCalc(createData(8, 3, CalcType.MINUS)));

        // 掛け算
        assertEquals(24, service.execCalc(createData(6, 4, CalcType.MULTIPLY)));

        // 割り算
        assertEquals(9.0, service.execCalc(createData(45, 5, CalcType.DIVIDE)));
        assertNull(service.execCalc(createData(10, 0, CalcType.DIVIDE)));

        // 異常系
        assertNull(service.execCalc(createData(null, 2, CalcType.PLUS)));
        assertNull(service.execCalc(createData(2, null, CalcType.PLUS)));
        assertThrows(IllegalArgumentException.class, () -> service.execCalc(createData(2, 1, null)));
    }

    private CalcData createData(Integer value1, Integer value2, CalcType calcType) {
        CalcData data = new CalcData();
        data.setValue1(value1);
        data.setValue2(value2);
        data.setCalcType(calcType);
        return data;
    }

}
