import java.util.ArrayList;

public class Empresa {
    private ArrayList<Sucursal> sucursales;

    public Empresa() {
        this.sucursales = new ArrayList<>();
    }

    public void agregarSucursal(Sucursal s) {
        sucursales.add(s);
    }

    public double getCapitalTotal() {
        double total = 0;
        for (Sucursal s : sucursales) {
            total += s.getCapital();
        }
        return total;
    }

    public ArrayList<Calzado> getCalzadosEnLiquidacion() {
        ArrayList<Calzado> lista = new ArrayList<>();
        for (Sucursal s : sucursales) {
            for (Calzado c : s.getCalzados()) {
                if (c.esEnLiquidacion()) {
                    lista.add(c);
                }
            }
        }
        return lista;
    }

    public int getLocalesRefinados() {
        int count = 0;
        for (Sucursal s : sucursales) {
            if (s.esRefinada()) {
                count++;
            }
        }
        return count;
    }
}

