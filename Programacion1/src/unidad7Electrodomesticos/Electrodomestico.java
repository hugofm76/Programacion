package unidad7Electrodomesticos;

public abstract class Electrodomestico {
    protected double precioBase;
    protected Color color;
    protected ConsumoEnergetico consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
        this.precioBase = 100;
        this.color = Color.BLANCO;
        this.consumoEnergetico = ConsumoEnergetico.F;
        this.peso = 5;
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.color = Color.BLANCO;
        this.consumoEnergetico = ConsumoEnergetico.F;
        this.peso = peso;
    }

    public Electrodomestico(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract double calcularPrecioFinal();

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
    
    public enum Color {
        BLANCO, NEGRO, ROJO, AZUL, GRIS
    }
    public enum ConsumoEnergetico {
        A(0.3), B(0.25), C(0.2), D(0.15), E(0.1), F(0.05);

        private final double porcentaje;

        ConsumoEnergetico(double porcentaje) {
            this.porcentaje = porcentaje;
        }

        public double getPorcentaje() {
            return porcentaje;
        }
    }
}

