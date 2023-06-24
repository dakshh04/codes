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
}
