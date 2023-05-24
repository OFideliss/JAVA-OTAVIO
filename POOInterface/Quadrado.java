package POOInterface;

public class Quadrado implements FigurasGeometricas { // ma interface é usado o "implements" ao inves de "extend" das
                                                      // classes
    int lado; // declarando variavel

    // construtor
    public Quadrado(int lado) {
        this.lado = lado;
    }

    // set e get
    public int getlado() {
        return lado;
    }

    public void setlado(int lado) {
        this.lado = lado;
    }

    // métodos da classe FigurasGeometricas(interface)
    @Override
    public double getArea() {
        int area = lado * lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4 * lado;
        return perimetro;
    }

}
