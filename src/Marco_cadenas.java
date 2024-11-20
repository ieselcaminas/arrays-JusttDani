public class Marco_cadenas {
    public static void main(String[] args) {
        String[] cadenas = {"Hola", "esto", "es", "un", "marco"};
        for (int i = 0; i <creamarcos(cadenas).length ; i++) {
            System.out.println(creamarcos(cadenas)[i]);

        }
    }
    public static int max(String[] a) {
        int maxi = a[0].length();
        for (int i = 1; i < a.length; i++) {
            if (a[i].length() > maxi) {
                maxi = a[i].length();
            }
        }
        return maxi;
    }
    public static String[] creamarcos(String[]a){
        String estrella = "*";
        String espacio = " ";
        int max = max(a) + 4;
        String[] cadenas = new String[a.length+2];
        cadenas[0] = estrella.repeat(max);
        cadenas[cadenas.length-1] = estrella.repeat(max);
        for (int i = 1; i < cadenas.length-1; i++) {
            cadenas[i] = "* " + a[i-1] + espacio.repeat(max - a[i-1].length()-3) + estrella;
        }
        return cadenas;
    }
}
