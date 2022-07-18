package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

public class PresSpringXml {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        IMetier metier= (IMetier) context.getBean("metier");

        System.out.println(metier.calcul());
    }
}
