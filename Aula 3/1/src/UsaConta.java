public class UsaConta {
    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria();
        Pessoa p1 = new Pessoa("Pessoa 1", contaBancaria);
        Pessoa p2 = new Pessoa("Pessoa 2", contaBancaria);

        try{
            p1.thread.join();
            p2.thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
