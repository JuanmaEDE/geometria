package geometria;
import org.junit.Test;
import todos.Circulo_JMBM;

import static org.junit.Assert.assertEquals;


public class Circulo_JMBM_Test {
	@Test
    public void testRadioPositivo() {
        Circulo_JMBM c = new Circulo_JMBM(7, "Circulo");
        assertEquals(153.9384, c.area(), 0.0001);
        assertEquals(43.9824, c.perimetro(), 0.0001);
    }

    @Test
    public void testRadioCero() {
        Circulo_JMBM c = new Circulo_JMBM(0, "Circulo");
        assertEquals(0, c.area(), 0);
        assertEquals(0, c.perimetro(), 0);
    }

    @Test
    public void testRadioNegativo() {
        Circulo_JMBM c = new Circulo_JMBM(-3, "Circulo");
        assertEquals(28.2743, c.area(), 0.0001);
        assertEquals(18.8496, c.perimetro(), 0.0001);
    }

}
