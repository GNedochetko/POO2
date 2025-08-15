public class TiqueTaque {
    String estado; // estado do rel�gio

    public synchronized void tique(boolean running) {
        if (!running) { // desliga o rel�gio
            estado = "tiqueOff";
            return;
        }
        System.out.print("Tique ");
        estado = "tiqueOff"; // define o estado atual com tiqueOff
        // taque()
    }

    public synchronized void taque(boolean running) {
        if (!running) { // desliga o rel�gio
            estado = "taqueOff";
            return;
        }
        System.out.println("Taque");
        estado = "taqueOff"; // define o estado atual com taqueOff
        // tique()
    }
}
