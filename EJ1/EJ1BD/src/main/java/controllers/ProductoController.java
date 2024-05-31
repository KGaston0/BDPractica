package controllers;
import Ejemplo1.Producto ;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.time.LocalDateTime;

public class ProductoController {
    public void SaveAlumno(Producto producto){
        try(Session session = HibernateController.getSession()) {
            session.beginTransaction();
            session.persist(producto);
            session.getTransaction().commit();
        }
    }

}
