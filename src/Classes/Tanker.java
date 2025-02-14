package Classes;

public class Tanker extends Kater {
    public Tanker(String model, String proizvoditel, int kolichestvoVintov) {
        super(model, proizvoditel, kolichestvoVintov);
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатель танкера запущен.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Двигатель танкера остановлен.");
    }

    @Override
    public String toString() {
        return "Танкер: [" + super.toString() + "]";
    }
}
