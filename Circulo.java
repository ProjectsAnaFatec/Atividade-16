import javax.swing.JOptionPane;

public class Circulo {
    public static void main(String[] args) {
        String sRaio = JOptionPane.showInputDialog("Digite o raio: ");
        double r = Double.parseDouble(sRaio);

        double area =  Math.PI * r * r;
        JOptionPane.showMessageDialog(null,"Area = " + String.format("%.2f", area ), 
        "Resultado", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
