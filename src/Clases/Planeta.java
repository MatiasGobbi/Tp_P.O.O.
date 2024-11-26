package Clases;
/*
Se requiere un programa que modele el concepto de un planeta del sistema
solar. Un planeta tiene los siguientes atributos:
- Un nombre de tipo Srping con valor inicial de null.
- Cantidad de satélites de tipo int con valor inicial de cero.
- Masa en kilogramos de tipo double con valor inicial de cero.
- Volumen en kilómetros cúbicos de tipo double con valor inicial de
cero.
- Diámetro en kilómetros de tipo int con valor inicial de cero.
- Distancia media al Sol en millones de kilómetros, de tipo int con
valor inicial de cero.
- Tipo de planeta de acuerdo con su tamaño, de tipo enumerado con
los siguientes valores posibles: GASEOSO, TERRESTRE y ENANO.
- Observable a simple vista, de tipo booleano con valor inicial false.
La clase debe incluir los siguientes métodos:
- La clase debe tener un constructor que inicialice los valores de sus
respectivos atributos.
- Definir un metodo que imprima en pantalla los valores de los atributos de un planeta.
- Calcular la densidad un planeta, como el cociente entre su masa y
su volumen.
- Determinar si un planeta del sistema solar se considera exterior.
Un planeta exterior está situado más allá del cinturón de asteroides. El cinturón
de asteroides se encuentra entre 2.1 y 3.4 UA. Una unidad astronómica (UA) es la distancia
entre la Tierra y el Sol = 149597870 Km.
- En un metodo main se deben crear dos planetas y mostrar los valores de sus atributos en
pantalla. Además, se debe imprimir la densidad de cada planeta y si el planeta es un
planeta exterior del sistema solar.
*/
public class Planeta {

    // Atributos existentes
    String nombre = null;
    int cantidadSatelites = 0;
    double masaKg = 0.0;
    double volumenKmCubico = 0.0;
    int diametroKm = 0;
    int distanciaMediaSolKm = 0;
    TipoPlaneta tipoPlaneta = null;
    boolean observableSimpleVista = false;

    // Nuevos atributos
    double periodoOrbital = 0.0; // en años
    double periodoRotacion = 0.0; // en días

    // Enumeración para tipos de planeta
    public enum TipoPlaneta {
        GASEOSO,
        TERRESTRE,
        ENANO
    }

    // Constructor actualizado
    public Planeta(String nombre, int cantidadSatelites, double masaKg, double volumenKmCubico, int diametroKm,
                   int distanciaMediaSolKm, TipoPlaneta tipoPlaneta, boolean observableSimpleVista,
                   double periodoOrbital, double periodoRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masaKg = masaKg;
        this.volumenKmCubico = volumenKmCubico;
        this.diametroKm = diametroKm;
        this.distanciaMediaSolKm = distanciaMediaSolKm;
        this.tipoPlaneta = tipoPlaneta;
        this.observableSimpleVista = observableSimpleVista;
        this.periodoOrbital = periodoOrbital;
        this.periodoRotacion = periodoRotacion;
    }

    // Metodo para imprimir los valores de los atributos
    public void imprimirAtributos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masaKg);
        System.out.println("Volumen (km³): " + volumenKmCubico);
        System.out.println("Densidad (kg/km³): " + calcularDensidad());
        System.out.println("Diámetro (km): " + diametroKm);
        System.out.println("Distancia media al Sol (millones de km): " + distanciaMediaSolKm);
        System.out.println("Tipo de planeta: " + tipoPlaneta);
        System.out.println("Observable a simple vista: " + (observableSimpleVista ? "Sí" : "No"));
        System.out.println("Periodo orbital (años): " + periodoOrbital);
        System.out.println("Periodo de rotación (días): " + periodoRotacion);
        System.out.println("¿Es un planeta exterior?: " + (esPlanetaExterior() ? "Sí" : "No"));
        System.out.println("-------------------------------------------");
    }

    // Metodo para calcular la densidad del planeta
    public double calcularDensidad() {
        if (volumenKmCubico != 0) {
            return masaKg / volumenKmCubico;
        } else {
            return 0;
        }
    }

    // Metodo para determinar si el planeta es exterior
    public boolean esPlanetaExterior() {
        // Convertir la distancia media al Sol a unidades astronómicas (UA)
        double distanciaEnKm = distanciaMediaSolKm * 1_000_000; // Convertir a km
        double distanciaEnUA = distanciaEnKm / 149_597_870; // 1 UA = 149,597,870 km

        // El cinturón de asteroides está entre 2.1 y 3.4 UA
        return distanciaEnUA > 3.4;
    }

    public static void main(String[] args) {
        // Crear dos planetas con los nuevos atributos
        Planeta planeta1 = new Planeta(
                "Júpiter",
                79,
                1.898E27,
                1.43128E15,
                139820,
                778,
                TipoPlaneta.GASEOSO,
                true,
                11.86, // Periodo orbital (años)
                0.41  // Periodo de rotación (días)
        );

        Planeta planeta2 = new Planeta(
                "Marte",
                2,
                6.39E23,
                1.6318E11,
                6779,
                228,
                TipoPlaneta.TERRESTRE,
                true,
                1.88, // Periodo orbital (años)
                1.03  // Periodo de rotación (días)
        );

        planeta1.imprimirAtributos();
        planeta2.imprimirAtributos();
    }
}