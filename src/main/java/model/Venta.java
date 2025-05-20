package model;


import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Venta {
    private Date fecha;
    private Empleado empleado;
    private Cliente cliente;
    private List<LineaDeVenta> lineaDeVentas = new ArrayList<>();
}
