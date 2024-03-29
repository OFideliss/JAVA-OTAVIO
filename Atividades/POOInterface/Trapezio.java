package POOInterface;

public class Trapezio implements FigurasGeometricas {
    int baseMenor;
    int baseMaior;
    int lado1;
    int lado2;

    // get set
    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(int baseMenor) {
        this.baseMenor = baseMenor;
    }

    public int getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(int baseMaior) {
        this.baseMaior = baseMaior;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    int altura;

    // construtores
    public Trapezio(int baseMenor, int baseMaior, int altura, int lado1, int lado2) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // métodos da classe FigurasGeometricas(interface)
    @Override
    public double getArea() {
        int area = (baseMaior + baseMenor) * altura / 2;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Trapezio";
    }

    @Override
    public double getPerimetro() {
        int perimetro = baseMaior + baseMenor + lado1 + lado2;
        return perimetro;
    }

}
