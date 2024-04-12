
public class Main {

    /**
     * método main donde introduciriamos los datos y visualizamos
     * @param args
     */
    public static void main(String[] args) {
        /**
         * atributo de tipo IComun
         */
    IComun transporte;

    transporte=FactoryT.getTransporte(FactoryT.BICICLETA);
    transporte.tipoEmbalaje(5f,5f,2f,15f);
        System.out.println(transporte.costeTotal(36308));

    transporte=FactoryT.getTransporte(FactoryT.CAMION);
    transporte.tipoEmbalaje(2f,2f,4f,50f);
        System.out.println(transporte.costeTotal(36300));
}
    }