package presentation;

import dao.DaoImpl;
import metier.MetierImpl;

public class PresentationV1 {
    public  static  void main(String []args )
    {
        // inversion de controle par instanciaion statique
        DaoImpl d= new DaoImpl();
       /* MetierImpl metier=  new MetierImpl();
       // metier.setDao(d); // inversion de contole via un setteur
        System.out.println("resultat:"+metier.calcul());
*/
        // inversion de contole par instanciiation dynamique
        // nous allons  nous servir du constructeur de la classe metier plutot
         // d'utiliser du setteur comme dans le cas preceddent

         MetierImpl metier= new MetierImpl(d);
        System.out.println("resultat :"+metier.calcul());


    }
}
