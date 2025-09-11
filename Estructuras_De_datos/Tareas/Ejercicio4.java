import java.util.Scanner;
class Redondear{
    static double AInteger(double x){
        return Math.floor(x+0.5);
    }
    static double ADecimal(double x){
        return Math.floor(x*10+0.5)/10;
    }
    static double ACentecima(double x){
        return Math.floor(x*100+0.5)/100;
    }
    static double AMilesimas(double x){
        return Math.floor(x*1000+0.5)/1000;
    }
}
public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        System.out.printf("redondearAInteger: %f\nredondearADecimas: %f\nredondearACentesimas: %f\nredondearAMilesimas: %f\n",Redondear.AInteger(x),Redondear.ADecimal(x),Redondear.ACentecima(x),Redondear.AMilesimas(x));
    }
}