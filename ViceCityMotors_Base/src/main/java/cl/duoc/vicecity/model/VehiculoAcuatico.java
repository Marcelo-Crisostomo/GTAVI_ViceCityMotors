package cl.duoc.vicecity.model;

// VehiculoAcuatico también hereda los atributos y validaciones de Vehiculo.
// ENTREGADA POR EL DOCENTE: no debes modificarla.
public class VehiculoAcuatico extends Vehiculo {

    // Usa super(...) para aprovechar el constructor de la clase padre.
    public VehiculoAcuatico(int id, String codigo, String nombre, int precio) {
        super(id, codigo, nombre, precio);
    }

    // Identifica al vehículo como acuático (lanchas, motos de agua, yates).
    @Override
    public String getTipo() { return "ACUATICO"; }

    // Regla de negocio: descuento del 20 % por temporada en Vice Beach.
    @Override
    public int getPrecioFinal() { return Math.round(getPrecioBase() * 0.80f); }
}
