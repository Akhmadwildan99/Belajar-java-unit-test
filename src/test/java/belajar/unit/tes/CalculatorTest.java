package belajar.unit.tes;

import belajar.unit.tes.displayNameGenerator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Test untuk Calculator class")
@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println( "After All"
        );
    }

    @BeforeEach
    public void setUp(){
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown(){
        System.out.println("After each");
    }
    @Test
//    @DisplayName("Test skenario sukses untuk method add(Integer, Integer)")
    public void testAddSuccess(){
        var result = calculator.add(20, 30);
        assertEquals(50, result);
    }

    @Test
    @Disabled
    public void testDivideSuccess(){
        Integer divide = calculator.divide(20, 10);
        assertEquals(2, divide);
    }

    @Test
    public void testDivideFailed(){
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
}
