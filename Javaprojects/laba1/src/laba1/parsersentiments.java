package laba1;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parsersentiments
{
	public static Sentiments Parser(String str)
	{
	     Sentiments object=new Sentiments();
	     String findText=".+\\,";
	        Pattern patternText=Pattern.compile(findText);
	        Matcher matcherText=patternText.matcher(str);
	        
	        if (matcherText.find())
	        {
	        	String result = matcherText.group().replaceAll(",","");
	            object.setText(result);
	        }
	        
	        String findChislo="\\,.+";
	        Pattern patternChislo=Pattern.compile(findChislo);
	        Matcher matcherChislo=patternChislo.matcher(str);
	        
	        if (matcherChislo.find())
	        {
	        	String result = matcherChislo.group().replaceAll(",","");
	            object.setChislo(Double.parseDouble(result));
	            
	        }
	        return object;
	  }

}
