package metier;

import dao.IDao;

public class MetierImpl implements IMetier {

    private IDao dao; // couplage faible
    @Override
    public double calcul() {

        double data=dao.getData();
        double res=data*11.4;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
