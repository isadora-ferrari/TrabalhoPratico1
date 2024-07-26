/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01;

/**
 *
 * @author suelenmapa
 */
public class Jogador {
    
    private String nome;
    
    
    
    public Jogador (String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    public boolean addTesouro(int linha, int coluna){
        
        // TODO: adiciona um tesouro em uma posição válida e vazia do tabuleiro
        // Caso o tesouro tenha sido adicionado com sucesso, o método retorno true.
        //Caso contrário retorna false
        
        return false;
        
    }
    
    public boolean receberAtaque(int linha, int coluna){
        
        // TODO: verifica se na posição indicada há um tesouro.
        //Caso encontre o tesouro, retorna true. Caso contrario, 
        //retorna false
        
        return false;
        
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
    
    
}
