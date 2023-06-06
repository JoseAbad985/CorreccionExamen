/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.vista;

import ec.edu.ups.prueba_joseabad.modelo.Cliente;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCliente {

    private Scanner teclado;

    public Cliente ingresarCliente() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la cedula del Cliente: ");
        String cedula = teclado.nextLine();
        System.out.println("Ingrese el nombre del Cliente: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido del Cliente: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la direccion del Cliente: ");
        String dirección = teclado.nextLine();
        System.out.println("Ingrese el telefono del Cliente: ");
        String telefono = teclado.nextLine();
        return new Cliente(cedula, nombre, apellido, dirección, telefono);
    }

    public Cliente actualizarCliente() {
        teclado = new Scanner(System.in);
        System.out.println("Ingrese la nueva cedula del cliente a actualizar");
        String cedula = teclado.nextLine();
        System.out.println("Ingrese el nuevo nombre del cliente a actualizar");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el nuevo Apellido del cliente a actualizar");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese la nueva direccion del cliente a actualizar");
        String dirección = teclado.nextLine();
        System.out.println("Ingrese el nuevo telefono del cliente a actualizar");
        String telefono = teclado.nextLine();
        return new Cliente(cedula, nombre, apellido, dirección, telefono);
    }

    public Cliente eliminarCliente() {
        System.out.println("Ingrese la cedula del cliente a eliminar: ");
        String id = teclado.nextLine();
        return new Cliente(id);
    }

    public String buscarCliente() {
        System.out.println("Buscando cliente con cedula: ");
        String id = teclado.nextLine();
        return id;
    }

    public void verCliente(Cliente cliente) {
        System.out.println("Los datos del cliente con cedula 0101010");
        System.out.println("Los datos de cliente son: " + cliente);
    }

    public void verClientes(List<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            System.out.println("Datos del cliente: " + cliente);
        }
    }
}
