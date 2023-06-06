/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.DAO;

import ec.edu.ups.prueba_joseabad.IDAO.CarritoIDAO;
import ec.edu.ups.prueba_joseabad.modelo.Carrito;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class CarritoDAO implements CarritoIDAO {

    private List<Carrito> listaCarrito;
    
    public CarritoDAO(){
        listaCarrito = new ArrayList<>();
    }

    @Override
    public void create(Carrito carrito) {
        listaCarrito.add(carrito);
    }

    @Override
    public Carrito read(int id) {
        for (Carrito carrito : listaCarrito) {
            if (carrito.getCodigo() == id) {
                return carrito;
            }
        }
        return null;
    }

    @Override
    public void update(Carrito carrito) {
        for (int i = 0; i < listaCarrito.size(); i++) {
            Carrito c = listaCarrito.get(i);
            if (c.getCodigo() == carrito.getCodigo()) {
                listaCarrito.set(i, carrito);
                break;
            }
        }
    }

    @Override
    public void delete(Carrito carrito) {

        Iterator<Carrito> it = listaCarrito.iterator();
        while (it.hasNext()) {
            Carrito c = it.next();
            if (c.getCodigo() == carrito.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Carrito> findAll() {
        return listaCarrito;
    }

}
