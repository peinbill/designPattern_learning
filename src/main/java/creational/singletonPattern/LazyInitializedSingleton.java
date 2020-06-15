package creational.singletonPattern;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton getInstance(){
        if(instance==null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }


}
