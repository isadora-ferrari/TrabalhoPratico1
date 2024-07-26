/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp01;

/**
 *
 * @author suelenmapa
 */
import java.util.Scanner;

public class Jogo {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Jogador jogador1 = criaJogador();
        Jogador jogador2 = criaJogador();
        
        boolean jogoTerminado = false;

        while (!jogoTerminado) {
            jogoTerminado = jogar(jogador1, jogador2);
            if (!jogoTerminado) {
                jogoTerminado = jogar(jogador2, jogador1);
            }
        }

        declaraVencedor(jogador1, jogador2);
    }

    private static Jogador criaJogador() {

        System.out.println("Qual o nome do jogador: ");
        String nome = scanner.nextLine();

        Jogador jogador = new Jogador(nome);
        int linha, coluna;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Digite a linha do Tesouro (" + i + "): ");
            linha = scanner.nextInt();
            System.out.println("Digite a coluna do Tesouro (" + i + "): ");
            coluna = scanner.nextInt();
            boolean adicionado = jogador.addTesouro(linha, coluna);

            if (!adicionado) {
                System.out.println("Posição Inválida!");
                i--;
            }

        }

        return jogador;

    }

    private static boolean jogar(Jogador jogadorAtual, Jogador oponente) {
        System.out.println(jogadorAtual.getNome() + ", é sua vez de jogar.");
        jogadorAtual.imprimirTabuleiro();

        System.out.print("Digite a linha da sua jogada: ");
        int linha = scanner.nextInt();
        System.out.print("Digite a coluna da sua jogada: ");
        int coluna = scanner.nextInt();

        boolean acertou = oponente.receberAtaque(linha, coluna);
        if (acertou) {
            System.out.println("Parabéns, você encontrou um tesouro!");
        } else {
            System.out.println("Que pena, não havia tesouro nessa posição.");
        }

        return verificaVencedor(oponente);
    }

    private static boolean verificaVencedor(Jogador oponente) {
        return oponente.perdeu();
    }

    private static void declaraVencedor(Jogador jogador1, Jogador jogador2) {
        if (jogador1.perdeu()) {
            System.out.println(jogador2.getNome() + " é o vencedor!");
        } else {
            System.out.println(jogador1.getNome() + " é o vencedor!");
        } 
    }
}

