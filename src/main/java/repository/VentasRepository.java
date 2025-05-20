package repository;


import model.*;

import java.util.ArrayList;
import java.util.List;

public class VentasRepository {

    List<Venta> ventas = new ArrayList<>();

    public VentasRepository() {

    }

    public List<Venta> findAll(){
        return ventas;
    }
}
