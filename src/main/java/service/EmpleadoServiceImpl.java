package service;

import model.Empleado;
import repository.EmpleadoRepository;

import java.util.List;

public class EmpleadoServiceImpl {
    private EmpleadoRepository repository;

    EmpleadoServiceImpl(){
       this.repository = new EmpleadoRepository();
    }

    public List<Empleado> findAll(){
        return this.repository.getEmpleados();
    }

    public void create(Empleado empleado){
        this.repository.save(empleado);
    }

    public List<Empleado> findByDni(String dni){
        return this.repository.findOne(dni);
    }
    public void update(Empleado empleado){
        this.repository.update(empleado);
    }

    public void delete(Empleado empleado){
        this.repository.delete(empleado);
    }
}
