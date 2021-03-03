	/**
	 * @author Andrei
	 *Aquesta es la factura normal.
	 */
	public class FacturaNormal extends Factura{
    /**
     * Aquest es el metode constructor
     * @param consum
     * @param sanejament
     * @param residuals
     */
    public FacturaNormal(double consum, double sanejament, double residuals){
        super(consum, sanejament, residuals);
    }

    /**
     *Aquest es el metode abstracte que hereta de la classe factura
     */
    @Override
    public void mostraFactura() {
        System.out.println("DETALL FACTURA");
        System.out.println("Consum: "+consum+" Sanejament: "+sanejament+" Residuals: "+residuals);
        System.out.println("Descompte Aplicat a Sanejament: 0.0 Descompte Aplicat a Residuals: 0.0 TOTAL: "+(consum+sanejament+residuals));
    }
}