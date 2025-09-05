class Z{
    
}

class A extends Thread{ // instead of extending the class with Thread, try implements Runnable
    public void run(){ // run is compulsory for this method
        for(int i=0;i<100;++i){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;++i){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class oops16 {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        // to use these objects simultaneously we have to use threads, for that we have to make these objects Threads
        // we want to run these methods in parallel

        // System.out.println(obj1.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);
        // System.out.println(obj2.getPriority());
        obj1.start(); // these are threads not objects
        obj2.start();
        // start() does not work in Runnable

        // this works like this 
        Runnable obj3 = new A();
        Runnable obj4 = new B();

        Thread t1 = new Thread(obj3);
        Thread t2 = new Thread(obj4);

        t1.start();
        t2.start();
    }
}
