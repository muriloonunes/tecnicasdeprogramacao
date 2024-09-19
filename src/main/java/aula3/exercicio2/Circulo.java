package aula3.exercicio2;

public class Circulo extends Figura {
    private double raio;

    public Circulo(String cor, double raio) {
        super(cor);
        this.raio = raio;
    }

    public Circulo() {
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * raio * raio;
    }

    @Override
    public String toString() {
        return "Circulo [raio = " + raio + ", cor = " + super.getCor() + "]";
    }
}
