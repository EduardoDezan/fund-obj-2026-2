
public class Ex2 {
    public static void main(String[] args) {
        int[] v = {10, 20, 30, 40, 50};
        System.out.println("Soma: " + soma(v));
    }
    static int soma(int[] v) {
        int total = 0;
        for(int x : v) {
            total += x;
        }
        return total;
    }
}
