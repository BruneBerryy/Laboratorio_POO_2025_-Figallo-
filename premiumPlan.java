public class premiumPlan extends plan {

    public premiumPlan(String codigo, Intensidad intensidad, double costoBase) {
        super(codigo, intensidad, costoBase);
    }

    @Override
    public double getCosto() {
        return getCostoBase() * 1.40;
    }
}
