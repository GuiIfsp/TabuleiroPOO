package javaapplication1;

public class Peca {
    private Borda cima;
    private Borda baixo;
    private Borda dir;
    private Borda esq;
    
    public Peca pecaCima;
    public Peca pecaBaixo;
    public Peca pecaDir;
    public Peca pecaEsq;
    
    public Peca(Borda cima, Borda baixo, Borda dir, Borda esq){
        this.cima = cima;
        this.baixo = baixo;
        this.dir = dir;
        this.esq = esq;
    }
    
    public Borda getCima(){
        return cima;
    }
    public Borda getBaixo(){
        return baixo;
    }
    public Borda getDir(){
        return dir;
    }
    public Borda getEsq(){
        return esq;
    }
}
