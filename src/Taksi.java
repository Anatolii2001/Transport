public class Taksi extends TransportnoeSredstvo implements ImeetKolesa {
    private int kolichestvoKoles;

    public Taksi(String model, String proizvoditel, int kolichestvoKoles) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
    }

    @Override
    public int getKolichestvoKoles() {
        return kolichestvoKoles;
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель такси запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель такси остановлен.");
    }

    public String toString() {
        return "Такси: [" + super.toString() + ", колеса: " + kolichestvoKoles + "]";
    }
}
