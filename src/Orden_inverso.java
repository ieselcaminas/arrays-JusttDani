import java.util.Scanner;

public class Orden_inverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[10];
        for (int i = 0; i < 10 ; i++) {
            System.out.print("dime un numero: ");
            array[i] = sc.nextInt() ;
        }
        for (int i = 9; i > -1 ; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
