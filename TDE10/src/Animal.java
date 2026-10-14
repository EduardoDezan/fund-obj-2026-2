class Animal {
    String som() {
        return "eae";
    }
}
class Cachorro extends Animal {
    @Override String som() {
        return "Au au";
    }
}
class Gato extends Animal {
    @Override String som() {
        return "Miau";
    }
}
