/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.ups.prueba_joseabad.main;

import ec.edu.ups.prueba_joseabad.DAO.CarritoDAO;
import ec.edu.ups.prueba_joseabad.DAO.ClienteDAO;
import ec.edu.ups.prueba_joseabad.DAO.ProductoDAO;
import ec.edu.ups.prueba_joseabad.controlador.ControladorCarrito;
import ec.edu.ups.prueba_joseabad.controlador.ControladorCliente;
import ec.edu.ups.prueba_joseabad.controlador.ControladorProducto;
import ec.edu.ups.prueba_joseabad.vista.VistaCarrito;
import ec.edu.ups.prueba_joseabad.vista.VistaCliente;
import ec.edu.ups.prueba_joseabad.vista.VistaProducto;
import java.text.ParseException;

/**
 *
 * @author ESTUDIANTE
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        VistaCarrito vistaCarrito = new VistaCarrito();
        VistaCliente vistaCliente = new VistaCliente();
        VistaProducto vistaProducto = new VistaProducto();

        CarritoDAO carritoDAO = new CarritoDAO();
        ClienteDAO clienteDAO = new ClienteDAO();
        ProductoDAO productoDAO = new ProductoDAO();

        ControladorCarrito controladorCarrito = new ControladorCarrito(vistaCarrito, vistaCliente, vistaProducto, carritoDAO, clienteDAO, productoDAO);
        ControladorCliente controladorCliente = new ControladorCliente(vistaCliente, clienteDAO);
        ControladorProducto controladorProducto = new ControladorProducto(vistaProducto, productoDAO);
        
        
        
        // Crear un cliente para asignar a un carrito
        controladorCliente.registrarCliente();
        
        
        // Crear un producto para asignar a un carrito
        controladorProducto.registrarProducto();
        
        
        // Crear un carrito
        controladorCarrito.registrarCarrito();
        
        //ver el carrito 
        controladorCarrito.verCarrito();

    }
}
