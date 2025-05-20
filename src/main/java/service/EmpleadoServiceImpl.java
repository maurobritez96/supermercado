package service;

import model.Empleado;
import repository.EmpleadoRepository;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoServiceImpl {
    private EmpleadoRepository repository;

    EmpleadoServiceImpl(){
       this.repository = new EmpleadoRepository();
    }

    public List<Empleado> findAll(){
        return this.repository.getEmpleados();
    }

    public Empleado create(Empleado empleado){
        return null;
    }
    public Empleado findOne(Empleado empleado){
        return null;
    }
    public List<Empleado> findByDni(String dni){
        List<Empleado> empleadosResult = new ArrayList<>();
        for(Empleado empleadoRecorrido : repository.getEmpleados()){
            if(empleadoRecorrido.getDni().equals(dni))
                empleadosResult.add(empleadoRecorrido);
        }
        return empleadosResult;
    }
    public void update(Empleado empleadoSeleccionado, Empleado empleadoActualizado){}

    public void delete(Empleado empleado){}
}
