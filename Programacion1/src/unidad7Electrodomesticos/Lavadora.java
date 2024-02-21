package unidad7Electrodomesticos;

public class Lavadora extends Electrodomestico {
    private double carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precioBase, double peso, double carga) {
        super(precioBase, peso);
        this.carga = carga;
    }

    public Lavadora(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public double calcularPrecioFinal() {
        double porcentajeCarga = carga > 8 ? 0.1 : 0;
        return precioBase * (1 + consumoEnergetico.getPorcentaje() + porcentajeCarga);
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                "} " + super.toString();
    }
}

