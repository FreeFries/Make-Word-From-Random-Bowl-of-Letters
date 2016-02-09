package xander.lambdas;

/**
 * Created by apereira using IntelliJ inbuilt Template for Singleton on 09/02/16.
 */
public class TstSingl {
    private static TstSingl ourInstance = new TstSingl();

    public static TstSingl getInstance() {
        return ourInstance;
    }

    private TstSingl() {
    }
}
