package belajar.unit.tes;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName("A Queue")
public class QueueTest {
    private Queue<String> queue;

    @Nested
    @DisplayName("When new")
    public class whenNew{

        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName("When offer, size must be 1")
        void offerOneName(){
            queue.offer("wildan");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName("When offer more, size must be 1")
        void offerMoreName(){
            queue.offer("akhmad");
            Assertions.assertEquals(1, queue.size());
        }
    }

}
