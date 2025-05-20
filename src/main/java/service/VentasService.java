package service;

import model.Venta;
import repository.VentasRepository;

import java.util.List;

public class VentasService {
    VentasRepository ventasRepository = new VentasRepository();

    public List<Venta> listaDeVentas(){
        return this.ventasRepository.findAll();
    }
}
