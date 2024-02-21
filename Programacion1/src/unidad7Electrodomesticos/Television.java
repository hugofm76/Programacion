package unidad7Electrodomesticos;

public class Television extends Electrodomestico {
    private double pulgadas;
    private String sintonizador;

    public Television() {
        super();
        this.pulgadas = 20;
        this.sintonizador = "DVB-T";
    }

    public Television(double precioBase, double peso, double pulgadas, String sintonizador) {
        super(precioBase, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Television(double precioBase, Color color, ConsumoEnergetico consumoEnergetico, double peso, double pulgadas, String sintonizador) {
        super(precioBase, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(String sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * (1 + consumoEnergetico.getPorcentaje() + (peso >= 80 ? 0.2 : (peso >= 50 ? 0.15 : (peso >= 20 ? 0.1 : 0))));
    }

    @Override
    public String toString() {
        return "Television{" +
                "pulgadas=" + pulgadas +
                ", sintonizador='" + sintonizador + '\'' +
                "} " + super.toString();
    }
}
