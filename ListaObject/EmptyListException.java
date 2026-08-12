
public class EmptyListException extends Exception 
{

   public EmptyListException()
   {
      this( "List" ); 
   } 

   public EmptyListException( String name )
   {
      super( name + " is empty" ); 
   } 
} 

