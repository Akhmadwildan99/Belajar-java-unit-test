package belajar.unit.tes;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.List;

public class MockTest {
    @Test
    void mockTest() {
        List<String> mockedList = Mockito.mock(List.class);
        Mockito.when(mockedList.get(0)).thenReturn("wildan");
        System.out.println(mockedList.get(0));
        System.out.println(mockedList.get(0));
        Mockito.verify(mockedList, Mockito.times(2)).get(0);
        // Hanya boleh dipanggil sesuai parameter Mockito.times
    }
}
