package Classes;

import Abstract.TransportnieSredstvaPerevoziyshieGruzi;
import Interface.ImeetKolesa;
import Interface.ImeetVint;

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
}
