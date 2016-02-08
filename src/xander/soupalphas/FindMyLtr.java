package xander.soupalphas;

import java.util.HashMap;

/**
 * Created by apereira on 08/02/16.
 */
@FunctionalInterface
public interface FindMyLtr {

    String chkIfLtrExists(String urAlphabet, HashMap<String,Integer> c);

}
