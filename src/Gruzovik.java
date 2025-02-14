public class Gruzovik extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetKolesa {
    private int kolichestvoKoles;

    public Gruzovik(String model, String proizvoditel, int kolichestvoKoles) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
    }

    @Override
    public int getKolichestvoKoles() {
        return kolichestvoKoles;
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
}
