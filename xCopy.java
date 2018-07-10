public class xCopy
{
    public static void main (String [] args)
    {
        int orgis = 42;
        
        xCopy x = new xCopy();
        
        int y = x.go(orgis);
        
        System.out.println(orgis+"--"+y);
        
        
    }

    int go(int arg)
    {
        arg = arg *2;
        return arg;
    }
}
