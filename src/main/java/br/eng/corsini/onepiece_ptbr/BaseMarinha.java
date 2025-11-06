package br.eng.corsini.onepiece_ptbr;

import java.util.ArrayList;
import java.util.List;

public class BaseMarinha {
    private String nome;
    private MarEnum localizacao;
    private boolean submersa;
    private List<Marinheiro> marinheiros = new ArrayList<Marinheiro>();
    private Marinheiro capitao;
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public MarEnum getLocalizacao() {
        return localizacao;
    }
    public void setLocalizacao(MarEnum localizacao) {
        this.localizacao = localizacao;
    }
    public boolean isSubmersa() {
        return submersa;
    }
    public void setSubmersa(boolean submersa) {
        this.submersa = submersa;
    }
    public List<Marinheiro> getMarinheiros() {
        return marinheiros;
    }
    public void setMarinheiros(List<Marinheiro> marinheiros) {
        this.marinheiros = marinheiros;
    }
    public Marinheiro getCapitao() {
        return capitao;
    }
    public void setCapitao(Marinheiro capitao) {
        this.capitao = capitao;
    }
    
}
