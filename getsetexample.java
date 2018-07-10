class dog 
{
    private int size;
    public int getSize()
    {
        return size;
    }

    public void setSize(int s)
    {
        size = s;
    }

    void bark()
    {
        if (size>60)
        {
            System.out.println("Woof ! Woof!");
        }
    
        else if(size>30)
        {
            System.out.println("ruf! Ruf!");
        }
        else
        {
            System.out.println("Yip! Yip!");
        }
    }
}

public class dogTestdrive
{
    public static void main(String[] args)
    {
        dog one = new dog();
        one.setSize(20);
        
        dog two = new dog();
        two.setSize(90);
        
        System.out.println("first dog size:" + one.getSize());
        System.out.println("second dog size"+ two.getSize());
        one.bark();
        two.bark();
    }
}
