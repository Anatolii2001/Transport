package Classes;

import Abstract.TransportnieSredstvaPerevoziyshieGruzi;
import Interface.ImeetKolesa;

import java.util.Objects;

public class Gruzovik extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetKolesa {
    private final int kolichestvoKoles;

    public Gruzovik(String model, String proizvoditel, int kolichestvoKoles) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель грузовика запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель грузовика остановлен.");
    }

    @Override
    public String toString() {
        return "Грузовик: [" + super.toString() + ", колеса: " + kolichestvoKoles + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Gruzovik gruzovik = (Gruzovik) obj;
        return kolichestvoKoles == gruzovik.kolichestvoKoles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kolichestvoKoles);
    }
}
