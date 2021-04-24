package ar.com.xeven;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="facturas")
public class Factura {
    @Id
    private int id;
    private String nombreCliente;
    private int precioTotal;
    private int cantidadItems;
    @OneToMany(mappedBy = "idFactura", fetch = FetchType.LAZY)
    private List<Item> items;//podría ser EAGER o LAZY (probarlos!!)

    public Factura() {
    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", precioTotal=" + precioTotal +
                ", cantidadItems=" + cantidadItems +
                '}';
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCantidadItems() {
        return cantidadItems;
    }

    public void setCantidadItems(int cantidadItems) {
        this.cantidadItems = cantidadItems;
    }
}
