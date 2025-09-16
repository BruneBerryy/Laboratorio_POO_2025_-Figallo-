public abstract class Calzado {
    protected int id;
    protected int talle;
    protected double precioBase;

    public Calzado(int id, int talle, double precioBase) {
        this.id = id;
        this.talle = talle;
        this.precioBase = precioBase;
    }

    public abstract double getPrecioVenta();

    public boolean esEnLiquidacion() {
        return precioBase < 15000 || (this instanceof Borcego && talle >= 40);
    }

    public int getId() { return id; }
    public int getTalle() { return talle; }
    public double getPrecioBase() { return precioBase; }
}
