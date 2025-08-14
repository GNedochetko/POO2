public class Pessoa implements Runnable{
    Thread thread;
    ContaBancaria contaBancaria;

    public Pessoa(String nome, ContaBancaria contaBancaria){
        thread = new Thread(this, nome);
        this.contaBancaria = contaBancaria;
        thread.start();
    }

    public void run(){
        for(int i = 0; i < 10000; i++){
            contaBancaria.sacar(200);
            contaBancaria.depositar(200);
        }
        System.out.println("Saldo de " + thread.getName() + ": " + contaBancaria.getSaldo());
    }
}
