class Calc
{
    
	private float no1,no2;
   
	public void setValues(float no1, float no2)
    
	{
        
		this.no1=no1;
        
		this.no2=no2;
    
	}
   
    
	public float getAddition()
    
	{
        
		return (no1+no2);   
    
	}
    
	public float getSubtraction()
    
	{
        
		return (no1-no2);
    
	}
    
	public float getMultiplication()
    
	{
        
		return (no1*no2);
   
	}
    
	public float getDivision()
    
	{
        
		return (no1/no2);
    
	}

}




public class Calculator
{
    
	public static void main (String[] args) 
    
	{
        
		Calc c1=new Calc();
        
		c1.setValues(10f,3f);

   
	         
        
		// Addition = 1, Subtraction = 2, Multiplication = 3, Division = 4
            
		int p=1;
            
		switch (p)
            
		{
            
			case 1:
                
				System.out.println(c1.getAddition()); break;
            
			case 2:
                
				System.out.println(c1.getSubtraction());break;
            
			case 3:
                
				System.out.println(c1.getMultiplication());break;
            
			case 4:
                
				System.out.println(c1.getDivision());            
		}
            
    
	}

}