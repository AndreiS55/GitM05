public class TestFactura {
    public static void main(String[] args) {
        FacturaNormal fN = new FacturaNormal(10.0, 20.0, 30.0);
        FacturaTipus1 f1 = new FacturaTipus1(10.0, 20.0, 30.0);
        FacturaTipus2 f2= new FacturaTipus2(10.0, 20.0, 30.0);
        f1.mostraFactura();
        f2.mostraFactura();
        System.out.println("-----------------------");
        Factura[] matriuFactures = {f1, f2};
        matriuFactures[0].mostraFactura();
        matriuFactures[1].mostraFactura();
    }
}
