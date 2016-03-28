package laba1;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class alltweets 
{
	private double shirota;
    private double dolgota;
    private Date date=new Date();
    private String text;

    public double getShirota() 
    {
        return shirota;
    }
    public double getDolgota()
    {
        return dolgota;
    }
    //public String getDate(Date date) throws ParseException {
    //   return date;
    //}
    public String getText() 
    {
        return text;
    }
    public void setShirota(double shirota) 
    {
        this.shirota = shirota;
    }
    public void setDolgota(double dolgota) 
    {
        this.dolgota = dolgota;
    }
    public void setDate(String date) throws ParseException 
    {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = format.parse(date);
        this.date = d;
    }
    public void setText(String text) 
    {
        this.text = text;
    }
    public String toString()
    {
        System.out.println("["+shirota + " " + dolgota+"] " + date.toLocaleString() + " " + text);
        return null;
    }
}
