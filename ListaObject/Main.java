public class Main{
   public static void main( String args[] )
   {
      List list = new List(); 
      list.insertAtFront( new Integer(-1) );
      list.print();
      list.insertAtFront( new Integer(0) );
      list.print();
      list.insertAtBack( new Integer(1) );
      list.print();
      list.insertAtBack( new Integer(5) );
      list.print();
		 
    try 
      { 
         Integer removedObject = (Integer)list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = (Integer)list.removeFromFront();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = (Integer)list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();

         removedObject = (Integer)list.removeFromBack();
         System.out.printf( "%s removed\n", removedObject );
         list.print();
      } 
      catch ( EmptyListException emptyListException ) 
      {
         emptyListException.printStackTrace();
      } 
   } 
}