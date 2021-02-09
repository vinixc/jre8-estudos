package br.com.vini.estudos.services;

public class MetodosMatematicosServices {

    public static double getValorAbsoluto(double x){
        return Math.abs(x);
    }

    public static double arredondaParaCima(double x){
        return Math.ceil(x);
    }

    public static double arredondaParaBaixo(double x){
        return Math.floor(x);
    }

    public static double cossenoTrigometrico(double x){
        return Math.cos(x);
    }

    public static double exponencial(double x){
        return Math.exp(x);
    }

    public static  double logaritmoNatural(double x){
        return  Math.log(x);
    }

    public static double getMaiorValor(double x, double y){
        return Math.max(x,y);
    }

    public static double getMenorValor(double x, double y){
        return Math.min(x,y);
    }

    public static double getPotencia(double numero, double expoente) {
        return Math.pow(numero,expoente);
    }

    public  static double raizQuadrada(double x){
        return Math.sqrt(x);
    }

    public  static  double tangenteTrigometrica(double x){
        return Math.tan(x);
    }

    public static double getMaiorValor(double x, double y, double z) {
        return Math.max(x,Math.max(y,z));
    }
}
