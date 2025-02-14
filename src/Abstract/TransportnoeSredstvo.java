package Abstract;

public abstract class TransportnoeSredstvo {
    private final String model;
    private final String proizvoditel;

    protected TransportnoeSredstvo(String model, String proizvoditel) {
        this.model = model;
        this.proizvoditel = proizvoditel;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    @Override
    public String toString() {
        return "Модель: " + model + ", Производитель: " + proizvoditel;
    }
}
