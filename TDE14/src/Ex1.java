
public class Ex1 {
    public static void main(String[] args) {
        Animal[] animais = { new Cachorro(), new Gato(), new Vaca()};

        for (Animal animal : animais) {
            System.out.println(animal.som());
        }
    }
}
