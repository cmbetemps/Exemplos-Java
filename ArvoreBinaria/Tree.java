
class TreeNode <T extends Comparable<T>>  

{

   TreeNode<T> leftNode; 
   T data; 
   TreeNode<T> rightNode; 

   public TreeNode( T nodeData )
   { 
      data = nodeData;              
      leftNode = rightNode = null; 
   } 

   
   public void insert( T insertValue )
   {
      if ( data.compareTo(insertValue) > 0) 
      {

         if ( leftNode == null )
            leftNode = new TreeNode<T>( insertValue );
         else 
            leftNode.insert( insertValue ); 
      } 
      else if (data.compareTo(insertValue) < 0) 
      {
         if ( rightNode == null )
            rightNode = new TreeNode<T>( insertValue );
         else 
            rightNode.insert( insertValue ); 
      } 
   } 

   public TreeNode<T> remove( T toRemoveValue )
   {	 
		 T temp;
      if ( data.compareTo(toRemoveValue) > 0) 
      {
					if (leftNode != null)
            leftNode = leftNode.remove( toRemoveValue ); 
      } 
      else if (data.compareTo(toRemoveValue) < 0) 
      {
					if (rightNode != null)
            rightNode=rightNode.remove( toRemoveValue ); 
      } 
		 else { // elemento presente na árvore --> remover
			 if (rightNode == null) return leftNode;
			 else if (leftNode == null) return rightNode;
			 			else {
									temp = previous(leftNode);
									data = temp;
									leftNode = leftNode.remove(temp);
						}
		 }
		 return this;
   } 

	private T previous (TreeNode<T> node){
		while (node.rightNode != null) node = node.rightNode;
		return node.data;
	}
	
   public String toString(){
	  return this.data + "";
   }
   
   
} 


public class Tree <T extends Comparable<T>> {
   private TreeNode <T> root; 

   public Tree() 
   { 
      root = null; 
   } 

   
   public void insertNode( T insertValue )
   {
      if ( root == null )
         root = new TreeNode<T>( insertValue ); 
      else
         root.insert( insertValue ); 
   } 


	 public void removeNode( T toRemoveValue )
   {
      if ( root != null )
         root = root.remove( toRemoveValue ); 
   } 
	
   
   public void preorderTraversal()
   { 
      preorderHelper( root ); 
   } 

   private void preorderHelper( TreeNode<T> node )
   {
      if ( node == null )
         return;

      System.out.printf( "%s\n", node.data.toString() ); 
      preorderHelper( node.leftNode );      
      preorderHelper( node.rightNode );     
   } 


   public void inorderTraversal()
   { 
      inorderHelper( root ); 
   } 


   private void inorderHelper( TreeNode<T> node )
   {
      if ( node == null )
         return;

      inorderHelper( node.leftNode );      
      System.out.printf("%s\n", node.data.toString() ); 
      inorderHelper( node.rightNode );       
   } 

   
   public void postorderTraversal()
   { 
      postorderHelper( root ); 
   } 

   private void postorderHelper( TreeNode<T> node )
   {
      if ( node == null )
         return;
  
      postorderHelper( node.leftNode );     
      postorderHelper( node.rightNode );    
      System.out.printf("%s\n", node.data.toString() ); 
   } 
   
     
   private String toStringHelper(TreeNode<T> node, int n, int lado){
	  String retorno = "";
	  if (node !=null){
		  for (int i=0; i<n;i++) retorno = retorno + "   ";
		  
		  if (lado == 1) retorno = retorno + "\u02EB [L]";
		  if (lado == 2) retorno = retorno + "\u02EA [R]";

		  if (lado == 0) retorno = retorno + "[root](" + node.data.toString() + ")\n";
		  else retorno = retorno + "(" + node.data.toString() + ")\n";
		  
		  if (node.leftNode != null){
			retorno = retorno + toStringHelper(node.leftNode,n+1,1);
		  }
		  else{
			for (int i=0; i<=n;i++) retorno = retorno + "   ";
			retorno = retorno + "\u02EB [L](null)\n";
		  }
		  if (node.rightNode != null) {
			retorno = retorno + toStringHelper(node.rightNode,n+1,2);
		  }
		  else{
			for (int i=0; i<=n;i++) retorno = retorno + "   ";
			retorno = retorno + "\u02EA [R](null)\n";
		  }
	  }
	  return retorno;
   }

/*
   private String toStringHelper(TreeNode <E> node, int n){
	  String retorno = "";
	  if (node !=null){
		  for (int i=0; i<n;i++) retorno = retorno + "   ";
		  retorno = retorno + "(" + node.data.toString() + ")\n";
		  if (node.leftNode != null){
			retorno = retorno + toStringHelper(node.leftNode,n+1);
		  }
		  else{
			for (int i=0; i<=n;i++) retorno = retorno + "   ";
			retorno = retorno + "(null)\n";
		  }
		  if (node.rightNode != null) {
			retorno = retorno + toStringHelper(node.rightNode,n+1);
		  }
		  else{
			for (int i=0; i<=n;i++) retorno = retorno + "   ";
			retorno = retorno + "(null)\n";
		  }
	  }
	  return retorno;
   }
*/
   
   public String toString(){
		return toStringHelper(this.root, 0,0);
   }
}

