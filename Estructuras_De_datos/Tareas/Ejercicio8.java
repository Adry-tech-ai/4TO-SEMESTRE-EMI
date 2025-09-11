import java.util.Scanner;
class Calc{
    static double hipotenusa(double a, double b){
        return Math.pow(Math.pow(a, 2)+Math.pow(b, 2), 0.5);
    }
}
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println(Calc.hipotenusa(a, b));
    }
}
