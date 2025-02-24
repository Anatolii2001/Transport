package Classes;

import Abstract.TransportnieSredstvaPerevoziyshieGruzi;
import Interface.ImeetKolesa;
import Interface.ImeetKrilya;
import Interface.ImeetVint;

import java.util.Objects;

public class Samolet extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetKolesa, ImeetVint, ImeetKrilya {
    private final int kolichestvoKoles;
    private final int kolichestvoVintov;
    private final double razmahKrilev;

    public Samolet(String model, String proizvoditel, int kolichestvoKoles, int kolichestvoVintov, double razmahKrilev) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
        this.kolichestvoVintov = kolichestvoVintov;
        this.razmahKrilev = razmahKrilev;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель самолета запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель самолета остановлен.");
    }

    @Override
    public String toString() {
        return "Самолет: [" + super.toString() + ", колеса: " + kolichestvoKoles + ", винт: " + kolichestvoVintov +
                ", крылья: " + razmahKrilev + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Samolet samolet = (Samolet) obj;
        return kolichestvoKoles == samolet.kolichestvoKoles && kolichestvoVintov == samolet.kolichestvoVintov && Double.compare(razmahKrilev, samolet.razmahKrilev) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kolichestvoKoles, kolichestvoVintov, razmahKrilev);
    }
}
