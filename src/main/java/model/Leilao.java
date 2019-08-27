package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Leilao {
private String descricao;
private List<Lance> lances;


    public Leilao(String s) {
        this.descricao = descricao;
        this.lances = new ArrayList<Lance>();
    }


    public void propoe(Lance lance){
        lances.add(lance);
    }

    public List<Lance> getLances(){
        return Collections.unmodifiableList(lances);
    }
    
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    public void setLances(List<Lance> lances) {
        this.lances = lances;
    }
}
