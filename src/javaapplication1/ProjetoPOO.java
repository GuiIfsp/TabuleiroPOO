package javaapplication1;

public class ProjetoPOO {
    public static void main(String[] args) {
        Borda bordaCheia = new Borda(true, true);
        Borda borda10 = new Borda(true, false);
        Borda borda01 = new Borda(false, true);
             
        /*Design é o msm do apresentado na prova*/
        
        Peca peca1 = new Peca(bordaCheia, borda10, borda10, bordaCheia);
        Peca peca2 = new Peca(bordaCheia, borda10, borda10, borda01);
        Peca peca3 = new Peca(bordaCheia, borda01, bordaCheia, borda01);
        Peca peca4 = new Peca(borda01, borda10, borda10, bordaCheia);
        Peca peca5 = new Peca(borda01, borda01, borda10, borda01);
        Peca peca6 = new Peca(borda10, borda01, bordaCheia, borda01);
        Peca peca7 = new Peca(borda01, bordaCheia, borda10, bordaCheia);
        Peca peca8 = new Peca(borda10, bordaCheia, borda01, borda01);
        Peca peca9 = new Peca(borda10, bordaCheia, bordaCheia, borda10);
        
        
        /*As peças teram o nome de 1 a 9, 
        baseado na ordem que elas são mandadas na criação da classe jogo*/
        
        Jogo jogo = new Jogo(peca1, peca2, peca3, peca4, peca5, peca6, peca7, peca8, peca9);
        
        jogo.resolverTabuleiro();
    }
}
