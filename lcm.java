public class lcm
{
	public static int lcm(int a,int b)
	{
	    int big=Math.max(a,b);
	    int small=Math.min(a,b);
	    int s=big;
	    while(true)
	    {
	        if(big % small == 0)
	        break ;
	        big=big+s;
	    }
	    return big;
	}

public static void main(String []args)
{
    int a[]={2,4,6,8,10};
    int lcm=a[0];
    for (int i=0;i<5;i++)
    {
        lcm = lcm (lcm,a[i]);
    }
    System.out.println("THE LCM IS "+lcm);
}
}














