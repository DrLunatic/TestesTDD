package service;

import model.Lance;
import model.Leilao;

public class Avaliador {
    double maiorDeTodos = Double.NEGATIVE_INFINITY;
    double menorDeTodos = Double.NEGATIVE_INFINITY;
    public void avalia(Leilao leilao){
        for(Lance lance : leilao.getLances()){

            if(lance.getValor() > maiorDeTodos) maiorDeTodos = lance.getValor();
            if(lance.getValor() < menorDeTodos) menorDeTodos = lance.getValor();
        }
    }

    public double getMaiorLance() {
        return maiorDeTodos;
    }
    public double getMenorLance(){return menorDeTodos; }
}
