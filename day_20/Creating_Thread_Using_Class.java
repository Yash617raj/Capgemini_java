public class Creating_Thread_Using_Class extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        Creating_Thread_Using_Class t = new Creating_Thread_Using_Class();
        t.start();
    }
}
