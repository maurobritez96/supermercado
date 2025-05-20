package model;

import lombok.Data;


@Data
public class LineaDeVenta {
    private Integer unidad;
    private Float precioUnitario;
    private Float precioTotal;

    private Producto producto;
}
