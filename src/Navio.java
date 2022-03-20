/**
 * Classe Navio
 */
public class Navio {
    private String registration;
    private String name;
    private float size;

    public Navio(String matricula) {
        this.registration = matricula;
    }
    public String getRegistration() {
        return registration;
    }
    public String getName() {
        return name;
    }
    public float getComprimento() {
        return size;
    }
    public void setName(String nome) {
        this.name = nome;
    }
    public void setSize(float size) {
        this.size = size;
    }
}
