public class Bicicleta implements IComun{

    /**
     * constructor
     */
    public Bicicleta(){
    }
    /**
     *
     * @param cp Integer codigo postal
     * @return coste en funcion del cp
     */

    @Override
    public Float costeTotal(Integer cp) {
        if (cp==36308){
            return 20f;
        }else return 40f;
    }

    /**
     *
     * @param x dimension eje x
     * @param y dimension eje y
     * @param z dimension eje z
     * @param peso del paquetee
     * @return tipo de embalaje
     */

    @Override
    public Integer tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        float dimensiones=x*y*z;
        if(peso<10&&dimensiones<100){
            return ENV_CARTON;

        }else return CAJA_MADERA;
    }
}
