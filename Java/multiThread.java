// class MyThread extends Thread {
//     private int id;

//     public MyThread(int id) {
//         this.id = id;
//     }

//     @Override
//     public void run() {
//         for (int i = 0; i < 10; i++) {
//             try {
//                 System.out.println(id + " is printing " + i);
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class MyThread implements Runnable {
    private int id;

    public MyThread(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(id + " is printing " + i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class multiThread {
    public static void main(String[] args) {
        MyThread m1 = new MyThread(1);
        MyThread m2 = new MyThread(2);
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        t1.start();
        t2.start();
    }
}