public class Borcego extends Calzado {
	
    public borcego(int id, int talle, double precioBase) {
        super(id, talle, precioBase);
    }

    @Override
    public double getPrecioVenta() {
        return precioBase * 1.2;
    }
}
