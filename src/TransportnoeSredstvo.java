abstract class TransportnoeSredstvo {
    private String model;
    private String proizvoditel;

    public TransportnoeSredstvo(String model, String proizvoditel) {
        this.model = model;
        this.proizvoditel = proizvoditel;
    }

    public String getModel() {
        return model;
    }

    public String getProizvoditel() {
        return proizvoditel;
    }

    public abstract void startEngine();
    public abstract void stopEngine();

    @Override
    public String toString() {
        return "Модель: " + model + ", Производитель: " + proizvoditel;
    }
}
