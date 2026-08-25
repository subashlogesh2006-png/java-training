public class Main
{
	public static int sod(int a)
	{
	    int s=0;
	    while(a>0)
	    {
	        s=s+(a%10);
	        a=a/10;
	    }
	    return s;
	}
    public static boolean prime(int i)
    {
        if(i==1)
        return false;
        for(int j=2;j<i;j++)
        {
            if(i%j==0)
            return false;
        }
    return true;
    }
    public static void main(String []args)
    {
        int s=0;
        for(int i=100;i<1000;i++)
        {
            s=sod(i);
            if(prime(i)&&prime(s))
            System.out.print(i+" ");
        }
    }
}


