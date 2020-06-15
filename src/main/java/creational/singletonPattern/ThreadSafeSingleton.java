package creational.singletonPattern;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance==null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    // using double check

    public static ThreadSafeSingleton getInstance2(){
        if(instance==null){
            synchronized (ThreadSafeSingleton.class){
                if(instance==null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

}
