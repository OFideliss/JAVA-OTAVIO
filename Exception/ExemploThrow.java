package Exception;

import javax.swing.JOptionPane;

public class ExemploThrow {
    public static void main(String[] args) {
        try {
            // digitação de senhas
            String senhaDigitada = JOptionPane.showInputDialog("Informe uma senha de 6 digitos");
            // se a senha tiver menos ou mais de 6 digitos
            if (senhaDigitada.length() < 6 || senhaDigitada.length() > 6) {
                throw new Exception("Senha Inválida");
            } else  {
                JOptionPane.showMessageDialog(null, "Senha Válida");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
}
