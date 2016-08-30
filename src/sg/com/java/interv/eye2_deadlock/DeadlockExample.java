package sg.com.java.interv.eye2_deadlock;

/*http://mouselearnjava.iteye.com/blog/2152420
http://thecodesample.com/?p=710
实现两个线程陷入死锁的情况
*/

public class DeadlockExample {
    String resource1 = "资源1";
    String resource2 = "资源2";
    Thread t1 = new Thread("线程1") {
        public void run() {
            while (true) {
                synchronized (resource1) {
                    synchronized (resource2) {
                        System.out.printf("线程1拥有[%s], 需要[%s]\n", resource1, resource2);
                    }
                }
            }
        }
    };
    Thread t2 = new Thread("线程2") {
        public void run() {
            while (true) {
                synchronized (resource2) {
                    synchronized (resource1) {
                        System.out.printf("线程2拥有[%s], 需要[%s]\n", resource2, resource1);
                    }
                }
            }
        }
    };
 
    public static void main(String a[]) {
        DeadlockExample test = new DeadlockExample();
        test.t1.start();
        test.t2.start();
    }
 
}