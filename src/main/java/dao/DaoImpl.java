package dao;

public class DaoImpl implements IDao{
    @Override
    public Double getData() {
        System.out.println("Version Base de donnee");
        Double temp = 23.0;
        return temp;
    }
}
