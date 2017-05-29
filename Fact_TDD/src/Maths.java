
public class Maths {
	
	
	public int getFact(int num)
	{
		int fact = 1;
		if(num<0)
		{
			throw new IllegalArgumentException();
		}
		
		if(num==0)
		{
			return 1;
		}
		
		if(num>0)
		{
			for(int i=1;i<=num;i++){    
			      fact=fact*i;    
			  }    
			return fact;
		}
		
		return 1;
	}

}
