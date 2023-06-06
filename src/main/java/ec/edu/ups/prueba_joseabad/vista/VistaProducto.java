/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.vista;

import ec.edu.ups.prueba_joseabad.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaProducto {

    private Scanner teclado;

    public Producto ingresarProducto() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese el codigo del Producto: ");
        int codigo = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre del produto");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la descripcion del producto");
        String descripción = teclado.nextLine();
        System.out.println("Ingrese el precio del producto");
        double precio = teclado.nextInt();
        return new Producto(codigo, nombre, descripción, precio);
    }

    public Producto actualizarProducto() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese los datos del Producto a actualizar: ");
        int codigo = teclado.nextInt();
        System.out.println("Ingrese el nuevo nombre del producto");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese la nueva descripcion");
        String descripción = teclado.nextLine();
        System.out.println("Ingrese el nuevo precio del producto");
        double precio = teclado.nextInt();
        return new Producto(codigo, nombre, descripción, precio);
    }

    public Producto eliminarProducto() {
        System.out.println("Ingrese el codigo del producto a eliminar: ");
        int id = teclado.nextInt();
        return new Producto(id);
    }

    public int buscarProducto() {
        System.out.println("Buscando producto con codigo: ");
        int id = teclado.nextInt();
        return id;
    }

    public void verProducto(Producto producto) {
        System.out.println("Los datos del producto son: " + producto);
    }

    public void verProductos(List<Producto> productos) {
        for (Producto producto : productos) {
            System.out.println("Datos del producto: " + producto);
        }
    }
}
