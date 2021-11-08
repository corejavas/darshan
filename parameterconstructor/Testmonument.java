class Testmonument{
public static void main(String []a)
{
Monument monument=new Monument();
String res=monument.printAll();
System.out.println(res);

short yoc=1631;
Monument monument1=new Monument("taj","agra",yoc,42.5f);
System.out.println(monument1.printAll());
}
}