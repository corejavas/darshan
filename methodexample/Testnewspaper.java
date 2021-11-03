class Testnewspaper{
public static void main(String []a){
Newspaper.speak();

Newspaper news=new Newspaper();
char result=news.speak();
System.out.println(result);

Newspaper read=new Newspaper();
float res=news.daily();
System.out.println(res);
}
}