public class personalizedPlan extends plan {
    private boolean nutricion;

    public personalizedPlan(String codigo, Intensidad intensidad, double costoBase, boolean nutricion) {
        super(codigo, intensidad, costoBase);
        this.nutricion = nutricion;
    }

    public boolean tieneNutricion() {
        return nutricion;
    }

    public void setNutricion(boolean nutricion) {
        this.nutricion = nutricion;
    }

    @Override
    public double getCosto() {
        
        double costo = getCostoBase() * 1.60;
        
        if (nutricion) {
            costo += getCostoBase() * 0.20;
        }
        return costo;
    }
}
