package ex2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ex1.FatorialController;

class TestFatorialController {
	private FatorialController controller = new FatorialController();

    @Test
    public void testCalcularFatorial() {
        assertEquals(1, controller.calculateFactorial(0));
        assertEquals(1, controller.calculateFactorial(1));
        assertEquals(2, controller.calculateFactorial(2));
        assertEquals(6, controller.calculateFactorial(3));
        assertEquals(24, controller.calculateFactorial(4));
    }

    @Test
    public void testCalcularFatorialNumeroNegativo() {
        assertThrows(IllegalArgumentException.class, () -> {
            controller.calculateFactorial(-1);
        });
    }

}
