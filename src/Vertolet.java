public class Vertolet extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetKolesa, ImeetVint {
    private int kolichestvoKoles;
    private int kolichestvoVintov;

    public Vertolet(String model, String proizvoditel, int kolichestvoKoles, int kolichestvoVintov) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
        this.kolichestvoVintov = kolichestvoVintov;
    }

    @Override
    public int getKolichestvoKoles() {
        return kolichestvoKoles;
    }

    @Override
    public int getKolichestvoVintov() {
        return kolichestvoVintov;
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
