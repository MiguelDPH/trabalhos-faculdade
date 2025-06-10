package prova_exercicio4;

public class PlanoTelefonia {
    private static final double VALOR_BASICO = 50.00;
    private static final int MINUTOS_FRANQUIA = 100;
    private static final double VALOR_POR_MINUTO_EXTRA = 2.00;

    private int minutosConsumidos;

    public PlanoTelefonia(int minutosConsumidos) {
        this.minutosConsumidos = minutosConsumidos;
    }

    public double calcularValorFinal() {
        if (minutosConsumidos <= MINUTOS_FRANQUIA) {
            return VALOR_BASICO;
        } else {
            int minutosExcedentes = minutosConsumidos - MINUTOS_FRANQUIA;
            return VALOR_BASICO + (minutosExcedentes * VALOR_POR_MINUTO_EXTRA);
        }
    }
}