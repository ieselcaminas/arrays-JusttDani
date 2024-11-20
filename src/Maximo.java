import java.util.Scanner;

public class Maximo {
    public static void main(String[] args) {
        System.out.println("El numero maximo es " + maximo(rellenar(10)));

    }
    public static int[] rellenar( int n) {
        Scanner sc = new Scanner(System.in);
        int[] relleno = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dame otro numero");
            relleno[i] = sc.nextInt();
        }
        return relleno;
    }
    public static int maximo(int[] maxi) {
        int max = maxi[0];
        for (int i = 1; i < maxi.length; i++) {
            if (max < maxi[i]) {
                max = maxi[i];
            }
        }
        return max;
    }
}
