/**
 * @author joaqu
 * Classe Main
 */
public class Main {

    /**
     * @param args
     * Classe Main
     */
    public static void main(String[] args) {
        Porto porto = new Porto(2);

        Petroleiro petro1 = new Petroleiro("X89HB"); petro1.setCargo(250);
        PortaContentores pConta1 = new PortaContentores("P9H78"); pConta1.setXContentores(100);
        Navio n = new Navio("H88Jk");

        porto.newNavio(petro1);
        porto.newNavio(pConta1);
        porto.newNavio(n);

        System.out.println("Capacidade total = " + porto.getTotalCapacity() + " toneladas.");
    }
}
