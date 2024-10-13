package GeneralPrograms;

public class ReverseStringUsingRecursion {
public static void main(String[] args) {
	

	String s="yashu is gud";
	String rev=reverse(s);
	
    System.out.println(rev);

	
}

private static String reverse(String s) {
if(s.isEmpty()) {
	return s;
}
return reverse(s.substring(1))+s.charAt(0);
}

}
