package prova_exercicio6;

public class MedidorGlicose {
    private double nivelGlicose;

    public MedidorGlicose(double nivelGlicose) {
        this.nivelGlicose = nivelGlicose;
    }

    public String classificarGlicose() {
        if (nivelGlicose <= 100.0) {
            return "normal";
        } else if (nivelGlicose <= 140.0) {
            return "elevado";
        } else {
            return "diabetes";
        }
    }
}