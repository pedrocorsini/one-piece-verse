package br.eng.corsini.onepiece_ptbr;

public class Pirata extends Ser{
    private float recompensa;
    private String navio;
    private Estado estado = new Comum();
    public void avaliar(){
        estado.transicao(this);
    }
    public float getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(float recompensa) {
        this.recompensa = recompensa;
    }
    public String getNavio() {
        return navio;
    }
    public void setNavio(String navio) {
        this.navio = navio;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
}
