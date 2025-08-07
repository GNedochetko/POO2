public class UsaThread {
    public static void main(String[] args) {
        System.out.println("Thread principal iniciando.");
        MyThread mt1 = new MyThread("Filha #1");
        Thread newThrd1 = new Thread(mt1);
        MyThread mt2 = new MyThread("Filha #2");
        Thread newThrd2 = new Thread(mt2);
        newThrd1.start();
        newThrd2.start();
        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Thread principal interrompida.");
            }
        }
        System.out.println("Thread principal finalizando.");
    }
}
