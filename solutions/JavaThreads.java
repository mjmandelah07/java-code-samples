public class JavaThreads extends Thread  {
    // Threads allows a program to operate more efficiently by doing multiple things at the same time.
    //
    //Threads can be used to perform complicated tasks in the background without interrupting the main program.

    // Creating a Thread
    // There are two ways to create a thread.
    //
    // It can be created by extending the Thread class and overriding its run() method:

    // Extend Syntax
    //    public class Main extends Thread {
    //        public void run() {
    //            System.out.println("This code is running in a thread");
    //        }
    //    }

    // Another way to create a thread is to implement the Runnable interface:
    //
    //Implement Syntax
    //public class Main implements Runnable {
    //  public void run() {
    //    System.out.println("This code is running in a thread");
    //  }
    //}

    // Running Threads
    //If the class extends the Thread class,
    // the thread can be run by creating an instance of the class and call its start() method

    public static void main(String[] args) {
        JavaThreads thread = new JavaThreads();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }

    // If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a
    // Thread object's constructor and then calling the thread's start() method:
    //
    //Implement Example
    //public class Main implements Runnable {
    //  public static void main(String[] args) {
    //    Main obj = new Main();
    //    Thread thread = new Thread(obj);
    //    thread.start();
    //    System.out.println("This code is outside of the thread");
    //  }
    //  public void run() {
    //    System.out.println("This code is running in a thread");
    //  }
    //}
}
