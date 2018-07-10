class clock
{
    private String time;
    
    public void setTime(String t)
    {
        time = t;
    }

    public String getTime()
    {
        return time;
    }
}

public class clockTestDrive
{
    public static void main (String[] args)
    {
        clock c = new clock();
        c.setTime("1234");
        String tod = c.getTime();
        
        System.out.println("time:" +tod);
    }
}
