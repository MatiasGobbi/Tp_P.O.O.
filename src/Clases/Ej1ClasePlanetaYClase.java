package Clases;

import java.util.Scanner;

public class Ej1ClasePlanetaYClase {

    public static class Producto {
        // Atributos
        private final String nombre;
        private final double precioOriginal;

        // Constructor
        public Producto(String nombre, double precioOriginal) {
            this.nombre = nombre;
            this.precioOriginal = precioOriginal;
        }

        // Metodo para calcular el precio final
        public double calcularPrecioConDescuento() {
            return precioOriginal * 0.90; // Aplica un 10% de descuento
        }

        // Metodo para imprimir información del producto
        public void imprimir() {
            double precioFinal = calcularPrecioConDescuento();
            System.out.printf("Producto: %s, Precio original: $%.2f, Precio con descuento: $%.2f%n",
                    nombre, precioOriginal, precioFinal);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar la cantidad de productos
        System.out.print("¿Cuántos productos deseas registrar? ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        // Crear un arreglo de objetos Producto
        Producto[] productos = new Producto[cantidadProductos];

        // Registrar los productos
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el nombre del producto " + (i + 1) + ": ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el precio original del producto " + nombre + ": ");
            double precioOriginal = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            // Crear el objeto Producto y guardarlo en el arreglo
            productos[i] = new Producto(nombre, precioOriginal);
        }

        // Mostrar los resultados
        System.out.println("\nPrecios finales con descuento aplicado:");
        for (Producto producto : productos) {
            producto.imprimir();
        }
    }
}
