class MyThread extends Thread {
    // Constructor
    MyThread(String name) {
        super(name); // call base class (Thread) constructor using super
        System.out.println("Child thread created: " + this.getName());
        start(); // starts the thread, run() will be called after this
    }

    // run method starts after start() is called
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Child Thread: " + getName() + " - count: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Child thread interrupted.");
        }
        System.out.println("Child thread exiting.");
    }
}

public class ThreadDemo {
    public static void main(String args[]) {
        MyThread t = new MyThread("MyChildThread");

        // Main thread continues concurrently with child thread
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Main Thread - count: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
