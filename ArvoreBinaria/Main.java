import java.util.Random;

public class Main 
{
   public static void main( String args[] )
   {
      System.out.println( "\nTrabalhando com pessoas (Classe Pessoa) \n\n" );	
      Tree <Pessoa> tree = new Tree<Pessoa>();
      Pessoa pessoas[] = new Pessoa[5];
      
      pessoas[0] = new Pessoa("Fulano de Tal");
      pessoas[1] = new Pessoa("Ciclano de Outro Tal");
      pessoas[2] = new Pessoa("Jucanor Tal");
      pessoas[3] = new Pessoa("Godofredo de Que");
      pessoas[4] = new Pessoa("Neponemo Quem");
	  
      System.out.println( "Inserindo os seguintes valores: \n" );

      for ( Pessoa p: pessoas) 
      {
         System.out.print("Inserindo: " + p.getNome() + "\n" );
         tree.insertNode(p);
      } 

      System.out.println ( "\n\nPercurso Preorder:\n" );
      tree.preorderTraversal(); 

      System.out.println ( "\n\nPercurso Inorder:\n" );
      tree.inorderTraversal(); 

      System.out.println ( "\n\nPercurso Postorder:\n" );
      tree.postorderTraversal(); 
      System.out.println();
	  
	 
	  System.out.println ( "\n\nImprimindo a Tree (arvore) usando o toString:\n" );
	  System.out.printf ( "%s\nRemovendo Jucanor\n", tree );
		tree.removeNode(new Pessoa("Jucanor Tal"));
		System.out.printf ( "%s\nRemovendo Fulano\n", tree );
		tree.removeNode(new Pessoa("Fulano de Tal"));
		System.out.printf ( "%s\n", tree );
	  
	  System.out.println( "\n\n_______________________\n\nTrabalhando com Inteiros (Classe Integer) \n\n" );
	  
	  Tree <Integer> tree1 = new Tree<Integer>();
	  Random randomNumbers = new Random(1);
      final int num = 10;

	  System.out.println( "Inserindo " + num + " valores inteiros (valores aleatorios): \n" );
	  for(int i = 0 ; i < num; i++){
		//Integer temp = new Integer(randomNumbers.nextInt(100));
		Integer temp = randomNumbers.nextInt(100);
		System.out.print("Inserindo o valor:" + temp + "\n" );
		tree1.insertNode(temp);
	  }
	  
	  
      System.out.println ( "\n\nPercurso Preorder:\n" );
      tree1.preorderTraversal(); 

      System.out.println ( "\n\nPercurso Inorder:\n" );
      tree1.inorderTraversal(); 

      System.out.println ( "\n\nPercurso Postorder:\n" );
      tree1.postorderTraversal(); 
      System.out.println();
	  
	  System.out.println ( "\n\nImprimindo a Tree (arvore) usando o toString:\n" );
	  System.out.printf ( "%s\nRemovendo 4\n", tree1 );
		 tree1.removeNode(4);
		 System.out.printf ( "%s\nRemovendo o 13\n", tree1 );
		 tree1.removeNode(13);
		 System.out.printf ( "%s\nRemovendo o 85\n", tree1 );
		 tree1.removeNode(85);
		 System.out.printf ( "%s\n\n", tree1 );

	// Trecho de codigo que tenta criar uma arvore de objetos de uma 
	// classe que nao implementa a Comparable:
	// ClasseQualquerQueNaoImplementaComparable()
	// retire o comentario do trecho abaixo e tente compilar
/*
	  Tree<ClasseQualquerQueNaoImplementaComparable> t = new Tree<ClasseQualquerQueNaoImplementaComparable>();
	  t.insertNode(new ClasseQualquerQueNaoImplementaComparable(5));
	  t.insertNode(new ClasseQualquerQueNaoImplementaComparable(2));
	  t.insertNode(new ClasseQualquerQueNaoImplementaComparable(7));
	  
	  t.inorderTraversal(); 
	  System.out.println ( "\n\nImprimindo a Tree (arvore) usando o toString:\n" );
	  System.out.printf ( "%s\n", t );
*/
   }
}

