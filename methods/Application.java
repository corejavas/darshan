class Application{
 static int personaldetails(String[]args){
  for(int i=0; i<args.length ; i++){
  System.out.println(args[i]);
     }
         return 56;
   }

   static void personaldetails( int marks ,String []args){
    System.out.println("personal details contains educational marks");
    for(int i=0; i<args.length ; i++){
    System.out.println(args[i]  +"\t" +marks);
        }
       
    }


}