
public class Ex5 {
    public static void main(String[] args) {
        int[] v = {1, 2, 3, 10, 777, 54};
        int pares = 0;
        int impares = 0;

        for(int x : v) {
            if (x % 2 == 0) {
                pares++;
            }
            else {
                impares++;
            }
        }
        System.out.println("Pares: " + pares);
        System.out.println("Ímpares: " + impares);
    }
}
