import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class FactoryTransTest {
    @Test
    @DisplayName("DevolverBicicleta")
    public void testGetTransporteReturnBicicletaNotNull() {
        IComun resultado = FactoryT.getTransporte(FactoryT.BICICLETA);
        assertTrue(resultado instanceof Bicicleta);
    }
    @Test
    @DisplayName("DevolverCamion")
    public void testGetTransporteReturnCamionNotNull() {
        IComun resultado = FactoryT.getTransporte(FactoryT.CAMION);
        assertTrue(resultado instanceof Camion);

    }

}