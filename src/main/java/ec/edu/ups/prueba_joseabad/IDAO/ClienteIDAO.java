/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.IDAO;
import ec.edu.ups.prueba_joseabad.modelo.Cliente;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public interface ClienteIDAO {
    public void create(Cliente cliente);
    public Cliente read(String id);
    public void update(Cliente cliente);
    public void delete(Cliente cliente);   
    public List<Cliente> findAll();
}
