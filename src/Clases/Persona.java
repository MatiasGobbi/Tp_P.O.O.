package Clases;

/*
Se requiere un programa que modele el concepto de una persona. Una persona posee
nombre, apellido, número de documento de identidad y año de nacimiento. La clase debe
tener un constructor que inicialice los valores de sus respectivos atributos.
La clase debe incluir los siguientes métodos:
- Definir un metodo que imprima en pantalla los valores de los atributos del objeto.
- En un metodo main se deben crear dos personas y mostrar los valores de sus atributos en pantalla.
*/

public class Persona {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anioNacimiento;
    String paisNacimiento;
    char genero; // Atributo de género ('H' o 'M')

    // Constructor que inicializa los atributos
    Persona(String nombre, String apellidos, String numeroDocumentoIdentidad, int anioNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anioNacimiento = anioNacimiento;
        this.paisNacimiento = paisNacimiento;

        // Validar que el género sea 'H' o 'M'
        if (genero == 'H' || genero == 'M') {
            this.genero = genero;
        } else {
            throw new IllegalArgumentException("Género inválido. Debe ser 'H' o 'M'.");
        }
    }

    // Metodo para imprimir los valores de los atributos
    void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellidos);
        System.out.println("Número de documento de identidad: " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento: " + anioNacimiento);
        System.out.println("País de nacimiento: " + paisNacimiento);
        System.out.println("Género: " + (genero == 'H' ? "Hombre" : "Mujer")); // Mostrar el género en texto
        System.out.println();
    }

    // Metodo principal
    public static void main(String[] args) {
        Persona p1 = new Persona("Pedro", "Pérez", "1053121010", 1998, "Argentina", 'H');
        Persona p2 = new Persona("Luis", "León", "1053223344", 2001, "Argentina", 'H');
        p1.imprimir();
        p2.imprimir();
    }
}