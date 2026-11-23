package cl.duoc.vicecity.model;

// Una clase hija es una especialización de Vehiculo (autos, motos, muscle cars).
// ENTREGADA POR EL DOCENTE: no debes modificarla.
public class VehiculoTerrestre extends Vehiculo {

    // Envía los datos al constructor de la clase padre.
    public VehiculoTerrestre(int id, String codigo, String nombre, int precio) {
        super(id, codigo, nombre, precio);
    }

    // Identifica a este objeto como un vehículo terrestre.
    @Override
    public String getTipo() { return "TERRESTRE"; }

    // Regla de negocio: suma $10.000 de permiso de circulación de Leonida.
    @Override
    public int getPrecioFinal() { return getPrecioBase() + 10000; }
}
