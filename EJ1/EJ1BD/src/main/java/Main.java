import Models.Producto;
import controllers.ProductoController;

import java.time.LocalDateTime;

//import javax.persistence.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Producto producto = new Producto("Producto numero 1","Descripcion producto numero 1",10.0, LocalDateTime.now());
        ProductoController productoController = new ProductoController();
        productoController.SaveAlumno(producto);
    }
}