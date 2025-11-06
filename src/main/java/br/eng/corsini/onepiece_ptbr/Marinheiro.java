package br.eng.corsini.onepiece_ptbr;

public class Marinheiro extends Ser{
    private String patente;
    private int piratasDerrotados;
    private String habilidadeEspecial;
    private Embarcacao embarcacao;
    public Embarcacao getEmbarcacao() {
        return embarcacao;
    }
    public void setEmbarcacao(Embarcacao embarcacao) {
        this.embarcacao = embarcacao;
    }
    public String getPatente() {
        return patente;
    }
    public void setPatente(String patente) {
        this.patente = patente;
    }
    public int getPiratasDerrotados() {
        return piratasDerrotados;
    }
    public void setPiratasDerrotados(int piratasDerrotados) {
        this.piratasDerrotados = piratasDerrotados;
    }
    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }
    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

}
