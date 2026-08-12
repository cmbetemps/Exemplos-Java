
public class Main 
{
   public static void main( String args[] )
   {
      List<Integer> list = new List<Integer>(); 

      list.insertAtFront( -1 );
      list.print();
      list.insertAtFront( 0 );
      list.print();
      list.insertAtBack( 1 );
      list.print();
      list.insertAtBack( 5 );
      list.print();

      try 
      { 
         Integer removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = list.removeFromBack();

         System.out.printf( "%s removed\n", removedObject );
         list.print();
      } 
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } 


      List<Contato> listC = new List<Contato>(); 

      listC.insertAtFront( new Contato("Fulano de Tal","555-9876") );
      listC.print();
      listC.insertAtFront( new Contato("Ciclano de Tal","555-1234") );
      listC.print();
      listC.insertAtBack( new Contato("Zeh Ruela","555-5555") );
      listC.print();
      listC.insertAtBack( new Contato("Juca Nor","555-6789") );
      listC.print();

      try 
      { 
         Contato removedObject = listC.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         listC.print();

         removedObject = listC.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         listC.print();

         removedObject = listC.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         listC.print();

         removedObject = listC.removeFromBack();

        System.out.println(removedObject.getTelefone());

         System.out.printf( "%s removed\n", removedObject );
         listC.print();
      } 
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      }
		List<Float> floats = new List<Float>();
		 floats.insertAtFront(new Float(5.0));
		 floats.insertAtFront(10.0F);
		 floats.print();
		 


   } 
} 



