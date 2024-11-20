public class Media_array {
    public static void main(String[] args) {
        int[] array = {1,5,8,5,4,3,4,8,9,10};
        System.out.println("La media del array es " + media(array));

    }
    public static float media(int[] a){
        float resultado = 0;
        for (int j : a) {
            resultado = resultado + j;
        }
        return resultado/10;
    }
}
