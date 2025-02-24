package Abstract;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TransportnoeSredstvo that = (TransportnoeSredstvo) obj;
        return Objects.equals(model, that.model) && Objects.equals(proizvoditel, that.proizvoditel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, proizvoditel);
    }
}
