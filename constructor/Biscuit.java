public class Biscuit{
	
	 String type;
	 String brand;
	 int price ;
	 String colour ;
     String shape[]=new String[5];




	Biscuit()
	 		{
	 			System.out.println("it is very tasty");
	 		}

    Biscuit(String []shape)
{
    this.shape=shape;
for(int i=0; i<shape.length;i++)
{
System.out.println(shape[i]);
}
}


     
Biscuit(String type,String colour,String brand,int price)
		    {
	
	          this.type=type;
	          this.brand=brand;
	          this.price=price;
	          this.colour=colour;

	        
	                 System.out.println(type);
			  System.out.println(brand);
			  System.out.println(price);
			  System.out.println(colour);
	       }


	}