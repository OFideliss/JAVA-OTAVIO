package POOInterface;

public class Retangulo implements FigurasGeometricas {
    int base;
    int altura;

    // get e set
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    // construtor
    public Retangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    // métodos da classe FigurasGeometricas(interface)
    @Override
    public double getArea() {
        double area = base * altura;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Retangulo";
    }

    @Override
    public double getPerimetro() {
        double perimetro = (base + altura) * 2;
        return perimetro;
    }

}
