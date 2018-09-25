 * and open the template in the editor.
package model;

import java.util.Calendar;

public class Objeto {
    
    private int codObj; // código rastreador do objeto
    private String nmRemetObj; // nome do remetente do objeto
    private String endRemetObj; // endereço do remetente
    private String nmDestObj; // nome do destinatário
    private String endDestObj; // endereço do destinatário
    private Calendar dtPostObj; // data do depósito do objeto
    private String pesoObj; // peso do objeto

    public int getCodObj() {
        return codObj;
    }

    public void setCodObj(int codObj) {
        this.codObj = codObj;
    }

    public String getNmRemetObj() {
        return nmRemetObj;
    }

    public void setNmRemetObj(String nmRemetObj) {
        this.nmRemetObj = nmRemetObj;
    }

    public String getEndRemetObj() {
        return endRemetObj;
    }

    public void setEndRemetObj(String endRemetObj) {
        this.endRemetObj = endRemetObj;
    }

    public String getNmDestObj() {
        return nmDestObj;
    }

    public void setNmDestObj(String nmDestObj) {
        this.nmDestObj = nmDestObj;
    }

    public String getEndDestObj() {
        return endDestObj;
    }

    public void setEndDestObj(String endDestObj) {
        this.endDestObj = endDestObj;
    }

    public Calendar getDtPostObj() {
        return dtPostObj;
    }

    public void setDtPostObj(Calendar dtPostObj) {
        this.dtPostObj = dtPostObj;
    }

    public String getPesoObj() {
        return pesoObj;
    }

    public void setPesoObj(String pesoObj) {
        this.pesoObj = pesoObj;
    }
    
    
    
}
