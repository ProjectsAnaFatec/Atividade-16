import java.util.Scanner;
public class Temperatura{

public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a temperatura Celsius: ");
    double c = scanner.nextDouble();
    double f = 9 * c / 5 + 32;
    System.out.println(c + "A temperatura em celsius convertida para Fahrenheit: " + f);
    
 scanner.close();
}

}