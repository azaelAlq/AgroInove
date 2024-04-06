package AgroInnove;

import java.util.Scanner;

public class Main {

    public void main() {
        Scanner Leer = new Scanner(System.in);

        int Estado;
        int temporada;
        double pH;
        double Humedad;

        /*
        EJEMPLO
        int Estado = 5;
        int temporada = 2;
        double pH = 4;
        double Humedad = 65;
         */
        System.out.println("------------------AGROINNOVE------------------");
        System.out.println("¿Cuál es tu estado?(numero)");//se pone en numero porque lo haremos con combox
        Estado = Leer.nextInt();

        System.out.println("\n¿Cuál es la temporada actual?");//tambien lo ponemos en numero porque es un combox
        System.out.println("1. Primavera\n2. Verano\n3. Otoño\n4. Invierno");
        temporada = Leer.nextInt();

        System.out.println("\n¿Cuál es el pH del suelo?");
        pH = Leer.nextDouble();

        System.out.println("\n¿Cuál es la humedad en el suelo");
        Humedad = Leer.nextDouble();

        Datos datos = new Datos(Estado, temporada, pH, Humedad);

        
        Calidad calidad = new Calidad();

        calidad.CalidadRegion(datos);
        calidad.CalidadTemporada(datos);
        calidad.CalidadpH(datos);
        calidad.CalidadHumedad(datos);

        System.out.println("La calidad de tu cultivo es: " + calidad.Calidad());
        System.out.println("La calificacion de tu cultivo es de " + calidad.suma + "/11");
        if (calidad.CalidadRegion(datos) == 4) {
            System.out.println("TIENES LAS CONDICIONES PERFECTAS PARA COMENZAR A PLANTAR");
        }
        
        System.out.println("\nEstado: " + datos.estados[datos.getEstado()] + " \nTiene un puntaje de: " + calidad.CalidadRegion(datos) + "/4");
        System.out.println("\nTemporada: " + calidad.temp(datos) + " \nTiene un puntaje de: " + calidad.CalidadTemporada(datos) + "/2");
        System.out.println("\npH: " + datos.getpH() + " \nTiene un puntaje de: " + calidad.CalidadpH(datos) + "/3");
        System.out.println("\nHumedad: " + datos.getHumedad() + " \nTiene un puntaje de: " + calidad.CalidadHumedad(datos) + "/2");
        
        
    }
}
