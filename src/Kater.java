public class Kater extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetVint {
    private int kolichestvoVintov;

    public Kater(String model, String proizvoditel, int kolichestvoVintov) {
        super(model, proizvoditel);
        this.kolichestvoVintov = kolichestvoVintov;
    }

    @Override
    public int getKolichestvoVintov() {
        return kolichestvoVintov;
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
}
