package ext;

import dao.IDao;

public class DaoImplv2 implements IDao {
    @Override
    public Double getData() {
        System.out.println("Version web service");
        Double temp = 11.0;
        return temp;
    }
}
