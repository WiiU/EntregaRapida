package view;

import model.Motorista;
import model.TipoVan;

public class Main {

    public static void main(String[] args) {
        TipoVan tpv1 = new TipoVan();
        Motorista mt1 = new Motorista();
        tpv1.setCodVeic(1);
        System.out.println(tpv1.getCodVeic());
        tpv1.setMarcaVeic("van1");
        System.out.println(tpv1.getMarcaVeic());
        tpv1.setMotoristaVeic(mt1);
    }
    
}
