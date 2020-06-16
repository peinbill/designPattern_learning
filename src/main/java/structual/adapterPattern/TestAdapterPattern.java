package structual.adapterPattern;

public class TestAdapterPattern {

    public static void main(String[] args) {
        testClassAdapter();
        testObjectAdapter();

    }

    private static void testObjectAdapter() {
        SocketAdapter socketAdapter = new SocketObjectAdapterImpl();

        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);
    }

    private static void testClassAdapter() {
        SocketAdapter socketAdapter = new SocketClassAdapterImpl();

        Volt v3 = getVolt(socketAdapter,3);
        Volt v12 = getVolt(socketAdapter,12);
        Volt v120 = getVolt(socketAdapter,120);
    }

    private static Volt getVolt(SocketAdapter socketAdapter, int i) {
        switch (i) {
            case 3:
                return socketAdapter.get3Volt();

            case 12:
                return socketAdapter.get12Volt();

            case 120:
                return socketAdapter.get120Volt();
            default:
                return socketAdapter.get120Volt();
        }
    }

}
