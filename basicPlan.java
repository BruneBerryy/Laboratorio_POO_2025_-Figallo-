public class basicPlan extends plan {

    public basicPlan(String codigo, Intensidad intensidad, double costoBase) {
        super(codigo, intensidad, costoBase);
    }

    @Override
    public double getCosto() {
        return getCostoBase();
    }
}
