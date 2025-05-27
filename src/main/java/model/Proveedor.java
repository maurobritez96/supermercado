package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proveedor {
    private String nombre;
    private String apellido;
    private String cuit;
    private String telefono;
}
