package controllers;
import Models.Producto ;
import org.hibernate.Session;

public class ProductoController {
    public void SaveAlumno(Producto producto){
        try(Session session = HibernateController.getSession()) {
            session.beginTransaction();
            session.persist(producto);
            session.getTransaction().commit();
        }
    }

}
