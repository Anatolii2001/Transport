package Classes;

import Abstract.TransportnoeSredstvo;
import Interface.ImeetKolesa;

import java.util.Objects;

public class Taksi extends TransportnoeSredstvo implements ImeetKolesa {
    private final int kolichestvoKoles;

    public Taksi(String model, String proizvoditel, int kolichestvoKoles) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель такси запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель такси остановлен.");
    }

    @Override
    public String toString() {
        return "Такси: [" + super.toString() + ", колеса: " + kolichestvoKoles + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Taksi taksi = (Taksi) obj;
        return kolichestvoKoles == taksi.kolichestvoKoles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kolichestvoKoles);
    }
}
