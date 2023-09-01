package RevisaoFPOO.Agenda;

public class Agenda {
    // atributos
    //
    String data;
    String hora;
    String dataHora;
    String servico;

    //
    //
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDataHora() {
        dataHora = data + hora; 
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public String getServico() {
        return servico;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public int getGetRegistroAnimal() {
        return getRegistroAnimal;
    }

    public void setGetRegistroAnimal(int getRegistroAnimal) {
        this.getRegistroAnimal = getRegistroAnimal;
    }

    int getRegistroAnimal;
    //
    // métodos
}
