public class Camion implements IComun{

    /**
     * constructor
     */
    public Camion(){
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
        }else return 50f;
    }

    /**
     *
     * @param x dimensión x del paquete
     * @param y dimension y del paquete
     * @param z dimension z del paquete
     * @param peso del paquete
     * @return tipo de embalaje
     */
    @Override
    public Integer tipoEmbalaje(Float x, Float y,Float z, Float peso) {
        float dimensiones=x*y*z;
        if(peso<=10&&dimensiones<=100){
            return ENV_CARTON;

        }else if(peso>10&&peso<40&&dimensiones>100&&dimensiones<300){
            return CAJA_MADERA;

         }else return PALET;
}
}