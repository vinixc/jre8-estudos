package br.com.vini.estudos.testes;

import java.security.SecureRandom;

public class CrapsMain {

    private static final SecureRandom ramdomNumbers = new SecureRandom();

    // tipo enum com constantes que representam o estado do jogo
    private enum Status {CONTINUE,WON,LOST};

    // constantes que representam lançamentos comuns dos dados
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // joga uma partida de craps
    public static void main(String[] args) {

        int myPoint = 0; //pontos se nao ganhar ou perder na 1° rolagem
        Status gameStatus; //pode conter CONTINUE, WON ou LOST

        int sumOfDice = rollDice(); //primeira rolagem dos dados

        switch (sumOfDice){
            case SEVEN: //ganha com 7 no primeiro lancamento
            case YO_LEVEN: //ganha com 11 no primeiro lancamento
                gameStatus = Status.WON;
                break;
            case SNAKE_EYES: //perde com 2 no primeiro lancamento
            case TREY: //perde com 3 no primeiro lancamento
            case BOX_CARS: //perde com 12 no primeiro lancamento
                gameStatus = Status.LOST;
                break;
            default: //nao ganho nem perdeu, portanto registra pontuacao
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();

            // determina o estado do jogo
            if(sumOfDice == myPoint)//vitoria por pontuacao
                gameStatus = Status.WON;
            else
                if(sumOfDice == SEVEN)//perde obtendo 7 antes de atingir a pontuacao
                    gameStatus  = Status.LOST;
        }

        // exibe uma mensagem ganhou ou perdeu
        if(gameStatus == Status.WON)
            System.out.println("Player wins!");
        else
            System.out.println("Player loses");
    }

    private static int rollDice() {

        int die1 = 1 + ramdomNumbers.nextInt(6); //primeiro lancamento do dado;
        int die2 = 1 + ramdomNumbers.nextInt(6); //segundo lancamento do dado;

        int sum = die1 + die2;

        System.out.printf("Player rolled %d + %d = %d%n", die1,die2, sum);
        return sum;
    }


}
