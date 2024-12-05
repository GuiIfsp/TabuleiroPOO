package javaapplication1;

/*A intenção da classe jogo é organizar/comparar as peças e fazer o processo acontecer
A ordem de entrada das peças na classe sera decidida pelo usuario e ela organizara o tabuleiro*/
public class Jogo {
    private Peca tabuleiro[] = new Peca[10];
    
    public Jogo(Peca peca1, Peca peca2, Peca peca3, Peca peca4, Peca peca5, Peca peca6, Peca peca7, Peca peca8, Peca peca9){
        tabuleiro[1] = peca1;
        tabuleiro[2] = peca2;
        tabuleiro[3] = peca3;
        tabuleiro[4] = peca4;
        tabuleiro[5] = peca5;
        tabuleiro[6] = peca6;
        tabuleiro[7] = peca7;
        tabuleiro[8] = peca8;
        tabuleiro[9] = peca9;
    }
    
    /*Função para verificar se as 4 bordas são cheias e invalidar a peça caso seja verdade*/
    public void invalidarPecas(){
        int i, invalido = 0;
        Borda aux;
        
        for(i = 0; i < 9; i++){
            aux = tabuleiro[i+1].getCima();
            if(aux.getBorda1() == true && aux.getBorda2() == true){
                invalido += 1;
            }
            
            aux = tabuleiro[i+1].getBaixo();
            if(aux.getBorda1() == true && aux.getBorda2() == true){
                invalido += 1;
            }
            
            aux = tabuleiro[i+1].getDir();
            if(aux.getBorda1() == true && aux.getBorda2() == true){
                invalido += 1;
            }
            
            aux = tabuleiro[i+1].getEsq();
            if(aux.getBorda1() == true && aux.getBorda2() == true){
                invalido += 1;
            }
            
            if(invalido == 4){
                tabuleiro[i+1] = null;
                System.out.println("A peca " + (i+1) + " e invalida por ter 4 bordas cheias");
            }
            
            invalido = 0;
        }
    }
    
    /*O compBordas verifica se os lados que estao sendo comparador 
    no compPecas são compativeis*/
    public boolean compBordas(Borda bordaA, Borda bordaB, int relacao){
        if(bordaA.getBorda1() == true && bordaB.getBorda1() == true){
            return false;
        }
        else if(bordaA.getBorda2() == true && bordaB.getBorda2() == true){
            return false;
        }
        return true;
    }
    
    
    /*O compPecas acha qual o lado deve ser comparado e caso 
    nenhum possa ser ele retorna falso e exclui a peca B do tabuleiro*/
    public boolean compPecas(Peca pecaA, Peca pecaB){
        if(pecaA.pecaCima == null && pecaB.pecaBaixo == null){
            if(compBordas(pecaA.getCima(), pecaB.getBaixo(), 1) == true){
                pecaA.pecaCima = pecaB;
                pecaB.pecaBaixo = pecaA;
                return true;
            }
        }
        if(pecaA.pecaBaixo == null && pecaB.pecaCima == null){
            if(compBordas(pecaA.getBaixo(), pecaB.getCima(), 2) == true){
                pecaA.pecaBaixo = pecaB;
                pecaB.pecaCima = pecaA;
                return true;
            }
        }
        if(pecaA.pecaEsq == null && pecaB.pecaDir == null){
            if(compBordas(pecaA.getEsq(), pecaB.getDir(), 3) == true){
                pecaA.pecaEsq = pecaB;
                pecaB.pecaDir = pecaA;
                return true;
            }
        }
        if(pecaA.pecaDir == null && pecaB.pecaEsq == null){
            if(compBordas(pecaA.getDir(), pecaB.getEsq(), 4) == true){
                pecaA.pecaDir = pecaB;
                pecaB.pecaEsq = pecaA;
                return true;
            }
        }
        
        return false;
    }
    
    public void resolverTabuleiro(){
        boolean inicio = false;
        int i = 1;
        
        invalidarPecas();
        
        do{
            if(tabuleiro[i] != null){
                inicio = true;
                System.out.println("O jogo comeca com a peca " + i + " no tabuleiro");
            }
            
            i++;
        }while(inicio = false);
        
        /*Não consegui implementar mais doq isso*/
    }
}
