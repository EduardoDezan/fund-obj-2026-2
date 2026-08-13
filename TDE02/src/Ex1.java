

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("4 é par? " + checkPar(4));
        System.out.println("7 é par? " + checkPar(7));
    }
    static boolean checkPar(int n) {
        return n % 2 == 0;
    }
}
