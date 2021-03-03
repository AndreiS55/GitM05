/**
 * @author Andrei
 *Aquesta es una practica que vam fer a programacio.
 */
public abstract class Factura {
    double consum;
    double sanejament;
    double residuals;
    double dSanejament;
    double dResiduals;

    /**
     * Metode constructor de la factura
     * @param consum
     * @param sanejament
     * @param residuals
     */
    public  Factura(double consum, double sanejament, double residuals) {
        this.consum = consum;
        this.sanejament = sanejament;
        this.residuals = residuals;

    }

    ////////////////// SETTERS ////////////////////////
    /**
     * Setter de consum
     * @param consum
     */
    public void setConsum(double consum) {
        this.consum = consum;
    }

    /**
     * Setter de sanejament
     * @param sanejament
     */
    public void setSanejament(double sanejament) {
        this.sanejament = sanejament;
    }

    /**
     * Setter de residuals
     * @param residuals
     */
    public void setResiduals(double residuals) {
        this.residuals = residuals;
    }

    public static int num(){
        return 1;
    }
    ////////////////    METODES ABSTRACTES    //////////////////
    /**
     * Metode abstracte per mostrar factura
     */
    public abstract void mostraFactura();

}