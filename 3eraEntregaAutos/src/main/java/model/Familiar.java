package model;

public class Familiar extends Automoviles {
    public int costoBasicoFamiliar;

    public Familiar(boolean techoCorredizo, boolean aireAcondicionado, boolean frenosABS, boolean airbag, boolean llantasAleacion, int costoBasicoFamiliar) {
        super(techoCorredizo, aireAcondicionado, frenosABS, airbag, llantasAleacion);
        this.costoBasicoFamiliar = 245000;
    }

    @Override
    public int calcularCostoTotal() {
        return super.calcularCostoTotal() + costoBasicoFamiliar;
    }
}