import javax.swing.JTabbedPane;

public class Jtabbedpane extends JTabbedPane{
    public Jtabbedpane() {
        super();
        this.add("Custo Viagem",new CalculadoraCustoViagem());
        this.add("IMC",new CalculadoraCustoViagem());
        this.add("Regra de tres",new CalcRegra3());
    }
}

