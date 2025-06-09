package exercicio3_1;

public class MainExercicio3_1 {
    public static void main(String[] args) {
        Numero meuNumero = new Numero(10);

        System.out.println("Antes de imprimir o valor do atributo, o objeto meuNumero tem hashcode: " + System.identityHashCode(meuNumero));
        meuNumero.imprimirValor();

        meuNumero.setValor(50);
        System.out.println("Após alterar o valor, o objeto meuNumero tem hashcode: " + System.identityHashCode(meuNumero));
        meuNumero.imprimirValor();

        Numero outroNumero = new Numero(100);
        System.out.println("\nCriando outro objeto: outroNumero");
        System.out.println("O objeto outroNumero tem hashcode: " + System.identityHashCode(outroNumero));
        outroNumero.imprimirValor();
    }
}