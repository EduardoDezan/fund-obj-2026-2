import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> lista = new ArrayList<>();

        System.out.println("Quantos funcionários?");
        int quant = sc.nextInt();;

        for (int i = 0; i < quant; i++) {
            System.out.println("Nome:");
            String nome = sc.next();
            System.out.println("Tipo (h/m):");
            String tipo = sc.next();
            if (tipo.equalsIgnoreCase("h")) {
                System.out.println("Horas:");
                double horas = sc.nextDouble();
                System.out.println("Valor por hora:");
                double valor = sc.nextDouble();
                lista.add(new Horista(nome, horas, valor));
            }
            else if (tipo.equalsIgnoreCase("m")){
                System.out.println("Salário fixo:");
                double salario = sc.nextDouble();
                lista.add(new Mensalista(nome, salario));
            }
        }

        System.out.println("--- FOLHA ---");
        for (Funcionario func : lista) {
            func.contraCheque();
        }
    }
}
