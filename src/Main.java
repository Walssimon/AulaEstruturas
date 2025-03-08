public class Main {
    public static void main(String[] args) {
    Pilha<Integer> pilha = new Pilha<Integer>();


        pilha.empilhar(1);
        pilha.empilhar(2);
        pilha.empilhar(3);
        System.out.println("Desempilhar elemento " + pilha.desempilha());
        System.out.println(pilha);
        }

}