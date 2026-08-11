public class SerHumano extends Mamifero{

  static int seresHumanos=0;

  public SerHumano(String n, int p){
    super(n,p);
    seresHumanos++;
  }
  public String comunicar(){
    peso=100;
    return "Blá blá blá!!!";
  }
  static int pesoDeUmObjeto(SerHumano s){
    return s.peso;
  }
}
