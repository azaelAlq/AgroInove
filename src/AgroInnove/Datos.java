package AgroInnove;

public class Datos {

    //arreglo con todos los estados
    //los estados estaran dados por numeros, es la posicion del arreglo
    String[] estados = {"Aguascalientes", "Baja California", "Baja California Sur", "Campeche", "Chiapas", "Chihuahua",
        "Coahuila", "Colima", "Ciudad de México", "Durango", "Guanajuato", "Guerrero", "Hidalgo",
        "Jalisco", "México", "Michoacán", "Morelos", "Nayarit", "Nuevo León", "Oaxaca", "Puebla",
        "Querétaro", "Quintana Roo", "San Luis Potosí", "Sinaloa", "Sonora", "Tabasco", "Tamaulipas",
        "Tlaxcala", "Veracruz", "Yucatán", "Zacatecas"};

    //Arreglo de los estados optimos primavera-verano(dado por la posicion de la combox)
    int[] estadosA = {0, 8, 9, 10, 11, 12, 13, 14, 15, 16, 19, 20, 21, 23, 28, 29, 31, 7, 17};
    ////Arreglo de los estados optimos Otoño-Invierno(dado por la posicion de la combox)
    int[] estadosB = {1, 2, 19};

    //los datos a recabar
    int Estado;
    int temporada;
    double pH;
    double Humedad;

    /*
    La temporada estara definida por un numero:
    1 = primavera
    2 = verano
    3 = otoño 
    4 = invierno
     */
    //costructor de los datos, esto es para obtener los datos
    public Datos(int Estado, int temporada, double pH, double Humedad) {
        this.pH = pH;
        this.Humedad = Humedad;
        this.Estado = Estado;
        this.temporada = temporada;
    }

    /*
    setters y getters, no se ocupan todos, pero si en un momento deseamos cambiar ciertos valores de los datos
    lo podriamos hacer bastante facil, solamente ocupamos los geters de manera activa
     */
    public double getpH() {
        return this.pH;
    }

    public void setpH(double pH) {
        this.pH = pH;
    }

    public double getHumedad() {
        return Humedad;
    }

    public void setHumedad(double Humedad) {
        this.Humedad = Humedad;
    }

    public int getEstado() {
        return Estado;
    }

    public void setEstado(int Estado) {
        this.Estado = Estado;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }
}
