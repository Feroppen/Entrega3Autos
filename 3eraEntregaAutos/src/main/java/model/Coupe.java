package model;


public class Coupe extends Automoviles {
    public int costoBasicoCoupe;

    public Coupe(boolean techoCorredizo, boolean aireAcondicionado, boolean frenosABS, boolean airbag, boolean llantasAleacion, int costoBasicoCoupe) {
        super(techoCorredizo, aireAcondicionado, frenosABS, airbag, llantasAleacion);
        this.costoBasicoCoupe = 270000;
    }
    @Override
    public int calcularCostoTotal(){
        return super.calcularCostoTotal() + costoBasicoCoupe;
    }
}
