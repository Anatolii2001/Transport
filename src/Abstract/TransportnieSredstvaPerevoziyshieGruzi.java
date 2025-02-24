package Abstract;

import Interface.PerevozchikGruza;

import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        TransportnieSredstvaPerevoziyshieGruzi that = (TransportnieSredstvaPerevoziyshieGruzi) obj;
        return Objects.equals(tekushiyPerevozchik, that.tekushiyPerevozchik);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tekushiyPerevozchik);
    }
}
