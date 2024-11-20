public class Minimo {
    public static void main(String[] args) {
        int[] a = {10,9,2,33,6,5,7,55,44,267};
        System.out.println(minimo(a));

    }
    public static int minimo(int[] min) {
        int max = min[0];
        for (int i = 1; i < min.length; i++) {
            if (max > min[i]) {
                max = min[i];
            }
        }
        return max;
    }
}
