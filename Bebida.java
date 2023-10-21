class Bebida extends Producto {
    private int mililitros;
    private String tipo;

    public Bebida(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, int mililitros, String tipo) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.mililitros = mililitros;
        this.tipo = tipo;
    }

    public int obtenerMililitros() {
        return mililitros;
    }

    public String obtenerTipo() {
        return tipo;
    }
}