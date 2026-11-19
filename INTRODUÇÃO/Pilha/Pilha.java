public class Pilha {
    private final int TAMANHO;
    private Integer[] pilha;
    private int topo = -1;
    

    public Pilha(int tamanho) {
        this.TAMANHO = tamanho;

        pilha = new Integer[TAMANHO];
    }

    public Integer push(int valor) {
        if (topo == pilha.length - 1) {
            System.out.println("A pilha está cheia");
            return null;
        }

        topo++;
        pilha[topo] = valor;
        return valor;
    }

    public void pop() {
        if(topo == -1) {
            System.out.println("A pilha está vazia");
            return;
        }

        pilha[topo] = null;
        topo--;
    }

    public void exibirPilha() {
        for(int i = (pilha.length - 1); i >= 0; i--) {
            System.out.println(pilha[i]);
        }
    }
}
