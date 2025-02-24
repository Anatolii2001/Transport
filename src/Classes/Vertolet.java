package Classes;

import Abstract.TransportnieSredstvaPerevoziyshieGruzi;
import Interface.ImeetKolesa;
import Interface.ImeetVint;

import java.util.Objects;

public class Vertolet extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetKolesa, ImeetVint {
    private final int kolichestvoKoles;
    private final int kolichestvoVintov;

    public Vertolet(String model, String proizvoditel, int kolichestvoKoles, int kolichestvoVintov) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
        this.kolichestvoVintov = kolichestvoVintov;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель вертолета запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель вертолета остановлен.");
    }

    @Override
    public String toString() {
        return "Вертолет: [" + super.toString() + ", колеса: " + kolichestvoKoles + ", винт: " + kolichestvoVintov + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Vertolet vertolet = (Vertolet) obj;
        return kolichestvoKoles == vertolet.kolichestvoKoles && kolichestvoVintov == vertolet.kolichestvoVintov;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kolichestvoKoles, kolichestvoVintov);
    }
}
