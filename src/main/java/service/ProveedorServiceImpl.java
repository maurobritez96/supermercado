package service;

import model.Proveedor;
import repository.ProveedorRepository;

import java.util.List;

public class ProveedorServiceImpl {
    private ProveedorRepository repository;

    ProveedorServiceImpl(){
        this.repository = new ProveedorRepository();
    }

    public List<Proveedor> findAll(){
        return this.repository.getProveedores();
    }

    public void create(Proveedor proveedor){
        this.repository.save(proveedor);
    }

    public List<Proveedor> findByCuit(String cuit){
        return this.repository.findOne(cuit);
    }

    public void update(Proveedor proveedor){
        this.repository.update(proveedor);
    }

    public void delete(Proveedor proveedor){
        this.repository.delete(proveedor);
    }
}
