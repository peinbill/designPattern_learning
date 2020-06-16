package structual.adapterPattern;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }

}
