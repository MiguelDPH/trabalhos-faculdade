package exercicio1_3;

public class Fatorial {
    public int calcularFatorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calcularFatorial(n - 1);
        }
    }
}
