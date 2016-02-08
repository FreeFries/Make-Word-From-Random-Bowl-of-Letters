package xander.lambdas;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by apereira on 08/02/16.
 */
public class ChkSizeImpl {

    public static void main(String...args)
    {
        // Your Data
        List<String> l = new ArrayList<String>();
        l.add("Monkees77777");
        l.add("Donkeees");
        l.add("antsInYourPants");

        // Your Results
        List<Boolean> c = new ArrayList<Boolean>();


        // Your Code as Data aka Lambdas
        ChkSize cc = (int ii) -> {

            if (ii == 7) {
                return true;
            } else {
                return false;
            }
        } ;

        for (String d : l)
        {

            c.add(cc.chkSize(d.length()));

        }

        for (Boolean d : c)
        {
            System.out.println( d);
        }

    }
}
