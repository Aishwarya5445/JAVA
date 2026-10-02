// Creating thread by implementing Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Runnable Thread: " + i);
        }
    }
}
// Creating thread by extending Thread class
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread Class: " + i);
        }
    }
}
class ThreadDemo {
    public static void main(String[] args) {
        // Thread using Runnable interface
        MyRunnable r = new MyRunnable();
        Thread t1 = new Thread(r);
        // Thread using Thread class
        MyThread t2 = new MyThread();
        t1.start();
        t2.start();
    }
}
