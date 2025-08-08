import java.util.ArrayList;

public class CestaFrutas extends Thread{
    ArrayList<String> nomesFrutas;
    public CestaFrutas(ArrayList<String> nomesFrutas){
        this.nomesFrutas = nomesFrutas;
    }

    public void run(){
        System.out.println("Imprimindo as frutas da cesta...");
        try{
            for(int i = 0; i < nomesFrutas.size(); i++){
                Thread.sleep(400);
                System.out.println(i + ". " + nomesFrutas.get(i));
            }
        } catch (InterruptedException e) {
            System.out.println("Processo interrompido");
        }
        System.out.println("Fim da impressão");
    }
}
