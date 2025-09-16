import java.util.ArrayList;

public class Sucursal {
    private double alquilerMensual;
    private ArrayList<Calzado> calzados;

    public Sucursal(double alquilerMensual) {
        this.alquilerMensual = alquilerMensual;
        this.calzados = new ArrayList<>();
    }

    public void agregarCalzado(Calzado c) {
        calzados.add(c);
    }

    public double getCapital() {
        double total = 0;
        for (Calzado c : calzados) {
            total += c.getPrecioVenta();
        }
        return total - alquilerMensual;
    }

    public boolean esRefinada() {
        for (Calzado c : calzados) {
            if (c.getPrecioBase() < 15000) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Calzado> getCalzados() {
        return calzados;
    }
}

