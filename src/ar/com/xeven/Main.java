package ar.com.xeven;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        SessionFactory sf = new Configuration().configure().buildSessionFactory();
        Session session = sf.openSession();

        List<Producto> productos = (List<Producto>) session.createQuery("FROM Producto").getResultList();

        System.out.println("Productos en mi base: ");
        for(Producto producto:productos)
            System.out.println(producto);

        System.out.println("Ahora muestro las facturas:");
        List<Factura> facturas = (List<Factura>) session.createQuery("FROM Factura").list();
        for (Factura f: facturas)
            System.out.println(f);
        System.out.println("Detalle de items de la primer factura");
        Factura unaFactura = facturas.get(0);
        System.out.println(unaFactura.getItems());

    }
}
