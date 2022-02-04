package belajar.unit.tes;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

@Tag("integration-test")
public class ConditionTest {
    @Test
    public void testSystemProperties(){
        var props = System.getProperties();
        props.forEach((key, value) -> System.out.println(key+ ": " + value));
    }

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

    @Test
    @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void testEnabledSystemProperty(){
        // do test
    }

    @Test
    @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    public void testDisabledSystemProperty(){
        // do test
    }

    @Test
    @EnabledIfSystemProperties({
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void testEnabledSystemProperties(){

    }

    @Test
    @DisabledIfSystemProperties({
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    public void testDisabledSystemProperties(){

    }

    @Test
    @EnabledIfEnvironmentVariables({
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testEnabledIfEnvironmentVariables(){

    }

    @Test
    @DisabledIfEnvironmentVariables({
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    })
    public void testDisabledIfEnvironmentVariables(){

    }
}
