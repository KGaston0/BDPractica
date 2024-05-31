package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateController {
    private static final SessionFactory sessionFactory;
    static {
        try {
            Configuration configuration = new Configuration().configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Exception e){
            throw new RuntimeException("Error",e);
        }
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
