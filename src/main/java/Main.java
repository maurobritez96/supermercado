import controller.MenuController;
import model.*;
import repository.ClienteRepository;
import repository.EmpleadoRepository;
import repository.ProveedorRepository;
import repository.VentasRepository;
import service.VentasService;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        MenuController menuController = new MenuController();
//        menuController.scan();

        EmpleadoRepository empleadoRepository = new EmpleadoRepository();
        ClienteRepository clienteRepository = new ClienteRepository();
        ProveedorRepository proveedorRepository = new ProveedorRepository();

        probarEmpleado(empleadoRepository);
        probarCliente(clienteRepository);
        probarProveedor(proveedorRepository);


    }

    public static void probarEmpleado(EmpleadoRepository empleadoRepository){
        System.out.println("------ empleado ------");
        System.out.println("nombre empleado existente: " + empleadoRepository.findOne("12345678").get(0).getNombre());

        Empleado e1 = new Empleado("Juana", "Perez", "12345678", "20123456780", "3764208778");
        System.out.println("nombre nuevo a modificar: " + e1.getNombre());

        empleadoRepository.update(e1);

        System.out.println("nombre empleado modificado: " + empleadoRepository.findOne("12345678").get(0).getNombre());
    }

    public static void probarCliente(ClienteRepository clienteRepository){
        System.out.println("------ cliente ------");
        System.out.println("nombre cliente existente: " + clienteRepository.findOne("20123456701").get(0).getNombre());

        Cliente c1 = new Cliente("Marcianito", "Gonzalez", "12345670", "20123456701", "3764208701");
        System.out.println("nombre nuevo a modificar: " + c1.getNombre());

        clienteRepository.update(c1);

        System.out.println("nombre empleado modificado: " + clienteRepository.findOne("20123456701").get(0).getNombre());
    }

    public static void probarProveedor(ProveedorRepository proveedorRepository){
        System.out.println("------ proveedor ------");
        System.out.println("nombre proveedor existente: " + proveedorRepository.findOne("30123456789").get(0).getNombre());

        Proveedor p1 = new Proveedor("Luissito comunista", "Gutierrez", "30123456789", "3764001001");
        System.out.println("nombre nuevo a modificar: " + p1.getNombre());

        proveedorRepository.update(p1);

        System.out.println("nombre proveedor modificado: " + proveedorRepository.findOne("30123456789").get(0).getNombre());
    }

}
