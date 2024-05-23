package ex1;

public class FatorialController {

    public long calculateFactorial(int number) throws IllegalArgumentException {
        if (number < 0) {
            throw new IllegalArgumentException("O número deve ser não-negativo.");
        }
        long result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        if(result <= 0) {
        	throw new IllegalArgumentException("Numero maior do que o maximo tamanho");
        }
        return result;
    }
}