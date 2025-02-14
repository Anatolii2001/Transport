abstract class TransportnieSredstvaPerevoziyshieGruzi extends TransportnoeSredstvo implements PerevozchikGruza {
    private String tekushiyPervozchik;

    public TransportnieSredstvaPerevoziyshieGruzi(String model, String proizvoditel) {
        super(model, proizvoditel);
        this.tekushiyPervozchik = null;
    }

    @Override
    public void zagruzkaGruza(String gruz) {
        this.tekushiyPervozchik = gruz;
        System.out.println("Загруженный груз: " + gruz);
    }

    @Override
    public void vigruzkaGruza() {
        if(tekushiyPervozchik != null) {
            System.out.println("Выгруженный груз: " + tekushiyPervozchik);
            tekushiyPervozchik = null;
        } else {
            System.out.println("Нет груза для загрузки.");
        }
    }

    @Override
    public String getTekushiyGruz() {
        return tekushiyPervozchik;
    }
}
