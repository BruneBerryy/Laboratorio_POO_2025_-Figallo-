public class Main {
    public static void main(String[] args) {
        
        Empresa miEmpresa = new Empresa();

        Sucursal sucursal1 = new Sucursal(50000);
        Sucursal sucursal2 = new Sucursal(30000);

        sucursal1.agregarCalzado(new Sandalia(1, 38, 12000));
        sucursal1.agregarCalzado(new Taco(2, 37, 20000, true, true));
        sucursal1.agregarCalzado(new Borcego(3, 41, 18000));

        sucursal2.agregarCalzado(new Taco(4, 36, 15000, false, false));
        sucursal2.agregarCalzado(new Sandalia(5, 39, 14000));

        miEmpresa.agregarSucursal(sucursal1);
        miEmpresa.agregarSucursal(sucursal2);

        System.out.println("💰 Capital total de la empresa: $" + miEmpresa.getCapitalTotal());
        System.out.println("🧦 Calzados en liquidación: " + miEmpresa.getCalzadosEnLiquidacion().size());
        System.out.println("🏪 Locales refinados: " + miEmpresa.getLocalesRefinados());

        System.out.println("\nCalzados en liquidación:");
        for (Calzado c : miEmpresa.getCalzadosEnLiquidacion()) {
            System.out.println(" - " + c.getClass().getSimpleName() +
                " (ID: " + c.getId() +
                ", Talle: " + c.getTalle() +
                ", Precio Base: $" + c.getPrecioBase() + ")");
        }
    }
}
