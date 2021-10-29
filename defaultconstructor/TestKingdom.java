class TestKingdom
{

	public static void main(String []a)
	{
		Kingdom kd=new Kingdom();

		int noOfKingdom=kd.noOfKingdom;
		kd.noOfKingdom=2;
		System.out.println(kd.noOfKingdom);


		String names=kd.names;
		kd.names="Monera and Protista";
		System.out.println(kd.names);


		String state=kd.state;
		kd.state="Karnatak";
		System.out.println(kd.state);
	}

}