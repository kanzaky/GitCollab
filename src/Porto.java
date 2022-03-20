public class Porto {
    private int qntNavios;
    private int MaxNavios;
    private Navio[] navios;

    public Porto(int MaxNavios) {
        this.MaxNavios = MaxNavios;
        navios = new Navio[MaxNavios];
        qntNavios = 0;
    }

    public Navio[] getNavios() {
        return navios;
    }

    public int getMaxNavios() {
        return MaxNavios;
    }

    public void newNavio(Navio x){
        if(qntNavios == MaxNavios) {
            System.out.println("No máximo de navios " + MaxNavios + "");
            return;
        }
        boolean find = false;
        for(int i=0;i<qntNavios;i++){
            if(x.getRegistration().equals(navios[i].getRegistration())) {
                find = true;
                System.out.println("Matrcula existe: " + x.getRegistration());
            }
        }
        if (!find) {
            navios[qntNavios] = x;
            qntNavios++;
        }
    }

    public float getTotalCapacity(){
        float total = 0;
        for(int i=0; i<qntNavios; i++){
            if( navios[i] instanceof Petroleiro)
                total += ((Petroleiro) navios[i]).getCargo();
            if( navios[i] instanceof PortaContentores)
                total += ((PortaContentores) navios[i]).getXContentores() * 10;
        }
        return total;
    }
}
