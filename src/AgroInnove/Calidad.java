package AgroInnove;

public class Calidad {

    int suma = 0; //sera la calificacion del cultivo

    public void setSuma(int suma) {
        this.suma = suma;
    }
    boolean ED = false; //Estado Dentro de las zonas De buena produccion si es asi es true
    boolean EPV = false;
    boolean EOI = false;

    public void setED(boolean ED) {
        this.ED = ED;
    }

    public void setEPV(boolean EPV) {
        this.EPV = EPV;
    }

    public void setEOI(boolean EOI) {
        this.EOI = EOI;
    }

    /*
        La calidad estara determinada por un numero
        0 = Muy bueno
        1 = Bueno
        2 = Regular
        3 = Malo
     */
    public String Calidad() {
        
        int resultado = suma;

        if (resultado >= 9 && resultado <= 10) {
            return "Muy bueno";
        } else if (resultado >= 7 && resultado <= 8) {
            return "Bueno";
        } else if (resultado >= 4 && resultado <= 6) {
            return "Regular";
        } else if (resultado >= 0 && resultado <= 3) {
            return "Malo";
        } else if (resultado == 11) {
            return "EXCELENTE";
        } else {
            return "ERROR";
        }
    }

    //la region tendra un peso de 3
    public int CalidadRegion(Datos datos) {
        int puntos = 0;

        for (int i = 0; i < datos.estadosA.length; i++) {
            if (datos.getEstado() == datos.estadosA[i]) {
                EPV = true;
            }
        }

        for (int i = 0; i < datos.estadosB.length; i++) {
            if (datos.getEstado() == datos.estadosB[i]) {
                EOI = true;
            }
        }

        //si es alguno de los estados es optimo
        if (EOI || EPV) {
            ED = true;
            puntos = puntos + 2;
            suma = suma + 2;
        }

        //si se encuentra en el estado y es una temporada anterior a la que se va a plantar es
        // super rentable(exelente), la suma total puede ser 11, sino cumple solo sera 10
        if (datos.getTemporada() == 3 && EPV) {
            puntos = puntos + 2;
            suma = suma + 2;
        }
        if (datos.getTemporada() == 1 && EOI) {
            puntos = puntos + 2;
            suma = suma + 2;
        }

        return puntos;
    }

    //la temporada tendra un peso de 2
    public int CalidadTemporada(Datos datos) {
        int puntos = 0;
        /*
        como estamos prediciendo el futuro tenemos que tener encuenta el tiempo de 
        crecimiento de la fresa(1 temporada aprox)
        entonces eso lo tomamos encuenta
         */

        //ED determina si el estado es optimo
        if (ED && datos.getTemporada() == 0) {//aqui son las condiciones para los estados optimos
            puntos = puntos + 2;
            suma = suma + 2;
        } else if (ED && datos.getTemporada() == 1) {
            puntos = puntos + 2;
            suma = suma + 2;
        } else if (ED && datos.getTemporada() == 2) {
            puntos = puntos + 1;
            suma = suma + 2;
        } else if (ED && datos.getTemporada() == 3) {
            puntos = puntos + 2;
            suma = suma + 2;
        } else if (datos.getTemporada() == 0) { //aqui son las condiciones para los estados que no son optimos
            puntos = puntos + 1;
            suma = suma + 1;
        } else if (datos.getTemporada() == 1) {
            puntos = puntos + 1;
            suma = suma + 1;
        } else if (datos.getTemporada() == 2) {
            puntos = puntos + 0;
            suma = suma + 1;
        } else if (datos.getTemporada() == 3) {
            puntos = puntos + 1;
            suma = suma + 1;
        }
        return puntos;
    }

    //el pH tendra un peso de 3
    public int CalidadpH(Datos datos) {
        int puntos = 0;

        if (datos.getpH() >= 6 && datos.getpH() <= 7) {
            puntos = puntos + 3;
            suma = suma + 3;
        } else if (datos.getpH() >= 5.5 && datos.getpH() < 6) {
            puntos = puntos + 2;
            suma = suma + 2;
        } else if (datos.getpH() > 7 && datos.getpH() <= 7.5) {
            puntos = puntos + 1;
            suma = suma + 1;
        }
        return puntos;
    }

    //la humedad tendra un peso de 2
    public int CalidadHumedad(Datos datos) {
        int puntos = 0;
        if (datos.getHumedad() >= 67 && datos.getHumedad() <= 73) {
            puntos = puntos + 2;
            suma = suma + 2;
        } else if (datos.getHumedad() >= 62 && datos.getHumedad() < 67) {
            puntos = puntos + 1;
            suma = suma + 1;
        } else if (datos.getHumedad() > 73 && datos.getHumedad() <= 80) {
            puntos = puntos + 1;
            suma = suma + 1;
        }
        return puntos;
    }

    //solo es para saber la temporada, no hace falta ya que eso se sustituye en la interfaz
    public String temp(Datos datos) {
        if (datos.getTemporada() == 0) {
            return "Primavera";
        } else if (datos.getTemporada() == 1) {
            return "Verano";
        } else if (datos.getTemporada() == 2) {
            return "Otoño";
        } else if (datos.getTemporada() == 3) {
            return "Invierno";
        }
        return "no existe xd";
    }
}
