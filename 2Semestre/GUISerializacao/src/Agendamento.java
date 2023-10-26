import java.io.Serializable;

public class Agendamento implements Serializable{
    // atributos
    String usuario;
    String data;
    String hora;
    String descricao;

    // métodos
    public Agendamento(String usuario, String data, String hora, String descricao) {
        this.usuario = usuario;
        this.data = data;
        this.hora = hora;
        this.descricao = descricao;
    }

    // get and set
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
