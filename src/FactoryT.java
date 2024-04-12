public class FactoryT {
    /**
     * Tipo de transporte
     */
    public static final int CAMION = 0;
    public static final int BICICLETA = 1;

    /**
     *
     * @param opc opción para elegir el tipo de transporte
     * @return nueva instancia del transporte seleccionado
     */

    public static IComun getTransporte(Integer opc){
        switch(opc){
            case CAMION:
                return new Camion();
            case BICICLETA:
                return new Bicicleta();
            default:
                return null;
        }
    }
}
