package xander.soupalphas;

import java.util.HashMap;

/**
 * Created by apereira on 08/02/16.
 */
public class FindMyLtrCodeBlk implements FindMyLtr  {


    public String chkIfLtrExists(String urAlphabet, HashMap<String, Integer> c) {
        Integer whatslft = c.get(urAlphabet);

        String matchdAlpha = "?";
        if (whatslft == null)
        {
            matchdAlpha = "?";;// the bowl never had those letters

        }
        else
        {
            int currTot = whatslft.intValue();
            if (currTot > 0) {
                matchdAlpha = urAlphabet ;
                c.put(urAlphabet,currTot - 1);
            }
            else
            {
                matchdAlpha = "*"; // the bowl had dat letter but it ran out
            }

        }

        return matchdAlpha;

    }


}
