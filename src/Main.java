import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Fila<Integer> fila = new Fila<Integer>();
        fila.enfileira(1);
        fila.enfileira(2);
        fila.enfileira(3);

        System.out.println(fila.toString());
        System.out.println(fila.desenfileirar());
        System.out.println(fila.toString());
        }

}