package xander.lambdas;

/**
 * Created by apereira on 08/02/16.
 */
public interface EchoStr {
    default String echoBackUCase(String k)
    {
        return k.toUpperCase() ;
    }
}
