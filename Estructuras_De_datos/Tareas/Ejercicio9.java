import java.util.Scanner;
class Calcu{
    static boolean multiplo(int a, int b){
        if(a%b==0){
            return true;
        }else{
            return false;
        }
    }    
}

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Calcu.multiplo(a, b));
    }
}
