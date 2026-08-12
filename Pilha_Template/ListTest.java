
public class ListTest 
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
   } 
} 



