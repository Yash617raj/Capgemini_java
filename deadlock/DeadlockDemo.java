public class DeadlockDemo {

    static final Object PEN = new Object();
    static final Object PAPER = new Object();

    public static void main(String[] args) {

        Thread martin = new Thread(() -> {
            synchronized (PEN) {
                System.out.println("Martin using Pen waiting for Paper");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (PAPER) {
                    System.out.println("Martin using Paper");
                }
            }
        });

        Thread david = new Thread(() -> {
            synchronized (PAPER) {
                System.out.println("David using Paper waiting for Pen");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (PEN) {
                    System.out.println("David using Pen");
                }
            }
        });

        martin.start();
        david.start();
    }
}
