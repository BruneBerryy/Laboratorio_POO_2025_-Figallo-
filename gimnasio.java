import java.util.ArrayList;
import java.util.List;

public class gimnasio {
    private String nombre;
    private double costoFijoMensual;
    private List<Plan> planes;

    public gimnasio(String nombre, double costoFijoMensual) {
        this.nombre = nombre;
        this.costoFijoMensual = costoFijoMensual;
        this.planes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoFijoMensual() {
        return costoFijoMensual;
    }

    public List<Plan> getPlanes() {
        return planes;
    }

    public void agregarPlan(Plan plan) {
        if (plan != null) {
            planes.add(plan);
        }
    }

    
    public double calcularCapitalNeto() {
        double totalPlanes = 0.0;
        for (Plan p : planes) {
            totalPlanes += p.getCosto(); // polimorfismo: llama al getCosto() de la subclase concreta
        }
        return totalPlanes - costoFijoMensual;
    }

    
    public boolean esElite() {
        for (Plan p : planes) {
            if (p.esPromocion()) {
                return false;
            }
        }
        return true;
    }
    
}
