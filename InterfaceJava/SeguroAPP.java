import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class SeguroAPP{
    public static void main(String [] args){
        List<Seguravel> seguraveis = new LinkedList<Seguravel>();
        Seguravel s;
        seguraveis.add(new Imovel("Rua A, nº432", 200000));
        seguraveis.add(new Imovel("Rua F, nº122", 340000));
        seguraveis.add(new Automovel("Calhambeque", 220000, 1950));
        seguraveis.add(new Automovel("Fubica", 2200, 1985));

        Iterator<Seguravel> seg = seguraveis.iterator();
        while (seg.hasNext()){
            s = seg.next();
            if (s instanceof Imovel) {
                System.out.print("Este é um Imovel --> ");
            }
            System.out.printf("%s\n", s);
        }
    }
}
