package Classes;

import Abstract.TransportnieSredstvaPerevoziyshieGruzi;
import Interface.ImeetVint;

import java.util.Objects;

public class Kater extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetVint {
    private final int kolichestvoVintov;

    public Kater(String model, String proizvoditel, int kolichestvoVintov) {
        super(model, proizvoditel);
        this.kolichestvoVintov = kolichestvoVintov;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель катера запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель катера остановлен.");
    }

    @Override
    public String toString() {
        return "Катер: [" + super.toString() + ", винт: " + kolichestvoVintov + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Kater kater = (Kater) obj;
        return kolichestvoVintov == kater.kolichestvoVintov;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kolichestvoVintov);
    }
}
