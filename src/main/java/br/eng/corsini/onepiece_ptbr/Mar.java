package br.eng.corsini.onepiece_ptbr;

public enum Mar {
    NORTHBLUE( "Mar do Norte"),
    WESTBLUE("Mar do Oeste"),
    EASTBLUE("Mar do Leste"),
    SOUTHBLUE("Mar do Sul");

    private final String nome;
    Mar(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
}