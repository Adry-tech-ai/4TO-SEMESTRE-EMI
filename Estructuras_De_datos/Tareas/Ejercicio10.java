import java.util.Scanner;
class Calcul{
    static boolean par(int a){
        if(a%2==0){
            return true;
        }else{
            return false;
        }
    }    
}

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Calcul.par(a));
    }
}

