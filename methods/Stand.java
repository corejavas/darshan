class Stand{
static int stand(String []args){
  for(int i=0 ; i< args.length ; i++){
  System.out.println(args[i]);
       }
      return 1;
   }
  
  static void stand ( String []args ,int rectangle){
   System.out.println("Stand up for what is right even if you stand alone");
  for(int i=0 ; i<args.length ; i++){
  System.out.println(args[i] + "\t" +rectangle);
      }
   
}
     static void stand( String []args, byte price ,int rectangle){
       System.out.println("I thought you would stand for me as you knew everything.. but you choose to walk away.");
        for(short i=0 ; i< args.length ; i++){
          System.out.println(args[i] + "\t" +rectangle + "\t" +price);
       }
   }

}