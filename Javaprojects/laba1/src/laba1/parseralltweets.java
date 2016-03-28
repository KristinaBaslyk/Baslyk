package laba1;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class parseralltweets
{
	 public static alltweets parse(String str) 
	 {
		alltweets tweet = new alltweets();

        String findShirota="\\[[0-9]+[0-9]*.[0-9]+[0-9]*\\,";
        Pattern patternShirota=Pattern.compile(findShirota);
        Matcher matcherShirota=patternShirota.matcher(str);
        
        if (matcherShirota.find())
        {
            String result1 = matcherShirota.group().replaceAll(",", "");
            String result2 = result1.replaceAll("\\[", "");
            tweet.setShirota(Double.parseDouble(result2));
        }

        String findDolgota="\\, -?[0-9]+[0-9]*.[0-9]+[0-9]*\\]";
        Pattern patternDolgota=Pattern.compile(findDolgota);
        Matcher matcherDolgota=patternDolgota.matcher(str);
        if (matcherDolgota.find())
        {
            String result1 = matcherDolgota.group().replaceAll(",", "");
            String result2 = result1.replaceAll("\\]", "");
            tweet.setDolgota(Double.parseDouble(result2));
        }

        String findDate="[1-9][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9] [0-9][0-9]:[0-9][0-9]:[0-9][0-9]";
        Pattern patternDate=Pattern.compile(findDate);
        Matcher matcherDate=patternDate.matcher(str);
        if (matcherDate.find())
        {
            try
            {
                tweet.setDate(matcherDate.group());
            } 
            catch (ParseException e) 
            {
                e.printStackTrace();
            }
        }
        
        String findText="[@#\"A-Za-z](.+)";
        Pattern patternText=Pattern.compile(findText);
        Matcher matcherText=patternText.matcher(str);
        if (matcherText.find())
        {
            tweet.setText(matcherText.group());
        }
        return tweet; 
	  }
}
