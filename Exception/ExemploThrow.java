package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        boolean aberto = true;

        while (aberto) {

            try {
                // data de nascimento
                String dataNascimento = JOptionPane.showInputDialog("Informe a Data de Nascimento [dd/mm/aa]");
                dataNascimento = dataNascimento.replace("/", "");
                // digitar login
                String login = JOptionPane
                        .showInputDialog("Informe seu Login");
                // digitação de senhas
                String senhaDigitada = JOptionPane
                        .showInputDialog("Informe uma senha de 6 digitos  (Não pode ser igual seu login)");
                // se senha for igual a login
                if (login.equals(senhaDigitada) || login == senhaDigitada) {
                    throw new Exception("A senha não pode ser igual ao seu login");
                }
                // se a senha tiver menos ou mais de 6 digitos
                if (senhaDigitada.length() < 6 || senhaDigitada.length() > 6) {
                    throw new Exception("Senha Inválida");
                }if (dataNascimento.equals(senhaDigitada)) {
                    throw new Exception("A senha não pode ser sua data de nascimento");
                } else {
                    JOptionPane.showMessageDialog(null, "Senha Válida");
                }
                aberto = false;
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
}
