/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.IDAO;

import ec.edu.ups.prueba_joseabad.modelo.Producto;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface ProductoIDAO {
    public void create(Producto producto);
    public Producto read(int id);
    public void update(Producto producto);
    public void delete(Producto producto);   
    public List<Producto> findAll();
}
