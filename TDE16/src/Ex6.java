import java.util.ArrayList;
import  java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Identificavel> lista = new ArrayList<>();

        System.out.println("Quantas pessoas?");
        int quant = sc.nextInt();

        for (int i = 0; i < quant; i++) {
            System.out.println("Tipo (c/f):");
            String tipo = sc.next();
            System.out.println("Nome:");
            String nome = sc.next();

            if (tipo.equalsIgnoreCase("c")) {
                System.out.println("CPF:");
                String cpf = sc.next();
                lista.add(new Cliente(nome, cpf));
            }
            else if (tipo.equalsIgnoreCase("f")) {
                System.out.println("Matricula:");
                String matricula = sc.next();
                lista.add(new Funcionario(nome, matricula, 0));
            }
        }

        System.out.println("=== LISTA ===");
        for (Identificavel i : lista) {
            System.out.println(i.identificacao());
        }
    }
}
