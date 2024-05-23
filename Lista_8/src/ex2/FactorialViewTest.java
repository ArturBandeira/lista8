package ex2;
// para realizar testes de aceitação, fizemos este teste automatico para o FatorialView e o teste de unidade para Fatorial Controller
import org.assertj.swing.core.BasicRobot;
import org.assertj.swing.edt.GuiActionRunner;
import org.assertj.swing.fixture.FrameFixture;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FatorialAcceptanceTest {
    private FrameFixture window;

    @BeforeEach
    public void setUp() {
        FatorialView view = GuiActionRunner.execute(FatorialView::new);
        new FatorialController(view, new Fatorial());
        window = new FrameFixture(BasicRobot.robotWithNewAwtHierarchy(), view.getFrame());
        window.show();
    }

    @AfterEach
    public void tearDown() {
        window.cleanUp();
    }

    @Test
    public void testCalculoFatorialValido() {
        window.textBox().enterText("5");
        window.button().click();
        window.label().requireText("Resultado: 120");
    }

    @Test
    public void testEntradaInvalida() {
        window.textBox().enterText("abc");
        window.button().click();
        window.label().requireText("Por favor, insira um número válido");
    }

    @Test
    public void testNumeroNegativo() {
        window.textBox().enterText("-1");
        window.button().click();
        window.label().requireText("O número de ser não-negativo");
    }
}

//A diferença entre os testes de unidade (os quais podem ser feitos pelo Junit) e os testes automaticos é o objeto de teste, uma vez que 
//o teste de unidade testa cada parte do codigo isoladamente e verifica o seu funcionamento, enquanto o teste automatico testa fluxos ao inves de
//partes isoladas