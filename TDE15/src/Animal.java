
abstract class Animal {
    abstract String som();
}

class Cachorro extends Animal {
    @Override
    String som() {
        return "Au AU";
    }
}

class Gato extends Animal {
    @Override
    String som() {
        return "Miau";
    }
}
