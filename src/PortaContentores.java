/**
 * Classe PortaPetroleiro
 */
public class PortaContentores extends Navio{
    private int XContentores;
    public PortaContentores(String registration) {
        super(registration);
    }
    public int getXContentores() {
        return XContentores;
    }
    public void setXContentores(int XContentores) {
        this.XContentores = XContentores;
    }
}
