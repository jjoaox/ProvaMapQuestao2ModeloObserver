package accounttest.abc;

import java.util.ArrayList;
import java.util.List;

public class Pacote implements Subject{
   
    private List<Observer> observers;
    private float tarifaAdulto;
    private float tarifaInfantil;
    
    public Pacote(){
        observers = new ArrayList<Observer>();
    }
    
    public void registrarObserver(Observer o){
        observers.add(o); 
    }
    
    public void removerObserver(Observer o){
        observers.remove(o);
    }
    
    public void notificarObserver(){
        for(Observer itemobserver : observers){
            itemobserver.update(tarifaAdulto, tarifaInfantil);
        }
    }
    
    public void mudancaValor(float tarifaAdulto, float tarifaInfantil){
        this.tarifaAdulto=tarifaAdulto;
        this.tarifaInfantil=tarifaInfantil;
        notificarObserver();
    }
    
}
