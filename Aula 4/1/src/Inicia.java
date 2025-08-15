public class Inicia {
    public static void main(String[] args) {
        TiqueTaque tt = new TiqueTaque();
        MyThread mt1 = new MyThread("Tique", tt);
        MyThread mt2 = new MyThread("Taque", tt);
        try {
            mt1.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Thread principal interrompida.");
        }
    }
}

//WARNING: A restricted method in java.lang.System has been called
//WARNING: java.lang.System::load has been called by com.intellij.rt.execution.application.AppMainV2 in an unnamed module (file:/C:/Program%20Files/JetBrains/IntelliJ%20IDEA%20Community%20Edition%202024.3.3/lib/idea_rt.jar)
//WARNING: Use --enable-native-access=ALL-UNNAMED to avoid a warning for callers in this module
//WARNING: Restricted methods will be blocked in a future release unless native access is enabled
//
//Tique Tique Tique Tique Tique Taque
//Taque
//Taque
//Taque
//Taque

//a saida fica assim porque agora a ordem de execução das threads agora fica aleátoria, não existe uma organização.


