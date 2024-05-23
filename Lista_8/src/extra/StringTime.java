package extra;

public class StringTime {
    public static void main(String[] args) {
        int k = 1000;
        String s = "";
        StringBuffer strBuff = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            s += "palavra";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Tempo usando String: " + (endTime - startTime) + " ms");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < k; i++) {
            strBuff.append("palavra");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Tempo usando StringBuffer: " + (endTime - startTime) + " ms");
    }
}

//Vemos que o tempo para realizar as concatenações com a string (aproximadamente 11 ms) é maior do que o tempo para realizar as operacoes com a StringBuffer (aproximadamente 1 ms)
//
//Essa diferença ocorre pois os objetos da classe "string" sao imutaveis, ou seja, a cada concatenaçao um novo objeto da classe string é criado, resultando em
//um maior uso de tempo e memoria para realizar as operações. Ao contrario da "string", os objetos da "StringBuffer" sao mutaveis, assim, as concatenações ocorrem
//no proprio objeto ja existente, resultando em um menor uso de memoria e tempo, sendo mais veloz para realizar as contatenações.