package ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FactorialViewTest {
    private FrameFixture window;

    @Before
    public void setUp() {
        FactorialView frame = GuiActionRunner.execute(() -> new FactorialView());
        window = new FrameFixture(frame.frame);
        window.show(); // Mostra a janela para teste
    }

    @After
    public void tearDown() {
        window.cleanUp();
    }

    @Test
    @GUITest
    public void testCalculateFactorial() {
        window.textBox("numberField").enterText("5");
        window.button("calculateButton").click();
        window.label("resultLabel").requireText("Resultado: 120");
    }

    @Test
    @GUITest
    public void testCalculateFactorialWithNegativeNumber() {
        window.textBox("numberField").enterText("-1");
        window.button("calculateButton").click();
        window.label("resultLabel").requireText("O número deve ser não-negativo.");
    }

    @Test
    @GUITest
    public void testCalculateFactorialWithInvalidInput() {
        window.textBox("numberField").enterText("abc");
        window.button("calculateButton").click();
        window.label("resultLabel").requireText("Por favor, insira um número válido.");
    }
}