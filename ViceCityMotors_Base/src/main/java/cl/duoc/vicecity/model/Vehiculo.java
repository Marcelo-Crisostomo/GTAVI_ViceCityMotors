package cl.duoc.vicecity.model;

// Clase padre abstracta: reúne los atributos comunes a todos los vehículos.
// ENTREGADA POR EL DOCENTE: no debes modificarla.
public abstract class Vehiculo {

    // El ID identifica el registro; precioBase es el precio sin ajustes.
    private final int id, precioBase;
    // Código y nombre son los textos de cada vehículo.
    private final String codigo, nombre;

    // Constructor usado por las clases hijas VehiculoTerrestre y VehiculoAcuatico.
    public Vehiculo(int id, String codigo, String nombre, int precioBase) {
        // Verifica que código y nombre tengan contenido.
        if (codigo == null || codigo.isBlank() || nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("Código y nombre son obligatorios.");
        }
        // Un precio igual o inferior a cero no está permitido.
        if (precioBase <= 0) {
            throw new IllegalArgumentException("El precio debe ser mayor que cero.");
        }
        // Guarda el identificador asignado por MySQL (o 0 si es nuevo).
        this.id = id;
        // trim() elimina espacios al inicio y al final de los textos.
        this.codigo = codigo.trim();
        this.nombre = nombre.trim();
        // Guarda el precio original; cada clase hija calcula el final.
        this.precioBase = precioBase;
    }

    // Los getters permiten consultar los atributos privados.
    public int getId() { return id; }
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public int getPrecioBase() { return precioBase; }

    // Cada tipo de vehículo decide cómo responder estos métodos.
    public abstract String getTipo();
    public abstract int getPrecioFinal();

    // ListView utilizará este texto al mostrar cada vehículo.
    @Override
    public String toString() {
        return codigo + " - " + nombre + " - " + getTipo() + " - $" + getPrecioFinal();
    }
}
