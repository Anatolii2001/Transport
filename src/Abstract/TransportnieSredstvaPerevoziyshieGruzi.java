package Abstract;

import Interface.PerevozchikGruza;

public abstract class TransportnieSredstvaPerevoziyshieGruzi extends TransportnoeSredstvo implements PerevozchikGruza {
    private String tekushiyPerevozchik;

    protected TransportnieSredstvaPerevoziyshieGruzi(String model, String proizvoditel) {
        super(model, proizvoditel);
        this.tekushiyPerevozchik = null;
    }

    @Override
    public void zagruzkaGruza(String gruz) {
        this.tekushiyPerevozchik = gruz;
        System.out.println("Загруженный груз: " + gruz);
    }

    @Override
    public void vigruzkaGruza() {
        if(tekushiyPerevozchik != null) {
            System.out.println("Выгруженный груз: " + tekushiyPerevozchik);
            tekushiyPerevozchik = null;
        } else {
            System.out.println("Нет груза для загрузки.");
        }
    }

}
