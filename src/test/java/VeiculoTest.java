import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeiculoTest {

    @Test
    void deveRetornarDistanciaMilha() {
        Veiculo veiculo = new Veiculo();
        veiculo.setDistanciaEstado("novo");

        assertEquals(0, veiculo.getDistancia());
    }

    @Test
    void deveRetornarDistanciaEstado() {
        Veiculo veiculo = new Veiculo();
        veiculo.setDistanciaEstado("velho");

        assertEquals(50, veiculo.getDistancia());
    }

}
