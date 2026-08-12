public class EmptyStackException extends EmptyListException 
{
   public EmptyStackException(){
      this( "Stack" ); 
   } 

   public EmptyStackException( String name ){
      super( name ); 
   } 
}
