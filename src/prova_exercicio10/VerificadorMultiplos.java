package prova_exercicio10;

public class VerificadorMultiplos {

    public boolean saoMultiplos(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return num1 == 0 && num2 == 0;
        }
        return (num1 % num2 == 0) || (num2 % num1 == 0);
    }
}