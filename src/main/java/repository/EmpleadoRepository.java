package repository;

import lombok.Getter;
import model.Empleado;

import java.util.ArrayList;
import java.util.List;

@Getter
public class EmpleadoRepository {
    private List<Empleado> empleados;

    public EmpleadoRepository(){
        this.empleados = new ArrayList<>();
        cargarData();
    }

    private void cargarData(){
        Empleado e1 = new Empleado();
        Empleado e2 = new Empleado();

        this.empleados.add(e1);
        this.empleados.add(e2);
    }
}
