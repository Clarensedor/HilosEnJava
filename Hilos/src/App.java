import javax.sound.midi.Track;

public class App {
    public static void main(String[] args){


        System.out.println("Hello, World!");
        
        
        //Implementacion de Runnable
        Thread thread = new Thread(new HelloRunnable());
        thread.start();

        
        
        //Hilo de la subclase de Thread
        (new HelloThread()).start();


        //Otra sintaxis para hilo subclase Thread:
        HelloThread helloThread = new HelloThread();
        helloThread.start();
        helloThread.isAlive();
        System.out.println(helloThread.isAlive());

        System.out.println(helloThread.isAlive());
        try {
            Thread.sleep(5000); // Detiene el hilo actual durante 5 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(helloThread.isAlive());
    }
}
