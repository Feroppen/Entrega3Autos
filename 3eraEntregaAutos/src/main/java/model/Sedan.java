package model;

public class Sedan extends Automoviles {
    public int costoBasicoSedan;

    public Sedan(boolean techoCorredizo, boolean aireAcondicionado, boolean frenosABS, boolean airbag, boolean llantasAleacion, int costoBasicoSedan) {
        super(techoCorredizo, aireAcondicionado, frenosABS, airbag, llantasAleacion);
        this.costoBasicoSedan = 230000;
    }

    @Override
    public int calcularCostoTotal() {
        return super.calcularCostoTotal() + costoBasicoSedan;
    }
}
