import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) {

        ArrayList<String> pessoas = new ArrayList<>();
        pessoas.add("Josifaldo");
        pessoas.add("Gary");
        pessoas.add("Carlos");

        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println((i + 1) + " - " + pessoas.get(i));
        }
    }
}
