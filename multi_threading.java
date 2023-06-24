public class multi_threading {
    static class A extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                Thread.yield ();
                System.out.println("\t From Thread A : i = " + i);
            }
            System.out.println("Exit from A");
        }
    }

    static class B extends Thread{
        public void run(){
            for (int j = 1; j <= 5; j++) {
                System.out.println("\t From Thread B : j = " + j);
            }
            System.out.println("Exit from B");
        }
    }

}
