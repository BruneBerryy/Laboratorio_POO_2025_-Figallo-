public class plan {
    private String codigo;
    private Intensidad intensidad;
    private double costoBase;

    public plan(String codigo, Intensidad intensidad, double costoBase) {
        this.codigo = codigo;
        this.intensidad = intensidad;
        this.costoBase = costoBase;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Intensidad getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(Intensidad intensidad) {
        this.intensidad = intensidad;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }

    public double getCosto() {
        return costoBase;
    }


    public boolean esPromocion() {
        if (this.costoBase < 20000) {
            return true;
        }
        
        if (this instanceof PremiumPlan && this.intensidad == Intensidad.ALTA) {
            return true;
        }
        return false;
    }
    
}
