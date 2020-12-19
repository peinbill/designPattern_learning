package creational.singletonPattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

}

class ThreadSafeSingleton2{
    private static ThreadSafeSingleton2 instance;

    private ThreadSafeSingleton2() {
    }

    // using double check
    public static ThreadSafeSingleton2 getInstance2(){
        if(instance==null){
            synchronized (ThreadSafeSingleton2.class){
                if(instance==null){
                    instance = new ThreadSafeSingleton2();
                }
            }
        }
        return instance;
    }

}
