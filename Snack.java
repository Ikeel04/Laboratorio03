class Snack extends Producto {
    private int gramos;
    private String sabor;
    private String tamanio;

    public Snack(int id, String nombre, int cantidadDisponible, int cantidadVendidos, String estado, double precio, int gramos, String sabor, String tamaño) {
        super(id, nombre, cantidadDisponible, cantidadVendidos, estado, precio);
        this.gramos = gramos;
        this.sabor = sabor;
        this.tamanio = tamanio;
    }

    public int obtenerGramos() {
        return gramos;
    }

    public String obtenerSabor() {
        return sabor;
    }

    public String obtenerTamanio() {
        return tamanio;
    }
}