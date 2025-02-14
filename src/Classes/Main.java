package Classes;

public class Main {
    public static void main(String[] args) {
    Samolet samolet = new Samolet("SuperJet100","Авиакомпания \"Гражданские самолеты Сухого\"",
            6,2,27.8);
    Vertolet vertolet = new Vertolet("Ми-8","ОАО \"Казанский вертолетный завод\"",5,
            1);
    Kater kater = new Kater("Princess 64","Princess Yachts",2);
    Tanker tanker = new Tanker("TI Asia","Hanjin Heavy Industries",1);
    Gruzovik gruzovik = new Gruzovik("Volvo FH16","Volvo",10);
    Taksi taksi = new Taksi("Toyota Camry","Toyota",4);

        System.out.println(samolet);
        samolet.startEngine();
        samolet.vigruzkaGruza();
        samolet.stopEngine();
        System.out.println();

        System.out.println(vertolet);
        vertolet.startEngine();
        vertolet.zagruzkaGruza("Медицинское оборудование");
        vertolet.vigruzkaGruza();
        vertolet.stopEngine();
        System.out.println();

        System.out.println(kater);
        kater.startEngine();
        kater.zagruzkaGruza("Морепродукты");
        kater.vigruzkaGruza();
        kater.stopEngine();
        System.out.println();

        System.out.println(tanker);
        tanker.startEngine();
        tanker.zagruzkaGruza("Нефть");
        tanker.vigruzkaGruza();
        tanker.stopEngine();
        System.out.println();

        System.out.println(gruzovik);
        gruzovik.startEngine();
        gruzovik.zagruzkaGruza("Цифровая техника");
        gruzovik.vigruzkaGruza();
        gruzovik.stopEngine();
        System.out.println();

        System.out.println(taksi);
        taksi.startEngine();
        taksi.stopEngine();
    }
}
