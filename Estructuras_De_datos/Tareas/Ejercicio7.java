import java.util.Scanner;
class Calcular{
    static int potencia(int base, int exponente){
        int r = 1;
        for(int i = 0 ; i<exponente; i++){
            r = r*2;
        }
        return r;
    }
}
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite la base: ");
        int base = sc.nextInt();
        System.out.print("Digite el exponente: ");
        int exponente = sc.nextInt();
        System.out.println("El resultado es: "+ Calcular.potencia(base, exponente)  );
    }
}
