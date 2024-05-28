package controllers;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.models.Producto;

import java.time.LocalDateTime;

public class ProductoController {
    public String createUsuario(String nombre, String descripcion, Double precio, LocalDateTime date){
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Producto.class).buildSessionFactory();
        Session session = sessionFactory.openSession();
        try {
            Producto producto = new Producto(nombre,descripcion,precio, date);
            session.beginTransaction();
            session.persist(producto);
            session.getTransaction().commit();
            sessionFactory.close();
            return "Producto creado";
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Error, no se pudo crear el producto";
    }
}
