/**
 * @author Andrei
 *Aquest es el tipus de factura 1, que te un 25% de descompte en sanejament i residuals.
 */
public class FacturaTipus1 extends Factura {
    private double dSanejament = 0.25;
    private double dResiduals = 0.25;

    /**Metode constructor
     * 
     * @param consum
     * @param sanejament
     * @param residuals
     */
    public FacturaTipus1(double consum, double sanejament, double residuals) {
        super(consum, sanejament, residuals);
    }

    /**
     *Metode heretat
     */
    @Override
    public void mostraFactura() {
        System.out.println("DETALL FACTURA");
        System.out.println("Consum: " + consum + " Sanejament: " + (sanejament - (sanejament * dSanejament)) + " Residuals: " + (residuals - (residuals * dResiduals)));
        System.out.println("Descompte Aplicat a Sanejament: " + dSanejament * 100 + "% Descompte Aplicat a Residuals: "
                + dResiduals * 100 + "% TOTAL: "
                + (consum + (sanejament - (sanejament * dSanejament)) + (residuals - (residuals * dResiduals))));
    }
}
