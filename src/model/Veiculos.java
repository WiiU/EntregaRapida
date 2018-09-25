package model;

import java.util.Calendar;

public abstract class Veiculos {
   private int codVeic;
   private String marcaVeic;
   private String modeloVeic;
   private Calendar anoVeic;
   private String placaVeic;
   private Motorista motoristaVeic;

    public int getCodVeic() {
        return codVeic;
    }

    public void setCodVeic(int codVeic) {
        this.codVeic = codVeic;
    }

    public String getMarcaVeic() {
        return marcaVeic;
    }

    public void setMarcaVeic(String marcaVeic) {
        this.marcaVeic = marcaVeic;
    }

    public String getModeloVeic() {
        return modeloVeic;
    }

    public void setModeloVeic(String modeloVeic) {
        this.modeloVeic = modeloVeic;
    }

    public Calendar getAnoVeic() {
        return anoVeic;
    }

    public void setAnoVeic(Calendar anoVeic) {
        this.anoVeic = anoVeic;
    }

    public String getPlacaVeic() {
        return placaVeic;
    }

    public void setPlacaVeic(String placaVeic) {
        this.placaVeic = placaVeic;
    }

    public Motorista getMotoristaVeic() {
        return motoristaVeic;
    }

    public void setMotoristaVeic(Motorista motoristaVeic) {
        this.motoristaVeic = motoristaVeic;
    }
   
    
}
