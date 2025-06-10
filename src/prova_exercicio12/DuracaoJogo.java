package prova_exercicio12;

public class DuracaoJogo {
    private int horaInicial;
    private int horaFinal;

    public DuracaoJogo(int horaInicial, int horaFinal) {
        this.horaInicial = horaInicial;
        this.horaFinal = horaFinal;
    }

    public int calcularDuracao() {
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else if (horaInicial > horaFinal) {
            duracao = 24 - horaInicial + horaFinal;
        } else {
            duracao = 24;
        }
        return duracao;
    }
}