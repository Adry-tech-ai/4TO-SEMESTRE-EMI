import java.util.Random;
public class Ejercicio5 {
    public static void main(String[] args) {
        Random rnd = new Random();
        System.out.println(rnd.nextInt(2)+1);
        System.out.println(rnd.nextInt(101)+1);
        System.out.println(rnd.nextInt(10));
        System.out.println(rnd.nextInt(113)+1000);
        System.out.println(rnd.nextInt(2)-1);
        System.out.println(rnd.nextInt(14)-3);
    }
}
