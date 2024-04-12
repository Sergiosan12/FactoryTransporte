public interface IComun {

    /**
     * Tipos de embalaje
     */
    final static int PALET = 0;

    final static int ENV_CARTON = 1;

    final static int CAJA_MADERA = 2;

    /**
     *
     * @param cp Integer código postal
     * @return coste paquete
     */
    public Float costeTotal(Integer cp);

    /**
     *
     * @param x dimension x del paquete
     * @param y dimension y del paquete
     * @param z dimension z del paquete
     * @param peso del paquete
     * @return tipo de embalaje
     */
    public Integer tipoEmbalaje(Float x, Float y,Float z, Float peso);
}