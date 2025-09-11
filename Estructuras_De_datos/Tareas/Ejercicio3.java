import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite un numero decimal: ");
        double x = sc.nextDouble();
        System.out.println("El numero original: "+ x + "\tEl numero redondeado: " + Math.floor( x + 0.5 ));
    }
}
