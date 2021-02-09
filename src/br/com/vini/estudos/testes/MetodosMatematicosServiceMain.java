package br.com.vini.estudos.testes;

import br.com.vini.estudos.services.MetodosMatematicosServices;

public class MetodosMatematicosServiceMain {

    public static void main(String[] args) {

        System.out.println(MetodosMatematicosServices.getMenorValor(10.0,20.0));
        System.out.println(MetodosMatematicosServices.arredondaParaBaixo(10.5));
        System.out.println(MetodosMatematicosServices.arredondaParaCima(9.5));
        System.out.println(MetodosMatematicosServices.cossenoTrigometrico(5));
        System.out.println(MetodosMatematicosServices.exponencial(10));
        System.out.println(MetodosMatematicosServices.getMaiorValor(5,10));
        System.out.println(MetodosMatematicosServices.getPotencia(10,2));
        System.out.println(MetodosMatematicosServices.getValorAbsoluto(10.5));
        System.out.println(MetodosMatematicosServices.logaritmoNatural(10));
        System.out.println(MetodosMatematicosServices.raizQuadrada(9));
        System.out.println(MetodosMatematicosServices.tangenteTrigometrica(10));

    }
}
