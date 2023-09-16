import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {
        String sValor = JOptionPane.showInputDialog("Digite o valor para saque: ");
        int  v = Integer.parseInt(sValor);

        int TotalN1 = v / 50;
        int RestoN1 = v % 50;
        int TotalN2 = RestoN1 / 20;
        


        JOptionPane.showMessageDialog(null, args, sValor, Reston);
    }
}
