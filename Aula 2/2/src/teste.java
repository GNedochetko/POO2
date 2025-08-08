import java.util.ArrayList;

public class teste {
    public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        frutas.add("Banana");
        frutas.add("Maça");
        frutas.add("Pessego");
        CestaFrutas cesta = new CestaFrutas(frutas);
        cesta.start();
    }
}
