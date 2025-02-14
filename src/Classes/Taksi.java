package Classes;

import Abstract.TransportnoeSredstvo;
import Interface.ImeetKolesa;

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
}
