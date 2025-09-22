public class Taco extends Calzado {
    private boolean luisXV;
    private boolean importado;

    public taco(int id, int talle, double precioBase, boolean luisXV, boolean importado) {
        super(id, talle, precioBase);
        this.luisXV = luisXV;
        this.importado = importado;
    }

    @Override
    public double getPrecioVenta() {
        double precio = precioBase * 1.3;
        if (luisXV && importado) {
            precio *= 1.5;
        }
        return precio;
    }
}
