class TestTree{
public static void main(String []a)
{
Tree str=new Tree();
byte Treebranch = str.branches;
String TreeName = str.name;

str.grow();
String res = str.cutting();

System.out.println(Treebranch);
System.out.println(TreeName);
System.out.println(res);
}
}





