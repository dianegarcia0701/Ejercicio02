package com.dianaclases;

public class operacionesBasicas {
    public static void operacionesBasicas() {
        System.out.println("operacionesBasicas");
        int cantidad1 = 8;
        int cantidad2 = 2;
        int suma = 0;
        int diferencia = 0;
        int producto = 0;
        int modulo = 0;
        int cociente = 0;




        System.out.println("Valor de numero: " + cantidad1);


        System.out.println("Nuevo valor:" + cantidad1);

        suma = cantidad1 + cantidad2;

        System.out.println("Resultado de la suma de :" + suma);
        System.out.println("Resultado de la suma de " + cantidad1 + "y" + cantidad2 + "es igual a:" + suma);

        diferencia = cantidad1 - cantidad2;
        System.out.println("Resultado de la resta de:" + cantidad1 + "y" +
                cantidad2 + "es igual a:" + diferencia);
        producto = cantidad1 * cantidad2;

        System.out.println("Resultado de la multiplicacion de" + cantidad1 + "y" + cantidad2 +
                "es igual a:" + producto);
        cociente = cantidad1 / cantidad2;
        System.out.println("El resultado de la division de :" + cantidad1 + "y" + cantidad2 + "es igual a:" + cociente);
        modulo  = cantidad1 % cantidad2;
        System.out.println("El resultado del residuo de"+ cantidad1+ "y"+ cantidad2 + "es igual a"+ modulo);





    }
}
