package belajar.unit.tes;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;


public class ConditionTest {

    @Test
    @EnabledOnOs({OS.WINDOWS})
    public void testRunOnWindows(){

    }

    @Test
    @DisabledOnOs({OS.WINDOWS})
    public void testDisabledOnWindows(){

    }

    @Test
    @EnabledOnJre({JRE.JAVA_8})
    void testEnabledOnJava8() {
    }

    @Test
    @DisabledOnJre({JRE.JAVA_8})
    void testDisabledOnJava8() {
    }

    @Test
    @EnabledForJreRange(min=JRE.JAVA_12, max = JRE.JAVA_17)
    void testEnabledOnJava11ToJava17() {
    }

    @Test
    @DisabledForJreRange(min=JRE.JAVA_12, max = JRE.JAVA_17)
    void testDisabledOnJava11ToJava17() {
    }
}
