package assessment;
public class LargestInArrayExample 
{
	public static int getLargest(int[] a)
	{  
		int temp,Largest;  
		for (int i = 0; i < a.length; i++)   
		        {  
		            for (int j = i + 1; j < a.length; j++)   
		            {  
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		            }  
		        }  
		       Largest=a[a.length-1];
		       return Largest;
	    }
	static boolean isPerfectSquare(int x)
    {
        if (x >= 0) 
        {
            int sr = (int)Math.sqrt(x);
            return ((sr * sr) == x);
        }
        return false;
    }
		public static void main(String args[])
		{  
		int a[]={1,2,5,2500,16,3,2,};
		System.out.println("Largest:"+getLargest(a));
		if (isPerfectSquare(getLargest(a)))
            System.out.print("Great Number is :"+getLargest(a));
		}
}
