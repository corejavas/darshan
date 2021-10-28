class Oven{
 static long electricity(String[]args){
  for(int i=0; i<args.length ; i++){
  System.out.println(args[i]);
     }
         return 1;
   }

   static void cooking( char types ,String []args){
    System.out.println("Ovens used for cooking");
    for(int i=0; i<args.length ; i++){
    System.out.println(args[i]  +"\t" +types);
        }
       
    }
	static void heat( String []args, char types ,int numbers){
       System.out.println("oven are used to roasting n heating .");
        for( char i=0 ; i< args.length ; i++){
          System.out.println(args[i] + "\t" +numbers + "\t" +types);
}
	}
}
