package model;

public class TipoCarreta {
    
    private Objeto carga[]= new Objeto[9];

    public Objeto[] getCarga() {
        return carga;
    }

    public void setCarga(Objeto[] carga) {
        this.carga = carga;
    }
    
}
