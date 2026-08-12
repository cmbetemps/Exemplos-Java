
class ListNode // classe interna para nó de lista
{
  
   Object data;    
   ListNode nextNode;

   ListNode( Object object ) 
   { 
      this( object, null ); 
   } 

   ListNode( Object object,ListNode node )
   {
      data = object;    
      nextNode = node;  
   } 

   Object getObject() 
   { 
      return data; 
   } 

   ListNode getNext() 
   { 
      return nextNode; 
   } 
} 

public class List 
{
   private ListNode firstNode;
   private ListNode lastNode;
   private String name; 

   public List() 
   { 
      this( "list" ); 
   } 

   public List( String listName )
   {
      name = listName;
      firstNode = lastNode = null;
   }

   public void insertAtFront( Object insertItem )
   {
      if ( isEmpty() ) 
         firstNode = lastNode = new ListNode( insertItem );
      else 
         firstNode = new ListNode( insertItem, firstNode );
   }

   public void insertAtBack( Object insertItem )
   {
      if ( isEmpty() ) 
         firstNode = lastNode = new ListNode( insertItem );
      else 
         lastNode = lastNode.nextNode = new ListNode( insertItem );
   } 

   public Object removeFromFront() throws EmptyListException
   {
      if ( isEmpty() ) 
         throw new EmptyListException( name ); // Exceção é lançada.

      Object removedItem = firstNode.data; 

      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else
         firstNode = firstNode.nextNode;

      return removedItem; 
   }

   public Object removeFromBack() throws EmptyListException
   {
      if ( isEmpty() ) 
         throw new EmptyListException( name );

      Object removedItem = lastNode.data; 

      if ( firstNode == lastNode )
         firstNode = lastNode = null;
      else 
      { 
         ListNode current = firstNode;

         while ( current.nextNode != lastNode )
            current = current.nextNode;
   
         lastNode = current; 
         current.nextNode = null;
      } 

      return removedItem; 
   } 

   public boolean isEmpty()
   { 
      return firstNode == null; 
   } 


   public void print()
   {
      if ( isEmpty() ) 
      {
         System.out.printf( "Empty %s\n", name );
         return;
      } 

      System.out.printf( "The %s is: ", name );
      ListNode current = firstNode;

      while ( current != null ) 
      {
         System.out.printf( "%s ", current.data );
         current = current.nextNode;
      }

      System.out.println( "\n" );
   } 
} 


