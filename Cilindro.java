import javax.swing.JOptionPane;

// Leia a altura e o raio de um cilindro circular e imprima o volume do cilindro. O volume
//de um cilindro circular e calculado por meio da seguinte f ´ ormula: ´ V = π ∗ raio2 ∗ altura,
//onde π = 3.141592.

public class Cilindro{
 public static void main(String[] args) {
    String aCilindro = JOptionPane.showInputDialog(null, "Digite altura do cilindro: ");
    String rCilindro = JOptionPane.showInputDialog("Digite raio do cilindro: ");
    double a = Double.parseDouble(aCilindro);
    double r = Double.parseDouble(rCilindro);

    double v = Math.PI * Math.pow(2, r) * a;

    JOptionPane.showMessageDialog(null, "O volume do cilindro é: " + String.format("%.2f", v));
 }

}