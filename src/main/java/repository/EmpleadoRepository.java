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
        Empleado e1 = new Empleado("Juan", "Perez", "12345678", "20123456780", "3764208778");
        Empleado e2 = new Empleado("Pepito", "Gomez", "32143232", "23321432321", "3764877741");
        Empleado e3 = new Empleado("Lucia", "Martinez", "23123456", "20987654321", "3764112233");
        Empleado e4 = new Empleado("Carlos", "Lopez", "19876543", "20111222333", "3764001122");
        Empleado e5 = new Empleado("Ana", "Garcia", "33445566", "20998887766", "3764556677");
        Empleado e6 = new Empleado("Marcos", "Rodriguez", "12344321", "20334455667", "3764332211");
        Empleado e7 = new Empleado("Laura", "Fernandez", "22334455", "20991122334", "3764888999");
        Empleado e8 = new Empleado("Diego", "Alvarez", "33442211", "20123444332", "3764007788");
        Empleado e9 = new Empleado("Cecilia", "Torres", "11223344", "20112233445", "3764661122");
        Empleado e10 = new Empleado("Pedro", "Ramirez", "44556677", "20998877665", "3764778899");
        Empleado e11 = new Empleado("Valeria", "Mendez", "77889900", "20110009987", "3764990001");
        Empleado e12 = new Empleado("Mateo", "Silva", "55667788", "20998877664", "3764888777");
        Empleado e13 = new Empleado("Florencia", "Sosa", "66778899", "20112223334", "3764667788");
        Empleado e14 = new Empleado("Lucas", "Ruiz", "88990011", "20990001122", "3764991122");
        Empleado e15 = new Empleado("Martina", "Diaz", "99001122", "20998812345", "3764886655");
        Empleado e16 = new Empleado("Santiago", "Morales", "11224466", "20113334455", "3764778890");
        Empleado e17 = new Empleado("Camila", "Romero", "33221100", "20995544332", "3764667789");
        Empleado e18 = new Empleado("Franco", "Vega", "44557788", "20998811223", "3764998899");
        Empleado e19 = new Empleado("Agustina", "Herrera", "55668899", "20119988776", "3764556678");
        Empleado e20 = new Empleado("Bruno", "Castro", "66779900", "20121123456", "3764223344");

        this.empleados.add(e1);
        this.empleados.add(e2);
        this.empleados.add(e3);
        this.empleados.add(e4);
        this.empleados.add(e5);
        this.empleados.add(e6);
        this.empleados.add(e7);
        this.empleados.add(e8);
        this.empleados.add(e9);
        this.empleados.add(e10);
        this.empleados.add(e11);
        this.empleados.add(e12);
        this.empleados.add(e13);
        this.empleados.add(e14);
        this.empleados.add(e15);
        this.empleados.add(e16);
        this.empleados.add(e17);
        this.empleados.add(e18);
        this.empleados.add(e19);
        this.empleados.add(e20);
    }

    public List<Empleado> findOne(String dni){
        List<Empleado> empleadosResult = new ArrayList<>();
        for(Empleado empleadoRecorrido : this.empleados){
            if(empleadoRecorrido.getDni().equals(dni))
                empleadosResult.add(empleadoRecorrido);
        }
        return empleadosResult;
    }

    public List<Empleado> findAll(){
        return this.empleados;
    }

    private boolean verificarDni(String dni){
        boolean encontrado = false;
        for(Empleado empleado: this.empleados){
            if (empleado.getDni().equals(dni))
                encontrado = true;
        }
        return  encontrado;
    }

    public void save(Empleado empleado){
        if(!verificarDni(empleado.getDni()))
            this.empleados.add(empleado);
    }

    public void delete(Empleado empleado){
        for (Empleado empleadoRecorrido : this.empleados){
            if(empleadoRecorrido.getDni().equals(empleado.getDni()))
                this.empleados.remove(empleadoRecorrido);
        }
    }

    private int buscarIndice(Empleado empleado){
        int indice = 0;
        for(Empleado empleadoRecorrido: this.empleados){
            if(empleadoRecorrido.getDni().equals(empleado.getDni())) {
                break;
            }
            indice++;
        }
        return indice;
    }

    public void update(Empleado empleado){
        int indice = 0;
        if(verificarDni(empleado.getDni())){
            indice = buscarIndice(empleado);
            this.empleados.get(indice).setNombre(empleado.getNombre());
            this.empleados.get(indice).setApellido(empleado.getApellido());
            this.empleados.get(indice).setTelefono(empleado.getTelefono());
        }
    }

}
