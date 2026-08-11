package jogo.dados;

import java.util.Random;

public class Dado{
	private int valorFace;
	private Random randomNumbers = new Random();
	
	public int getValorFace(){
		return valorFace;
	}
	public void rolar(){
		valorFace = 1 + randomNumbers.nextInt(6);
	}

  public String toString(){
    String ret="\u2680";
    switch (valorFace){
      case 1: ret = "\u2680 (1)";break;
      case 2: ret = "\u2681 (2)";break;
      case 3: ret = "\u2682 (3)";break;
      case 4: ret = "\u2683 (4)";break;
      case 5: ret = "\u2684 (5)";break;
      case 6: ret = "\u2685 (6)";break;
				
    }
    return ret;
    //return "Dado: " + valorFace;
  }	

  public static void main (String[] args){
    Dado d = new Dado();
    d.rolar();
    System.out.println(d);
  }

}
