package model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Cliente extends Persona{
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido, String cuil, String telefono) {
        this.setCuil(cuil);
        this.setTelefono(telefono);
        this.nombre = nombre;
        this.apellido = apellido;

    }
}
