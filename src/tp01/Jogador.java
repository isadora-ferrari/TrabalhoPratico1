
package tp01;

//import java.util.ArrayList;


public class Jogador {
    
    private String nome;
    private int acerto1 = 0, acerto2 = 0;
    
    //ArrayList<Integer>infoTab = new ArrayList <>();
    int matriz[][] = new int [10][10];
   
    //set
    public Jogador (String nome){
        this.nome = nome;
    }
    //get
    public String getNome() {
        return nome;
    }
    
    
    public boolean addTesouro(int linha, int coluna){
        
        // TODO: adiciona um tesouro em uma posição válida e vazia do tabuleiro
        // Caso o tesouro tenha sido adicionado com sucesso, o método retorno true.
        //Caso contrário retorna false
        
        //se essas coordenadas na matriz estiverem com o valor 0 significa que a posição está vazia
        // e pode ser ocupada pelo tesouro, caso contrário terá que ser nformada outra posição
        if(matriz[linha][coluna]==0){
            matriz[linha][coluna]=1;
            return true;
        }else{
            System.out.println("Posicao invalida! Informe outra coordenada");
            return false;
        }
               
    }
    
    public boolean receberAtaque(int linha, int coluna){
        
        // TODO: verifica se na posição indicada há um tesouro.
        //Caso encontre o tesouro, retorna true. Caso contrario, 
        //retorna false
        
        if(matriz[linha][coluna]==1){
            return true;
            
        }else{
            return false;
        }
    }
    
    public boolean perdeu(){
        
        // TODO: verifica se todos os tesouros foram encontrados
        
        
        
        return false;
    }
    
    public void imprimirTabuleiro(){
        // TODO: imprime o status do tabuleiro do jogador
        // Quando uma célula do tabuleiro estiver vazia ela é preenchida com o 
        // caracter "-". Quando a célula possui um tesouro, ela é preenchida com 
        // um "T".
    }
    
    public boolean Vencedor(){
        if(acerto1 == 5){
            return true;
        }
        if(acerto2 == 5){
            return false;
        }
        return false;
    }
    
}
