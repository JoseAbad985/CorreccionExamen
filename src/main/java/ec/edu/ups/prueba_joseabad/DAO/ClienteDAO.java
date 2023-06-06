/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.DAO;

import ec.edu.ups.prueba_joseabad.IDAO.ClienteIDAO;
import ec.edu.ups.prueba_joseabad.modelo.Cliente;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ClienteDAO implements ClienteIDAO {

    private List<Cliente> listaCliente;

    
    public ClienteDAO(){
        listaCliente = new ArrayList<>();
    }
    
    
    @Override
    public void create(Cliente cliente) {
        listaCliente.add(cliente);
    }

    @Override
    public Cliente read(String id) {
        for (Cliente cliente : listaCliente) {
            if (cliente.getCedula().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void update(Cliente cliente) {
        for (int i = 0; i < listaCliente.size(); i++) {
            Cliente c = listaCliente.get(i);
            if (c.getCedula().equals(cliente.getCedula())) {
                listaCliente.set(i, cliente);
                break;
            }
        }
    }

    @Override
    public void delete(Cliente cliente) {
        Iterator<Cliente> it = listaCliente.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getCedula().equals(cliente.getCedula())){
                it.remove();
                break;
            }
        }
    }

    @Override
    public List<Cliente> findAll() {
        return listaCliente;
    }

}
