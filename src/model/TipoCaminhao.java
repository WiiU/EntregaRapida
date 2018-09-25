package model;

public class TipoCaminhao extends Veiculos{
    
    private Objeto carga[]= new Objeto[2]; // valor fixo 3

    public Objeto[] getCarga() {
        return carga;
    }

    public void setCarga(Objeto[] carga) {
        this.carga = carga;
    }
    
}
