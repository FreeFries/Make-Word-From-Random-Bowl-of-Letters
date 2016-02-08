package xander.soupalphas;


import java.util.HashMap;

import java.util.Random;

/**
 * Created by apereira on 07/02/16.
 */
public class GenAlphas {

    public static final int UPPR_BND_NOTINCL = 26 ;

    private HashMap<String,Integer> bowl = new HashMap<String,Integer>();

    public HashMap<String,Integer> genAlphabetStream(int howManyLetters) throws Exception {
        Random r = new Random();

        for (int i = 0; i < howManyLetters; i++) {
            int test = r.nextInt(UPPR_BND_NOTINCL);

            if (test==0)
            {
                System.out.print(" LwrBnd0=");
            }
            else if (test == UPPR_BND_NOTINCL)
            {
                throw new Exception("BoundTwentySix NOT possible only 0..25 allowed");

            }
            else if (test == (UPPR_BND_NOTINCL - 1))
            {
                System.out.print(" UpprBnd25=");
            }

            char cc = (char)('A' + test) ;
            String chkValue = String.valueOf(cc) ;
            System.out.print(chkValue + " ");

            Integer testCnt = this.bowl.get(chkValue) ;

            if ( testCnt == null)
            {
                this.bowl.put(chkValue,new Integer(1)) ; // the first value for that key letter
            }
            else
            {
                int newCnt = testCnt.intValue() + 1 ;
                this.bowl.put(chkValue,new Integer(newCnt));
            }
        }

        return this.bowl;
    }

    public static void main(String...args)
    {
        int arg0SoupBowlSize = 0 ;
        String arg1theWord2Make = "" ;

        try {
            arg0SoupBowlSize = new Integer(args[0]).intValue(); //25 ;
            arg1theWord2Make = args[1]; // "SuperCaliFragilistic";
            if (arg0SoupBowlSize <= 0 || arg1theWord2Make.length() <= 0)
            {
                throw new Exception("Error runnning GenAlphas <#AlphabetsInBowl="+arg0SoupBowlSize +"> <theWordUWantToMake='"+arg1theWord2Make+"'>");
            }
            else
            {
                System.out.println("Running GenAlphas <#AlphabetsInBowl="+arg0SoupBowlSize +"> <theWordUWantToMake='"+arg1theWord2Make+"'>");
                arg1theWord2Make = arg1theWord2Make.toUpperCase();
            }
        }
        catch(Exception e1)
        {
            e1.printStackTrace();
            System.exit(1);
        }

        GenAlphas g = new GenAlphas() ;
        try {
            System.out.println("Generating my Soup Bowl of Letters Randomly and putting them into Alphabet Key Ordered HashMap ..... ");
            HashMap<String,Integer> c = g.genAlphabetStream(arg0SoupBowlSize);

            System.out.println("\nDoing a countback of your letters in SoupBowl HashMap...");
            for (int i = 0 ; i < 26 ; i++)
            {
                char cc = (char)('A' + i) ;
                String chkValue = String.valueOf(cc) ;
                System.out.print("Testing how many for " + chkValue + "s ");

                Integer howMany =  c.get(chkValue) ;

                System.out.println(howMany) ;


            }
            System.out.println("Attempting to build the word " + arg1theWord2Make + " using the letters from the HashMap Soup Bowl");
            System.out.println("Legend ?=bowl never had that letter *=bowl had that letter but it did not have enough ");
            boolean youGotLucky = true ;

            FindMyLtr fml = (u,h) -> { return (new FindMyLtrCodeBlk()).chkIfLtrExists(u,h); };

            for (String findDisltr : arg1theWord2Make.split("") ) {

                String tstt = fml.chkIfLtrExists(findDisltr,c) ;
                if (tstt.equals("?"))
                {
                    youGotLucky = false;

                }
                else if (tstt.equals("*"))
                {
                    youGotLucky = false;
                }
                else
                {
                    // found a letter to make my word
                }
                System.out.print(tstt);
            }

            System.out.println("\nFinished trying to make this word");
            if (youGotLucky)
            {
                System.out.println("Wow! Wow! on your umpteenth try you actually made this big word from your bowl of Soup");
            }

        }
        catch(Exception ee)
        {
            ee.printStackTrace();
        }
    }


}
