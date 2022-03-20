/**
 * Classe Petroleiro
 */
public class Petroleiro extends Navio{
    private float cargo;
    public Petroleiro(String registration) {
        super(registration);
    }
    public float getCargo() {
        return cargo;
    }
    public void setCargo(float cargo) {
        this.cargo = cargo;
    }
}
