package exercicio3_1;

public class Numero {
    private int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("O valor do atributo é: " + this.valor);
    }
}