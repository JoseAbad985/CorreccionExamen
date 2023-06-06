/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.IDAO;

import ec.edu.ups.prueba_joseabad.modelo.Carrito;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface CarritoIDAO {
    public void create(Carrito carrito);
    public Carrito read(int id);
    public void update(Carrito carrito);
    public void delete(Carrito carrito);   
    public List<Carrito> findAll();
}
