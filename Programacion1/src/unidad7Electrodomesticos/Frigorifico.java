package unidad7Electrodomesticos;

public class Frigorifico extends Electrodomestico {
    private boolean noFrost;

    public Frigorifico() {
        super();
        this.noFrost = false;
    }

    public Frigorifico(double precioBase, double peso, boolean noFrost) {
        super(precioBase, peso);
        this.noFrost = noFrost;
    }

    public Frigorifico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, boolean noFrost) {
        super(precioBase, color, consumoEnergetico, peso);
        this.noFrost = noFrost;
    }

    public boolean isNoFrost() {
        return noFrost;
    }

    public void setNoFrost(boolean noFrost) {
        this.noFrost = noFrost;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * (1 + consumoEnergetico.getPorcentaje() + (peso >= 80 ? 0.2 : (peso >= 50 ? 0.15 : (peso >= 20 ? 0.1 : 0))));
    }

    @Override
    public String toString() {
        return "Frigorifico{" +
                "noFrost=" + noFrost +
                "} " + super.toString();
    }
}

