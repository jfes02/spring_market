package com.eeiren.market.persistence.entity;


import jakarta.persistence.*;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    @EmbeddedId
    private ComprasProductoKT id;

    private Integer cantidad;
    private Integer total;
    private Boolean estado;

    @ManyToOne()
    @JoinColumn(name = "id_compra", insertable = false, updatable = false)
    private ComprasProductoKT comprasProductoKT;

    @ManyToOne()
    @JoinColumn(name = "id_producto", insertable = false, updatable = false)
    private Producto producto;


    public ComprasProductoKT getId() {
        return id;
    }

    public void setId(ComprasProductoKT id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
