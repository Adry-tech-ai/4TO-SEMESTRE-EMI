import java.util.Random;
public class Ejercicio6 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int[] l_1 = {2, 4, 6, 8, 10};
        int[] l_2 = {3, 5, 7, 9, 11};
        int[] l_3 = {6, 10, 14, 18, 22};

        System.out.println(l_1[rnd.nextInt(5)]+"\n"+l_2[rnd.nextInt(5)]+"\n"+l_3[rnd.nextInt(5)]);
    }
}
