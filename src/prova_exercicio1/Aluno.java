package prova_exercicio1;

public class Aluno {
    private double nota1Semestre;
    private double nota2Semestre;

    public Aluno(double nota1Semestre, double nota2Semestre) {
        this.nota1Semestre = nota1Semestre;
        this.nota2Semestre = nota2Semestre;
    }

    public double calcularNotaFinal() {
        return nota1Semestre + nota2Semestre;
    }

    public String verificarAprovacao() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal < 60.00) {
            return "reprovado";
        } else {
            return "aprovado";
        }
    }
}