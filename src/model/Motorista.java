
package model;

import java.util.Calendar;

public class Motorista {
    
    private int cnhMot; // codigo para identificar o motorista
    private String nmMot; // nome do motorista
    private Calendar dtNascMot; //data de nascimento do motorista
    private String enderecoMot; // endereço motorista
    private String tipoCnh; // tipo da cnh do motorista

    public int getCnhMot() {
        return cnhMot;
    }

    public void setCnhMot(int cnhMot) {
        this.cnhMot = cnhMot;
    }

    public String getNmMot() {
        return nmMot;
    }

    public void setNmMot(String nmMot) {
        this.nmMot = nmMot;
    }

    public Calendar getDtNascMot() {
        return dtNascMot;
    }

    public void setDtNascMot(Calendar dtNascMot) {
        this.dtNascMot = dtNascMot;
    }

    public String getEnderecoMot() {
        return enderecoMot;
    }

    public void setEnderecoMot(String enderecoMot) {
        this.enderecoMot = enderecoMot;
    }

    public String getTipoCnh() {
        return tipoCnh;
    }

    public void setTipoCnh(String tipoCnh) {
        this.tipoCnh = tipoCnh;
    }
    

}