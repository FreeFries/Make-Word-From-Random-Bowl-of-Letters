# Make-Word-From-Random-Bowl-of-Letters
Given a random collection of alphabets (all caps), submit a word and see if you can make that word from the collection of letters without having to traverse thru the collection each time.

Method/Function that does the making of the word is makeMyWord(String arg1theWord2Make, HashMap&lt;String, Integer&gt; c) where small c is the Random Collection of Ordered letters to pick from to generate your word.

Supply 2 inputs, the 1st is a random set of letters generated for simplicity all capitals. For this supply on how large your bowl of alphabets is going to be. A number like 50 or 100. Then supply the word you would like to see that you can build like SuperCaliFragilisticExpialidocious. For this word to be created you need minimum 150 or more otherwise you would have to run this program a couple of times to be lucky

In order to have an ORDER OF ONE in searching to see for your letters. I have ordered the collection of random letters into a HashMap<String,Integer> namely the Key is Alphabets (A-z) and Integer is the count of how many times it occurs.

Step 1 Generate my Random bowl of Alphabets<br />
Step 2 Go thru my bowl and arrange then into an HashMap for fast access.<br />
Step 2a I then did a countback of these letters for the benefit of the user so that they could see how many of each letter existed <br />
Step 2b Validation of Parameters. Also validate to see that no numbers are sent. A Java8 stream and predicate are used here <br />
Step 3 Split the word you want create and then use a simple Java 8 lambda from a functional interface to check to see if the letter is available, Use it to form your word and then decrease the count for that letter in your HashMap <br />
Step 4 Spit out how much of the word you could make. ?=Letter was never there *=You ran out of that letter. <br />

Other features provided in this code Repo<br />
(1) Have provided a POM file for a Maven Build<br />
(2) Have provided a Bash script file to run the Maven stuff namely buildProj.sh<br />
(3) In the Target folder there is a JAR file that you can use<br />
(4) The main class is xander.soupalphas.GenAlphas<br />
(5) Below is output of my program that takes 2 parameters, the 150 is the number of random alphabets available, and that long word is SuperCaliFragilisticExpialidocious you can use your own word.<br />
(6) There is good validation for the parameters as well. Check out the use of a Java8 stream in validateNoNumbrsInWord()<br />
(7) It uses a HashMap to store an index (key) of an alphabet and how many times (count is value) it occurs and then it builds this word with a single seek into the Map without traversing all the alphabets so it is quick.<br />
(8) In my code I have also used some simple Java8 code snippets that include lambdas, functional interface and a simple use of a stream. Not claiming I am an expert but I have some understanding of their usage.<br />
(9) When it cannot build the word fully it will tell you where it could not find a letter or whether it had used the letter up. Example ..... Legend ?=bowl never had that letter &#42;=bowl had that letter but it did not have enough<br />
S?PERCAL??R&#42;G?&#42;?S??C&#42;XP?&#42;&#42;?DOC?&#42;?S<br />
(10) Sample of OUTPUT also provided below ......

<div>
<span style="font-size: 6.0px;"><em>$ java -jar APereiraCroydon_Beta1.0.jar 150 "SuperCaliFragilisticExpialidocious"</em></span><div><span style="font-size: 9.0px;"><em>Finally Running GenAlphas &lt;#AlphabetsInBowl=150&gt; &lt;theWordUWantToMake='SuperCaliFragilisticExpialidocious'&gt;<br>
Generating my Soup Bowl of Letters Randomly and putting them into Alphabet Key Ordered HashMap .....<br>
S C F R O F S T V K I X I D&nbsp; LwrBnd0=A Y Y F C O B W D F C P Y X H T L&nbsp; LwrBnd0=A V B N X X E W Q O C R H E J X D W Y S R X L&nbsp; UpprBnd25=Z Y X K W G W T D&nbsp; LwrBnd0=A M Q K M B C M D M&nbsp; UpprBnd25=Z I E I U L X G E&nbsp; UpprBnd25=Z I M Y K L B I C G W I B J P K&nbsp; LwrBnd0=A K L Q G H C Q G R N W U V S Y D&nbsp; LwrBnd0=A D Y F I S C H R X Q G U O D G P K M G H&nbsp; LwrBnd0=A B Q U D G C W O D B O W R<br>
Doing a countback of your letters in SoupBowl HashMap...<br>
Testing how many for As 6<br>
Testing how many for Bs 7<br>
Testing how many for Cs 9<br>
Testing how many for Ds 10<br>
Testing how many for Es 4<br>
Testing how many for Fs 5<br>
Testing how many for Gs 9<br>
Testing how many for Hs 5<br>
Testing how many for Is 8<br>
Testing how many for Js 2<br>
Testing how many for Ks 7<br>
Testing how many for Ls 5<br>
Testing how many for Ms 6<br>
Testing how many for Ns 2<br>
Testing how many for Os 6<br>
Testing how many for Ps 3<br>
Testing how many for Qs 6<br>
Testing how many for Rs 6<br>
Testing how many for Ss 5<br>
Testing how many for Ts 3<br>
Testing how many for Us 4<br>
Testing how many for Vs 3<br>
Testing how many for Ws 9<br>
Testing how many for Xs 9<br>
Testing how many for Ys 8<br>
Testing how many for Zs 3<br>
Attempting to build the word SUPERCALIFRAGILISTICEXPIALIDOCIOUS using the letters from the HashMap Soup Bowl<br>
Legend ?=bowl never had that letter *=bowl had that letter but it did not have enough<br>
SUPERCALIFRAGILISTICEXPIALIDOCIOUS<br>
Finished trying to make this word<br>
Wow! Wow! on your umpteenth try you actually made this big word from your bowl of Soup</em></span></div>
