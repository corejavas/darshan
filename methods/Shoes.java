class Shoes{
  static int brand(String []pairs){
  for(int i=0 ; i<pairs.length ; i++){
  System.out.println(pairs[i]);
       }
      return 1;
   }
  
  static void color( String []pairs ,int numbers ){
   System.out.println("shoes have varity of color");
  for(int i=0 ; i<pairs.length ; i++){
  System.out.println(pairs[i] + "\t" +numbers);
      }
   
}
     static void pairofshoes( String []pairs, byte price,int numbers){
       System.out.println("shoes are perfect for walking and runing");
        for(byte i=0 ; i<pairs.length ; i++){
          System.out.println(pairs[i] + "\t" +numbers + "\t" +price);
       }
   }

}
    