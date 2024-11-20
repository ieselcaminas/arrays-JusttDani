import java.util.Scanner;

public class suma_pos_neg {
    public static void main(String[] args) {
        int[] a = rellenar(10);
        System.out.println("La suma de los positivos es: " + positivos(a) + " y la suma de los negativos es: " + negativo(a));

    }

    public static int[] rellenar(int n) {
        Scanner sc = new Scanner(System.in);
        int[] relleno = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Dame otro numero");
            relleno[i] = sc.nextInt();
        }
        return relleno;
    }
    public static int positivos(int[] pos) {
        int max = 0;
        for (int i = 1; i < pos.length; i++) {
            if (0 < pos[i]) {
                max =max + pos[i];
            }
        }
        return max;
    }
    public static int negativo(int[] neg) {
        int max = 0;
        for (int i = 1; i < neg.length; i++) {
            if (0 > neg[i]) {
                max =max + neg[i];
            }
        }
        return max;
    }

}
