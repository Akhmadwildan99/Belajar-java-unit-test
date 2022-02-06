package belajar.unit.tes;

import belajar.unit.tes.random.RandomParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;


public class RandomCalculatorTest extends AbstractCalculatorTest{

    @Test
    void testRandom(Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test Calculator repeat")
    @RepeatedTest(
            value = 10,
            name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
    )
    void testRandomRepeat(Random random){
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }


    @DisplayName("Test Calculator repeat")
    @RepeatedTest(
            value = 10,
            name = "{displayName}"
    )
    void testRandomRepeatInfo(Random random, TestInfo info, RepetitionInfo repetitionInfo){
        System.out.println(info.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions());
        var a = random.nextInt();
        var b = random.nextInt();

        var result = calculator.add(a, b);
        var expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName("Test Calculator")
    @ParameterizedTest(name = "{displayName} ke {0}")
    @ValueSource(ints = {1, 3, 4, 5, 6, 7, 8, 9, 10})
    void testParameterCalculator(int value){
        var expected = value + value;
        var result = calculator.add(value, value);
        System.out.println(expected);
        System.out.println(result);
        Assertions.assertEquals(expected, result);
    }
}
