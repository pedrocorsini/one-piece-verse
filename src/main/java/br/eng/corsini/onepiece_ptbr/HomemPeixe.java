package br.eng.corsini.onepiece_ptbr;

public class HomemPeixe extends Ser{
    private String tipo;
    private float velocidadeAgua;
    public void dobrarVelocidade(HomemPeixe peixe){
        if(peixe.getAltura() > 2.0f)
            peixe.setVelocidadeAgua(peixe.getVelocidadeAgua() * 2);
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public float getVelocidadeAgua() {
        return velocidadeAgua;
    }
    public void setVelocidadeAgua(float velocidadeAgua) {
        this.velocidadeAgua = velocidadeAgua;
    }
    
}
