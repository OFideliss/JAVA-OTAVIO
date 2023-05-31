package POOInterface;

// interface. Uma classe interface é uma classe naturalmente abstract. os objetos 
public interface FigurasGeometricas {
// todas as subclasses de FigurasGeometricas precisam obrigatoriamente usar os metódos declarados
    public String getNomeFigura();

    public double getArea();

    public double getPerimetro();
}