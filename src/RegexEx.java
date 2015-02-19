import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Pattern pat = Pattern.compile("(abc)?\\s\\d");
       String text="8a";
       Matcher res = pat.matcher(text);
       System.out.println("res " + res.find());
	}

}
