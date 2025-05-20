package model;


import lombok.Data;

@Data
public class Producto {
    private String descripcion;
    private Proveedor proveedor;
}
