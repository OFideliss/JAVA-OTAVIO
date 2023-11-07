package app;

import Connection.ConnectionDAO;

public class Main {
    public static void main(String[] args) {
        new ConnectionDAO().criarTabela();
        new ConnectionDAO().inserir("Otavio", "otavio@gmail.com");
        new ConnectionDAO().inserir("OtavioA");
        // new ConnectionDAO().apagarTabela();
    }
}