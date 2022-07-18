package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner s=new Scanner(new File("config.txt"));
        String daoClassName=s.nextLine();
        Class<?> cDao=Class.forName(daoClassName);
        IDao dao= (IDao) cDao.getDeclaredConstructor().newInstance();

        String metierClassName=s.nextLine();
        Class<?> cMetier= Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor(IDao.class).newInstance(dao);

        System.out.println("Result => "+metier.calcul());
    }
}
