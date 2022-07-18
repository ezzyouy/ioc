package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier{
    @Autowired
    //@Qualifier("dao2")
    private IDao dao;

    @Override
    public double calcul() {
        double temp=dao.getData();
        double res=temp*Math.cos(temp*3.14)*700;

        return res;
    }
}
