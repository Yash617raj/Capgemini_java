public class DeadlockResolved {

    static final Object PEN = new Object();
    static final Object PAPER = new Object();

    public static void main(String[] args) {

        Thread martin = new Thread(() -> {
            synchronized (PEN) {
                System.out.println("Martin picked Pen");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (PAPER) {
                    System.out.println("Martin picked Paper");
                }
            }
        });

        Thread david = new Thread(() -> {
            synchronized (PEN) {
                System.out.println("David picked Pen");
                try { Thread.sleep(100); } catch (InterruptedException e) {}

                synchronized (PAPER) {
                    System.out.println("David picked Paper");
                }
            }
        });

        martin.start();
        david.start();
    }
}
