package exercicio1_2;

public class VerificadorPalindromo {

    public boolean ePalindromo(String palavra) {
        palavra = palavra.replace(" ", "").toLowerCase();
        int tamanho = palavra.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
