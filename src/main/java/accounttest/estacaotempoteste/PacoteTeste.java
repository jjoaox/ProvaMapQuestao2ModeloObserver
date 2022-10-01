package accounttest.abc;

import accounttest.abc.Agencia1;
import accounttest.abc.Agencia2;
import accounttest.abc.Agencia3;

public class PacoteTeste {

    public static void main(String[] args) {
        Pacote pacote = new Pacote();
        
        Agencia1 agencia1 = new Agencia1(pacote);
        
        Agencia2 agencia2 = new Agencia2(pacote);

        Agencia3 agencia3 = new Agencia3(pacote);
        
        pacote.mudancaValor(120, 60);
        System.out.println("\n");
        pacote.mudancaValor(180, 90);
        System.out.println("\n");
        pacote.mudancaValor(200, 100);
        
        pacote.removerObserver(agencia2);
        System.out.println("------\n\n\n");
        
        pacote.mudancaValor(100, 50);
        System.out.println("\n");
        pacote.mudancaValor(60, 30);
        System.out.println("\n");
        pacote.mudancaValor(80, 40);

        pacote.removerObserver(agencia3);
        System.out.println("------\n\n\n");

    }
}
