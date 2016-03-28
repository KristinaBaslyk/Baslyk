package laba0;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class text 
{
	public static void main(String[] args)throws IOException
	 {
		BufferedReader br = new BufferedReader(new FileReader(args[0]));
	    ArrayList<String> fileContent = new ArrayList<String>();
	    String getStr;

	    int a,b,k=0;
	    a=Integer.parseInt(args[1]);
	    b=Integer.parseInt(args[2]);
	    while( (getStr = br.readLine() ) != null )
            {
    	   		k++;
    	   		if(k>=a && k<=a+b)
    	   		fileContent.add(getStr);
    	   		if(k==a+b)
               break;
    	   	}
       br.close();
    
       for(int i=0;i<b;i++)
    System.out.println(fileContent.get(i));     
	 } 
}
