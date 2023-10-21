import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Producto {
    private int id;
    private String nombre;
    private int cantidadDisponible;
    private int cantidadVendidos;
    private String estado;
    private double precio;

    public Producto(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.cantidadDisponible = cantidadDisponible;
        this.cantidadVendidos = cantidadVendidos;
        this.estado = estado;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double obtenerPrecioVenta() {
        return precio;
    }

    public void vender(int cantidad) {
        cantidadVendidos += cantidad;
        cantidadDisponible -= cantidad;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }
}