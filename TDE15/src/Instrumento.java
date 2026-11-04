abstract class Instrumento {
    abstract String tocar();
}

class Violao extends Instrumento {
    @Override String tocar() { return "Dum degue dum dum dum"; }
}

class Bateria extends Instrumento {
    @Override String tocar() { return "Tum tum tá, ticatu catu tá"; }
}
