package sg.com.java.jinjie.thread;

public class ThreadA {
    public static void main(String[] args){
        ThreadB b = new ThreadB();
        b.start();
        
        //(1) wait solution
        synchronized(b){
            try{
                System.out.println("Waiting for b to complete...");
                b.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
 
            System.out.println("Total is: " + b.total);
        }
        
        //(2) normal solution
        /*System.out.println(Thread.currentThread().getName());
        System.out.println("Total is: " + b.total);*/
    }
}
 
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        //(1) wait solution
    	synchronized(this){
            for(int i=0; i<100 ; i++){
                total += i;
            }
            notify();
        }
    	
    	//(2) normal solution: it will only 
        /*for(int i=0; i<100 ; i++){
            total += i;
        }*/
    	
        System.out.println(Thread.currentThread().getName());
        System.out.println("Total is: " + total);
    }
}