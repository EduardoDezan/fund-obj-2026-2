interface Ligavel {
    void ligar();
}

interface Recarregavel {
    void recarregar();
}

class Celular implements Ligavel, Recarregavel {
    public void ligar() { System.out.println("Celular ligou."); }
    public void recarregar() { System.out.println("Celular recarregando."); }
}
