package xander.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List ;

/**
 * Created by apereira on 08/02/16.
 */
public class EchoStrImpl implements EchoStr {
    public static void main(String ... args)
    {
        EchoStrImpl rslt = new EchoStrImpl(); // code as default method

        List<String> k = new ArrayList<String>();



        for (String g : "goondaSalaRobber".split(""))
        {

            k.add(rslt.echoBackUCase(g));
        }
        for (String h : k)
        {
            System.out.print(h);
        }
        System.out.println(" done");

        List<String> data = Arrays.asList("goondaSalaRobber".split("")) ;

        data.stream().forEach(s -> {  System.out.print(rslt.echoBackUCase(s) ); });

        System.out.println(" functionaldone");


    }
}
