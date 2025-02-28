package presentation;


import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class PresentationV1 {
    public  static  void main(String []args )
    {
        try {

            Scanner  scanner =new Scanner(new File("config.txt"));
            String daoClassName = scanner.nextLine();
            Class cDao = Class.forName(daoClassName);
            IDao dao= (IDao) cDao.getConstructor().newInstance();

            // instation dynamique via le constructeur avec parametre .
            /*
            String metierclassName =scanner.nextLine();
            Class cMetier = Class.forName(metierclassName);
            IMetier cM= (IMetier)cMetier.getConstructor(IDao.class).newInstance(dao);
            */
            // via  le  constructeur sans parametre
            // on d fait appelle au setteur
            String metierclassName =scanner.nextLine();
            Class cMetier = Class.forName(metierclassName);
            IMetier cM= (IMetier)cMetier.getConstructor().newInstance();

            Method  setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(cM,dao);

            System.out.println("resultat : "+cM.calcul());

        }
        catch (Exception e)
        {
          System.out.println(e.getMessage());
        }
    }

}
