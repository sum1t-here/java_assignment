
public class threadPriority {
    public static void main(String[] args) {
            // Create three threads
            Thread t1 = new MyThread("Thread 1");
            Thread t2 = new MyThread("Thread 2");
            Thread t3 = new MyThread("Thread 3");
            
            // Set priorities for the threads
            t1.setPriority(Thread.MAX_PRIORITY); // 10
            t2.setPriority(Thread.NORM_PRIORITY); // 5
            t3.setPriority(Thread.MIN_PRIORITY); // 1
            
            // Start the threads
            t1.start();
            t2.start();
            t3.start();
        }
    }
    
    class MyThread extends Thread {
        private String name;
        
        public MyThread(String name) {
            this.name = name;
        }
        
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(1000); // sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    

