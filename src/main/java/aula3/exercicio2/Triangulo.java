package aula3.exercicio2;

public class Triangulo extends Figura {
    private double base;
    private double altura;

    public Triangulo() {
    }

    public Triangulo(String cor, double base, double altura) {
        super(cor);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return (base * altura) / 2;
    }

    @Override
    public String toString() {
        return "Triangulo [base = " + base + ", altura = " + altura + ", cor = " + super.getCor() + "]";
    }
}
