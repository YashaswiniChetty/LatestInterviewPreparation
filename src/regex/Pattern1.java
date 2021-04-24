package regex;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {

    public static void main( String [] args) {
        int count = 0;
        Pattern p = Pattern.compile("ab");//  Pattern p = Pattern.compile("[ab]");
        Matcher matcher = p.matcher("ababbaba");
        while(matcher.find()){
            count++;
            System.out.println("start index "+ matcher.start() +"..." + "end index " + matcher.end() +"...." + matcher.group());
        }
        System.out.println("Total number of occurances "+ count);
    }
}
/*  in java give //followed below , space is special char
Char classes
[abc] either a or b or c
[^abc] except a b c
[0-9] any digit from 0 to 9
[^0-9] except 0-9
[a-z] a to z and [^a-z] except a to z
[A-Z] A to Z and [^A-Z] except A to Z
[a-z A-Z 0-9] all from a to z and A to Z and 0 to 9 alphanumeric
[^a-z A-Z 0-9] special characters
Predefined char classes
\s space char
\S except space char
\d any digit from 0 to 9
\D except digit except 0 to 9
\w any word char [a-z A-Z 0-9]
\W except any word means special char
. any char
Quantifiers
a exaclty one a
a+ atleast one a
a* any one of a including 0 a
a? atmost a means a or 0 a
*/

