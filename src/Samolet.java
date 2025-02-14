public class Samolet extends TransportnieSredstvaPerevoziyshieGruzi implements ImeetKolesa, ImeetVint, ImeetKrilya {
    private int kolichestvoKoles;
    private int kolichestvoVintov;
    private double razmahKrilev;

    public Samolet(String model, String proizvoditel, int kolichestvoKoles, int kolichestvoVintov, double razmahKrilev) {
        super(model, proizvoditel);
        this.kolichestvoKoles = kolichestvoKoles;
        this.kolichestvoVintov = kolichestvoVintov;
        this.razmahKrilev = razmahKrilev;
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
    public double getRazmahKrilev() {
        return razmahKrilev;
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
}
