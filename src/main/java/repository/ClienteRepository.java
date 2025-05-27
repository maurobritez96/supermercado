package repository;

import lombok.Getter;
import model.Cliente;

import java.util.ArrayList;
import java.util.List;


@Getter
public class ClienteRepository {

    private List<Cliente> clientes;

    public ClienteRepository(){
        this.clientes = new ArrayList<>();
        cargarData();
    }

    private void cargarData() {
        Cliente c1 = new Cliente("Mario", "Gonzalez", "12345670", "20123456701", "3764208701");
        Cliente c2 = new Cliente("Sofia", "Ramirez", "32143230", "23321432302", "3764877702");
        Cliente c3 = new Cliente("Andres", "Lopez", "23123450", "20987654303", "3764112203");
        Cliente c4 = new Cliente("Luciana", "Diaz", "19876540", "20111222304", "3764001104");
        Cliente c5 = new Cliente("Ricardo", "Mendez", "33445560", "20998887705", "3764556605");
        Cliente c6 = new Cliente("Daniela", "Suarez", "12344320", "20334455606", "3764332206");
        Cliente c7 = new Cliente("Federico", "Torres", "22334450", "20991122307", "3764888907");
        Cliente c8 = new Cliente("Julia", "Vazquez", "33442210", "20123444308", "3764007708");
        Cliente c9 = new Cliente("Emilia", "Cruz", "11223340", "20112233409", "3764661109");
        Cliente c10 = new Cliente("Nicolas", "Herrera", "44556670", "20998877610", "3764778810");
        Cliente c11 = new Cliente("Marina", "Peralta", "77889901", "20110009911", "3764990011");
        Cliente c12 = new Cliente("Joaquin", "Silveira", "55667780", "20998877612", "3764888712");
        Cliente c13 = new Cliente("Marta", "Rojas", "66778890", "20112223313", "3764667713");
        Cliente c14 = new Cliente("Oscar", "Ruiz", "88990010", "20990001114", "3764991114");
        Cliente c15 = new Cliente("Carla", "Bianchi", "99001120", "20998812315", "3764886615");
        Cliente c16 = new Cliente("Pablo", "Dominguez", "11224460", "20113334416", "3764778816");
        Cliente c17 = new Cliente("Flor", "Romano", "33221101", "20995544317", "3764667717");
        Cliente c18 = new Cliente("Leonardo", "Gimenez", "44557780", "20998811218", "3764998818");
        Cliente c19 = new Cliente("Valentina", "Navarro", "55668890", "20119988719", "3764556619");
        Cliente c20 = new Cliente("Tomas", "Ferrer", "66779901", "20121123420", "3764223320");

        this.clientes.add(c1);
        this.clientes.add(c2);
        this.clientes.add(c3);
        this.clientes.add(c4);
        this.clientes.add(c5);
        this.clientes.add(c6);
        this.clientes.add(c7);
        this.clientes.add(c8);
        this.clientes.add(c9);
        this.clientes.add(c10);
        this.clientes.add(c11);
        this.clientes.add(c12);
        this.clientes.add(c13);
        this.clientes.add(c14);
        this.clientes.add(c15);
        this.clientes.add(c16);
        this.clientes.add(c17);
        this.clientes.add(c18);
        this.clientes.add(c19);
        this.clientes.add(c20);
    }

    // buscar por cuil
    public List<Cliente> findOne(String cuil){
        List<Cliente> clientesResult = new ArrayList<>();
        for(Cliente clienteRecorrido : this.clientes){
            if(clienteRecorrido.getCuil().equals(cuil))
                clientesResult.add(clienteRecorrido);
        }
        return clientesResult;
    }

    public List<Cliente> findAll(){
        return this.clientes;
    }

    private boolean verificarCuil(String cuil){
        boolean encontrado = false;
        for(Cliente cliente: this.clientes){
            if (cliente.getCuil().equals(cuil))
                encontrado = true;
        }
        return  encontrado;
    }

    public void save(Cliente cliente){
        if(!verificarCuil(cliente.getCuil()))
            this.clientes.add(cliente);
    }

    public void delete(Cliente cliente){
        for (Cliente clienteRecorrido : this.clientes){
            if(clienteRecorrido.getCuil().equals(cliente.getCuil()))
                this.clientes.remove(clienteRecorrido);
        }
    }

    private int buscarIndice(Cliente cliente){
        int indice = 0;
        for(Cliente clienteRecorrido: this.clientes){
            if(clienteRecorrido.getCuil().equals(cliente.getCuil())) {
                break;
            }
            indice++;
        }
        return indice;
    }

    public void update(Cliente cliente){
        int indice = 0;
        if(verificarCuil(cliente.getCuil())){
            indice = buscarIndice(cliente);
            this.clientes.get(indice).setNombre(cliente.getNombre());
            this.clientes.get(indice).setApellido(cliente.getApellido());
            this.clientes.get(indice).setTelefono(cliente.getTelefono());
        }
    }
}
