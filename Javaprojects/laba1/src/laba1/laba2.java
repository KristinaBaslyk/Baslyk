package laba1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class laba2
{
	public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
		parseralltweets tweetParser = new parseralltweets();
        alltweets tweet;
        String getStr;
        while ( (getStr = br.readLine() ) != null) 
        {
            tweet = tweetParser.parse(getStr);
            tweet.toString();
        }
        br.close();
		/*parsersentiments parsertweets = new parsersentiments();
        Sentiments sentiments;
        String getStr;
        
        while ( (getStr = br.readLine() ) != null)
        {
        	sentiments = parsersentiments.Parser(getStr);
        	sentiments.toString();
        }
        br.close();*/
    }
}
