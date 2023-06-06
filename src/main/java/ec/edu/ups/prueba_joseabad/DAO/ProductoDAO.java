/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.DAO;

import ec.edu.ups.prueba_joseabad.IDAO.ProductoIDAO;
import ec.edu.ups.prueba_joseabad.modelo.Producto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ProductoDAO implements ProductoIDAO {

    private List<Producto> listaProducto;
    
    public ProductoDAO(){
        listaProducto = new ArrayList<>();
    }

    @Override
    public void create(Producto producto) {
        listaProducto.add(producto);
    }

    @Override
    public Producto read(int id) {
        for (Producto producto : listaProducto) {
            if (producto.getCodigo() == id) {
                return producto;
            }
        }
        return null;
    }

    @Override
    public void update(Producto producto) {
        for (int i = 0; i < listaProducto.size(); i++) {
            Producto p = listaProducto.get(i);
            if (p.getCodigo() == producto.getCodigo()) {
                listaProducto.set(i, producto);
                break;
            }
        }
    }

    @Override
    public void delete(Producto producto) {
        Iterator<Producto> it = listaProducto.iterator();
        while (it.hasNext()) {
            Producto p = it.next();
            if (p.getCodigo() == producto.getCodigo()) {
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Producto> findAll() {
        return listaProducto;
    }

}
