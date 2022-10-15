package com.pknn.javacourse.lesson13;
import org.junit.Test;

public class CarServiceTest {
    @Test
    public void shouldDemonstrateLogger() {
        CarService service = new CarService();
        service.process("test");
    }


}
