package service;

import model.Cliente;
import repository.ClienteRepository;

import java.util.List;

public class ClienteServiceImpl {
    private ClienteRepository repository;

    ClienteServiceImpl(){
        this.repository = new ClienteRepository();
    }

    public List<Cliente> findAll(){
        return this.repository.getClientes();
    }

    public void create(Cliente cliente){
        this.repository.save(cliente);
    }

    public List<Cliente> findByCuil(String cuil){
        return this.repository.findOne(cuil);
    }

    public void update(Cliente cliente){
        this.repository.update(cliente);
    }

    public void delete(Cliente cliente){
        this.repository.delete(cliente);
    }
}
