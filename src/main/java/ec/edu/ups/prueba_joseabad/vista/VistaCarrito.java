/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.prueba_joseabad.vista;

import ec.edu.ups.prueba_joseabad.modelo.Carrito;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaCarrito {

    private Scanner teclado;

    public Carrito ingresarCarrito() throws ParseException {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar Fecha con formato DD/MM/YYYY:");
        String fecha1 = teclado.nextLine();
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(fecha1);
        System.out.println("Ingrese el subtotal del carrito: ");
        double subtotal = teclado.nextInt();
        System.out.println("Ingrese el codigo del carrito: ");
        double codigo = teclado.nextInt();
        return new Carrito(fecha, subtotal, codigo);
    }

    public Carrito actualizarCarrito() throws ParseException {
        teclado = new Scanner(System.in);
        System.out.println("Ingresar datos:");
        String fecha1 = teclado.nextLine();
        DateFormat format = new SimpleDateFormat("DD/MM/YYYY");
        Date fecha = format.parse(fecha1);
        System.out.println("Ingrese el nuevo subtotal");
        int subtotal = teclado.nextInt();
        System.out.println("Ingrese el nuevo codigo ");
        int codigo = teclado.nextInt();
        return new Carrito(fecha, subtotal, codigo);
    }

    public Carrito eliminarCarrito() {
        System.out.println("Ingrese el codigo del carrito a eliminar: ");
        int id = teclado.nextInt();
        return new Carrito(id);
    }

    public int buscarCarrito() {
        System.out.println("Buscando carrito con codigo: ");
        int id = teclado.nextInt();
        return id;
    }

    public void verCarrito(Carrito carrito) {
        System.out.println("Los datos de cliente son: " + carrito);
    }

    public void verCarritos(List<Carrito> carritos) {
        for (Carrito carrito : carritos) {
            System.out.println("Datos del cliente: " + carrito);
        }
    }
}
