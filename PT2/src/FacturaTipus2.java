/**
 * @author Andrei
 *Aquest es el tipus 2 de factura, que te un 75% de descompte en sanejament i un 50% de descompte en residuals.
 */
public class FacturaTipus2 extends Factura {
    private double dSanejament = 0.75;
    private double dResiduals = 0.5;

    /**Metode constructor
     * @param consum
     * @param sanejament
     * @param residuals
     */
    public FacturaTipus2(double consum, double sanejament, double residuals) {
        super(consum, sanejament, residuals);
    }

    /**
     *Metode abstracte heretat.
     */
    @Override
    public void mostraFactura() {
        System.out.println("DETALL FACTURA");
        System.out.println("\n \n Consum: " + consum + " Sanejament: " + (sanejament - (sanejament * dSanejament)) + " Residuals: " + (residuals - (residuals * dResiduals)));
        //COMPROVAR SI ALGUN DELS 2 DESCOMPTES SUPERE 16€
        if ((sanejament * dSanejament) > 16 && (residuals * dResiduals) <= 16) {
            System.out.println("Descompte Aplicat a Sanejament: " + dSanejament * 100
                    + "% Descompte Aplicat a Residuals: " + dResiduals * 100 + "% TOTAL: "
                    + (consum + (sanejament - 16) + (residuals - (residuals * dResiduals))));
        } else if ((sanejament * dSanejament) <= 16 && (residuals * dResiduals) > 16) {
            System.out.println("Descompte Aplicat a Sanejament: " + dSanejament * 100
                    + "% Descompte Aplicat a Residuals: " + dResiduals * 100 + "% TOTAL: "
                    + (consum + (sanejament - (sanejament * dSanejament)) + (residuals - 16)));
        } else if ((sanejament * dSanejament) > 16 && (residuals * dResiduals) > 16) {
            System.out
                    .println("Descompte Aplicat a Sanejament: " + dSanejament * 100 + "% Descompte Aplicat a Residuals: "
                            + dResiduals * 100 + "% TOTAL: " + (consum + (sanejament - 16) + (residuals - 16)));
        } else {
            System.out.println("Descompte Aplicat a Sanejament: " + dSanejament * 100 + "% Descompte Aplicat a Residuals: "
                + dResiduals * 100 + "% TOTAL: "
                + (consum + (sanejament - (sanejament * dSanejament)) + (residuals - (residuals * dResiduals))));
        }

        System.out
                .println("NOTA: si l'import màxim de sanejament i residuals és superior a 16, s'ha comptabilitzat 16");
    }

}
