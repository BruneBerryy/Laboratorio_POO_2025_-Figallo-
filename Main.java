public class Main {
    public static void main(String[] args) {
        
        Plan b1 = new BasicPlan("B001", Intensidad.MEDIA, 15000);
        Plan p1 = new PremiumPlan("P001", Intensidad.ALTA, 25000);
        Plan p2 = new PremiumPlan("P002", Intensidad.MEDIA, 30000);
        Plan c1 = new PersonalizedPlan("C001", Intensidad.BAJA, 18000, true);
        Plan c2 = new PersonalizedPlan("C002", Intensidad.MEDIA, 22000, false);

        Gimnasio g1 = new Gimnasio("PowerFit", 50000);
        g1.agregarPlan(b1);
        g1.agregarPlan(p1);
        g1.agregarPlan(c1);

        Gimnasio g2 = new Gimnasio("EliteClub", 10000);
        g2.agregarPlan(p2);
        g2.agregarPlan(c2);

        System.out.println("----- LISTA DE PLANES -----");
        mostrarPlan(b1);
        mostrarPlan(p1);
        mostrarPlan(p2);
        mostrarPlan(c1);
        mostrarPlan(c2);

        System.out.println("\n----- GIMNASIOS -----");
        System.out.println(g1.getNombre() + " -> capital neto: $" + g1.calcularCapitalNeto() + " | elite? " + g1.esElite());
        System.out.println(g2.getNombre() + " -> capital neto: $" + g2.calcularCapitalNeto() + " | elite? " + g2.esElite());
    }

    private static void mostrarPlan(Plan p) {
        System.out.println("Plan " + p.getCodigo()
                + " (" + p.getClass().getSimpleName() + ")"
                + " | intensidad: " + p.getIntensidad()
                + " | base $" + p.getCostoBase()
                + " | final $" + p.getCosto()
                + " | promo? " + (p.esPromocion() ? "sí" : "no"));
    }
}
