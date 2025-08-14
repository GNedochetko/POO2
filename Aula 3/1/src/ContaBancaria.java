public class ContaBancaria {
    public double saldo;

    public ContaBancaria(){
        saldo = 1000;
    }

    public synchronized void sacar(double valor){
        this.saldo -= valor;
    }

    public synchronized void depositar(double valor){
        this.saldo += valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
