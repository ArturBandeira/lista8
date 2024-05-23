package ex1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FatorialView {
    private JFrame frame;
    private JTextField numberField;
    private JButton calculateButton;
    private JLabel resultLabel;
    private FatorialController calculator;

    public FatorialView() {
        calculator = new FatorialController();

        frame = new JFrame("Calculadora de Fatorial");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel numberLabel = new JLabel("Número:");
        numberLabel.setBounds(10, 20, 80, 25);
        frame.add(numberLabel);

        numberField = new JTextField(20);
        numberField.setBounds(100, 20, 165, 25);
        frame.add(numberField);
        numberField.setName("numberField");

        calculateButton = new JButton("Calcular");
        calculateButton.setBounds(10, 80, 120, 25);
        frame.add(calculateButton);
        calculateButton.setName("calculateButton");

        resultLabel = new JLabel("Resultado:");
        resultLabel.setBounds(10, 120, 250, 25);
        frame.add(resultLabel);
        resultLabel.setName("resultLabel");

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateFactorial();
            }
        });

        frame.setVisible(true);
    }
    
    private void calculateFactorial() {
        try {
            int number = Integer.parseInt(numberField.getText());
            long result = calculator.calculateFactorial(number);
            resultLabel.setText("Resultado: " + result);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Por favor, insira um número válido.");
        } catch (IllegalArgumentException ex) {
            resultLabel.setText(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        new FatorialView();
    }
}