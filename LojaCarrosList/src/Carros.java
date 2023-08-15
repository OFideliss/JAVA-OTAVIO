package LojaCarrosList.src;

import javax.swing.JOptionPane;

public class Carros {
    // Atributos
    String marca;
    String modelo;
    String ano;
    String cor;

    //
    // métodos
    // Construtor ((2) cheio, vazio)
    // construtor cheio
    public Carros(String marca, String modelo, String ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    //
    // construtor vazio
    public Carros() {
    }

    //
    // getters and setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    //
    // =============================================================
    //
    // método próprio
    public String imprimirLN() { // listar
        String imprimir = marca + " " + modelo +"\n";
        return imprimir;
    }

    //
    public void imprimir() { // consultar
        JOptionPane.showMessageDialog(null, marca + "\n" + modelo + "\n" + ano + "\n" + cor);
    }
}
