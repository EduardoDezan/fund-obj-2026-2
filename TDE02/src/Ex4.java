

public class Ex4 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 10, 4, 777};
        System.out.println("Maior: " + maior(v));
    }
    static int maior(int[] v) {
        int max = v[0];
        for (int i = 1; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
        }
        return max;
    }
}
