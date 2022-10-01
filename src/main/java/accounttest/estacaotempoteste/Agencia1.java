package accounttest.abc;

import accounttest.abc.Pacote;

public class Agencia1 implements Observer, DisplayElemento {
    private float tarifaAdulto;
    private float tarifaInfantil;
    private Pacote pacote;
    
    public Agencia1(Pacote pacote){
        this.pacote = pacote;
        pacote.registrarObserver(this); 
    }
    
    public void update(float tarifaAdulto, float tarifaInfantil){
        this.tarifaAdulto=tarifaAdulto;
        this.tarifaInfantil=tarifaInfantil;
        display();
    }
    
    public void display(){
        System.out.println("Valores:");
        System.out.println("Tarifa Adulto: R$"+tarifaAdulto);
        System.out.println("Tarifa Infantil: R$"+tarifaInfantil);         
    }
            
}
