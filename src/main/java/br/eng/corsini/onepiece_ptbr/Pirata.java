package br.eng.corsini.onepiece_ptbr;

public class Pirata extends Ser{
    private double recompensa;
    private Embarcacao embarcacao;
    private String titulo;
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    private Estado estado = new Comum();
    public void avaliar(){
        estado.transicao(this);
    }
    public double getRecompensa() {
        return recompensa;
    }
    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
        avaliar();
    }
    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }
    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }
    public Estado getEstado() {
        return estado;
    }
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
