class Animal {
    String som() { return "aoba"; }
}

class Cachorro extends Animal {
    @Override String som() { return "aur aur aur"; }
}

class Gato extends Animal {
    @Override String som() { return "miau"; }
}

class Vaca extends Animal {
    @Override String som() { return "mooooooooooooo"; }
}