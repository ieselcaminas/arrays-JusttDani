import java.util.Scanner;

public class DNI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dni = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Enter DNI " + i + ":");
            dni[i] = sc.nextInt();
        }
        System.out.println("La letra del DNI es " + dnicreator(dni));
    }
    public static String dnicreator(int[] a){
        int resultado = 0;
        String b = "TRWAGMYFPDXBNJZSQVHLCKE";
        for (int i = 0; i < a.length ; i++) {
            resultado = (int) (resultado + (a[i]*Math.pow(10,a.length-1 - i)));
        }
        resultado = resultado%23;
        return b.charAt(resultado) + "";
        }
    }
