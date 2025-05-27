package repository;

import lombok.Getter;
import model.Proveedor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ProveedorRepository {

    private List<Proveedor> proveedores;

    public ProveedorRepository(){
        this.proveedores = new ArrayList<>();
        cargarData();
    }

    private void cargarData() {
        Proveedor p1 = new Proveedor("Luis", "Gutierrez", "30123456789", "3764001001");
        Proveedor p2 = new Proveedor("Elena", "Paz", "30876543210", "3764001002");
        Proveedor p3 = new Proveedor("Miguel", "Salas", "30112233445", "3764001003");
        Proveedor p4 = new Proveedor("Rosa", "Medina", "30556677881", "3764001004");
        Proveedor p5 = new Proveedor("Hector", "Acosta", "30998877663", "3764001005");
        Proveedor p6 = new Proveedor("Patricia", "Leiva", "30445566779", "3764001006");
        Proveedor p7 = new Proveedor("Jorge", "Funes", "30223344552", "3764001007");
        Proveedor p8 = new Proveedor("Teresa", "Molina", "30334455668", "3764001008");
        Proveedor p9 = new Proveedor("Diego", "Quiroga", "30778899006", "3764001009");
        Proveedor p10 = new Proveedor("Claudia", "Vega", "30667788991", "3764001010");
        Proveedor p11 = new Proveedor("Marcelo", "Ortega", "30889900114", "3764001011");
        Proveedor p12 = new Proveedor("Lorena", "Campos", "30990011227", "3764001012");
        Proveedor p13 = new Proveedor("Esteban", "Soto", "30112244665", "3764001013");
        Proveedor p14 = new Proveedor("Veronica", "Herrera", "30556688992", "3764001014");
        Proveedor p15 = new Proveedor("Gabriel", "Nuñez", "30667799000", "3764001015");
        Proveedor p16 = new Proveedor("Miriam", "Bravo", "30203344556", "3764001016");
        Proveedor p17 = new Proveedor("Ramiro", "Pereyra", "30209988777", "3764001017");
        Proveedor p18 = new Proveedor("Noelia", "Sosa", "30201122338", "3764001018");
        Proveedor p19 = new Proveedor("Ricardo", "Lopez", "30209988119", "3764001019");
        Proveedor p20 = new Proveedor("Daniela", "Martinez", "30201199880", "3764001020");

        this.proveedores.add(p1);
        this.proveedores.add(p2);
        this.proveedores.add(p3);
        this.proveedores.add(p4);
        this.proveedores.add(p5);
        this.proveedores.add(p6);
        this.proveedores.add(p7);
        this.proveedores.add(p8);
        this.proveedores.add(p9);
        this.proveedores.add(p10);
        this.proveedores.add(p11);
        this.proveedores.add(p12);
        this.proveedores.add(p13);
        this.proveedores.add(p14);
        this.proveedores.add(p15);
        this.proveedores.add(p16);
        this.proveedores.add(p17);
        this.proveedores.add(p18);
        this.proveedores.add(p19);
        this.proveedores.add(p20);
    }

    // buscar por cuit
    public List<Proveedor> findOne(String cuit){
        List<Proveedor> proveedoresResult = new ArrayList<>();
        for(Proveedor proveedorRecorrido : this.proveedores){
            if(proveedorRecorrido.getCuit().equals(cuit))
                proveedoresResult.add(proveedorRecorrido);
        }
        return proveedoresResult;
    }

    public List<Proveedor> findAll(){
        return this.proveedores;
    }

    private boolean verificarCuit(String cuit){
        boolean encontrado = false;
        for(Proveedor proveedor: this.proveedores){
            if (proveedor.getCuit().equals(cuit))
                encontrado = true;
        }
        return  encontrado;
    }

    public void save(Proveedor proveedor){
        if(!verificarCuit(proveedor.getCuit()))
            this.proveedores.add(proveedor);
    }

    public void delete(Proveedor proveedor){
        for (Proveedor proveedorRecorrido : this.proveedores){
            if(proveedorRecorrido.getCuit().equals(proveedor.getCuit()))
                this.proveedores.remove(proveedorRecorrido);
        }
    }

    private int buscarIndice(Proveedor proveedor){
        int indice = 0;
        for(Proveedor proveedorRecorrido: this.proveedores){
            if(proveedorRecorrido.getCuit().equals(proveedor.getCuit())) {
                break;
            }
            indice++;
        }
        return indice;
    }

    public void update(Proveedor proveedor){
        int indice = 0;
        if(verificarCuit(proveedor.getCuit())){
            indice = buscarIndice(proveedor);
            this.proveedores.get(indice).setNombre(proveedor.getNombre());
            this.proveedores.get(indice).setApellido(proveedor.getApellido());
            this.proveedores.get(indice).setTelefono(proveedor.getTelefono());
        }
    }
}
