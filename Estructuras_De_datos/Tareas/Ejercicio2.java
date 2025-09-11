import java.util.Scanner;

class Calcular{
    static double cargos(int tiempo){
        if(tiempo<=3){
            return 2;
        }else{
            return 2+(tiempo-3)*0.5;
        }
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite las horas de estacionamiento: ");
        int tiempo = sc.nextInt();
        System.out.println("\nEl cargo por el tiempo dado es: "+Calcular.cargos(tiempo));
    }
}
