package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public Double calcul() {
        Double t = dao.getData();

        return t*23 ;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }

    // on cree le construteur pour la l'inversion de controle par instanciation dynamique
    public MetierImpl(IDao dao)
    {
        this.dao = dao;
    }
}
