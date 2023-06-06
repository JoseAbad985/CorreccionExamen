/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.controlador;

import ec.edu.ups.prueba_joseabad.DAO.ClienteDAO;
import ec.edu.ups.prueba_joseabad.IDAO.CarritoIDAO;
import ec.edu.ups.prueba_joseabad.IDAO.ClienteIDAO;
import ec.edu.ups.prueba_joseabad.IDAO.ProductoIDAO;
import ec.edu.ups.prueba_joseabad.modelo.Carrito;
import ec.edu.ups.prueba_joseabad.modelo.Cliente;
import ec.edu.ups.prueba_joseabad.modelo.Producto;
import ec.edu.ups.prueba_joseabad.vista.VistaCarrito;
import ec.edu.ups.prueba_joseabad.vista.VistaCliente;
import ec.edu.ups.prueba_joseabad.vista.VistaProducto;
import java.text.ParseException;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class ControladorCarrito {

    private VistaCarrito vistaCarrito;
    private VistaCliente vistaCliente;
    private VistaProducto vistaProducto;
    private Carrito carrito;
    private Cliente cliente;
    private Producto producto;
    private CarritoIDAO carritoDAO;
    private ClienteIDAO clienteDAO;
    private ProductoIDAO productoDAO;
    
    
    public ControladorCarrito(VistaCarrito vistaCarrito, VistaCliente vistaCliente, VistaProducto vistaProducto, Carrito carrito, Cliente cliente, Producto producto, CarritoIDAO cantanteDAO) {
        this.vistaCarrito = vistaCarrito;
        this.vistaCliente = vistaCliente;
        this.vistaProducto = vistaProducto;
        this.carrito = carrito;
        this.cliente = cliente;
        this.producto = producto;
        this.carritoDAO = cantanteDAO;
    }

    public ControladorCarrito(VistaCarrito vistaCarrito, VistaCliente vistaCliente, VistaProducto vistaProducto, CarritoIDAO carritoDAO, ClienteIDAO clienteDAO, ProductoIDAO productoDAO) {
        this.vistaCarrito = vistaCarrito;
        this.vistaCliente = vistaCliente;
        this.vistaProducto = vistaProducto;
        this.carritoDAO = carritoDAO;
        this.clienteDAO = clienteDAO;
        this.productoDAO = productoDAO;
    }
    
    
    
    public ControladorCarrito(VistaCarrito vistaCarrito, VistaCliente vistaCliente, VistaProducto vistaProducto, CarritoIDAO carritoDAO) {
        this.vistaCarrito = vistaCarrito;
        this.vistaCliente = vistaCliente;
        this.vistaProducto = vistaProducto;
        this.carritoDAO = carritoDAO;
    }

    public void registrarCarrito() throws ParseException {
        carrito = vistaCarrito.ingresarCarrito();
        String idC = vistaCliente.buscarCliente();
        cliente = clienteDAO.read(idC);
        int idP = vistaProducto.buscarProducto();
        producto = productoDAO.read(idP);
        carrito.agregarCliente(cliente);
        carrito.agregarProducto(producto);
        double iva = carrito.calcularIva(carrito);
        carrito.setIva(iva);
        double total = carrito.calcularTotal(carrito);
        carrito.setTotal(total);
        carritoDAO.create(carrito);
    }

    public void verCarrito() {
        int id = vistaCarrito.buscarCarrito();
        carrito = carritoDAO.read(id);
        vistaCarrito.verCarrito(carrito);
    }

    public void actualizarCarrito() throws ParseException {
        carrito = vistaCarrito.actualizarCarrito();
        carritoDAO.update(carrito);
    }

    public void eliminarCarrito() {
        carrito = vistaCarrito.eliminarCarrito();
        carritoDAO.delete(carrito);
    }

    public void verCarritos() {
        List<Carrito> carritos;
        carritos = carritoDAO.findAll();
        vistaCarrito.verCarritos(carritos);
    }
    
}
