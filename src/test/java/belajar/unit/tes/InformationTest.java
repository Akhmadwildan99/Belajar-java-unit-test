package belajar.unit.tes;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Tags;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;


@DisplayName("information-test")
class InformationTest {

    @Test
    @Tags({
            @Tag("one"),
            @Tag("two")
    })
    @DisplayName("test 1")
    void test1(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass().orElse(null));
        System.out.println(testInfo.getTestMethod().orElse(null));
    }
}
