public class Sandalia extends Calzado {
    public sandalia(int id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase;
    }
}
