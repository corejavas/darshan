class TestTopology {
public static void main(String []a){
Topology .types();

Topology connection=new Topology ();
char result=connection.types();
System.out.println(result);

Topology connect=new Topology ();
char res=connect.ring();
System.out.println(res);
}
}