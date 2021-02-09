package br.com.vini.estudos.testes;

import br.com.vini.estudos.services.MetodosMatematicosServices;

import java.util.Scanner;

public class MaximunFinder {

    public static void main(String[] args) {

        try(Scanner input = new Scanner(System.in)){

            System.out.println("Enter three floating-point values separated by spaces: ");
            double number1 = input.nextDouble();
            double number2 = input.nextDouble();
            double number3 = input.nextDouble();

            double result = MetodosMatematicosServices.getMaiorValor(number1,number2,number3);

            System.out.println("Maximum is: " + result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
