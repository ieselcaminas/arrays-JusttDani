public class paresimpares {
    public static void main(String[] args) {
        int[] array = {1,5,8,5,4,3,4,8,9,10};
        System.out.println("Hay " + par(array) + " numeros pares y " + impar(array) + " numeros impares.");
    }
    public static int par(int[] pos) {
        int max = 0;
        for (int i = 1; i < pos.length; i++) {
            if (pos[i]%2 == 0) {
                max++;
            }
        }
        return max;
    }
    public static int impar(int[] neg) {
        int max = 0;
        for (int i = 1; i < neg.length; i++) {
            if (neg[i]%2 != 0) {
                max++;
            }
        }
        return max;
    }
}
