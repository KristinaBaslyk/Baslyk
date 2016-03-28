package laba1;

public class Sentiments 
{
	private String text;
    private double chislo;

    public String getText()
    {
    	return text;
    }
    public double getChislo()
    {
    	return chislo;
    }
    public void setText( String text )
    {
    	this.text=text;
    }
    public void setChislo( double chislo )
    {
    	this.chislo=chislo;
    }  
    public String toString()
    {
    	System.out.println(text+", "+chislo);
    	return null;
    }

}
