
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Escolha o tamanho da pilha");
        int tamanho = input.nextInt();

        Pilha pilha = new Pilha(tamanho);

        while (true) {
            System.out.println("0 - Sair");
            System.out.println("1 - Adicionar elemento na pilha");
            System.out.println("2 - Remover elemento do topo da pilha");
            int escolha = input.nextInt();

            switch (escolha) {
                case 0:
                    return;
                case 1:
                    System.out.println("Digite um valor");
                    int valor = input.nextInt();

                    pilha.push(valor);
                    System.out.println();
                    break;
                case 2:
                    pilha.pop();
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção incorreta");
                    break;
            }

            pilha.exibirPilha();
        }
    }
}
