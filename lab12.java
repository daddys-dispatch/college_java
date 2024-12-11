package daddy;

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
        start();
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Count: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}

public class ThreadConcurrentExample {
    public static void main(String[] args) {
        new MyThread("Child Thread");
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " Thread Count: " + i);
            try { Thread.sleep(500); } catch (InterruptedException e) { }
        }
    }
}
