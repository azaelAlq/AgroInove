package AgroInnove;

public class Texto {

    public String Stexto(Calidad calidad, Datos datos) {
        String texto;

        texto = "La calidad de tu proximo cultivo sera" + calidad.Calidad();

        if (calidad.CalidadRegion(datos) == 4) {
            texto = texto + StrAlinear("<br>Es la mejor temporada para comenzar a cultivar", 40);
            texto = texto + StrAlinear("<br>El estado de " + datos.estados[datos.getEstado()] + CalEstado(calidad, datos) + ".", 50);
        }else{
            texto = texto + StrAlinear("<br>El estado de " + datos.estados[datos.getEstado()] + CalEstado(calidad, datos) + ".<br>", 50);
        }

        
        texto = texto + StrAlinear("<br>En " + calidad.temp(datos) + CalTemp(calidad, datos) + ".", 50);
        texto = texto + StrAlinear("<br><br>Tienes un pH de " + datos.getpH() + CalpH(calidad, datos) + ".", 50);
        texto = texto + StrAlinear("<br><br>El " + datos.getHumedad() + "% de humedad" + CalHumedad(calidad, datos) + ".", 50);

        return StrToHtml(texto);
    }
    public String calidad(Calidad calidad){
        if (calidad.Calidad().equals("EXCELENTE")) {
            return "excelente";
        }else if (calidad.Calidad().equals("Muy bueno")) {
            return "buena";
        }else if (calidad.Calidad().equals("Bueno")) {
            return "buena";
        }else if (calidad.Calidad().equals("Regular")) {
            return "buena";
        }else if (calidad.Calidad().equals("Malo")) {
            return "buena";
        }
        return"Hay algo mal";
    }
    public String StrToHtml(String texto) {
        return "<html><p>" + texto + "</p></html>";
    }

    public String StrAlinear(String cadena, int cont) {

        StringBuilder resultado = new StringBuilder();
        String[] palabras = cadena.split(" ");
        int contador = 0;

        for (String palabra : palabras) {
            if (palabra.contains("<br>")) {
                resultado.append(palabra).append(" ");
                contador = 0;  // Reiniciar el contador en caso de salto de línea
            } else {
                resultado.append(palabra).append(" ");
                contador += palabra.length() + 1; // Se suma 1 para contar el espacio después de cada palabra

                if (contador >= cont) {
                    resultado.append("<br>");
                    contador = 0;
                }
            }
        }

        return resultado.toString();
    }

    public String CalEstado(Calidad calidad, Datos datos) {
        int res = calidad.CalidadRegion(datos);
        if (res == 4) {
            return " es un estado muy bueno, ya que entra en los estados estratégicos para la producción de fresa y tienes las condiciones perfectas para plantar ahora mismo ya que te encuentras en la mejor temporada posible (se tienen en cuenta el tiempo de crecimiento)";
        } else if (res == 2) {
            String texto = " es un estado bueno, ya que entra en los estados estratégicos para la producción de fresa, sin embargo, no estas en la mejor temporada para plantar ahora mismo, ";

            if (calidad.EOI) {
                texto = texto + "espera al verano para plantar con una mejor temporada";
            } else if (calidad.EPV) {
                texto = texto + "espera al invierno para plantar con una mejor temporada";
            }
            return texto;

        } else if (res == 0) {
            String tex = " es un estado malo para plantar";

            if (calidad.CalidadpH(datos) == 3 && calidad.CalidadHumedad(datos) == 2) {
                tex = tex + ", pero tienes un pH y humedad en el suelo bueno, así que podrías considerar el uso de aires acondicionados, también considera plantar con un tipo de fresa resistente a las condiciones climáticas de " + datos.estados[datos.getEstado()];
            } else if (calidad.CalidadpH(datos) == 3) {
                tex = tex + ", pero tienes un pH en el suelo bueno, así que podrías considerar el uso de aires acondicionados, también considera plantar con un tipo de fresa resistente a las condiciones climáticas de " + datos.estados[datos.getEstado()];
            } else if (calidad.CalidadHumedad(datos) == 2) {
                tex = tex + ", pero tienes una humedad en el suelo buena, así que podrías considerar el uso de aires acondicionados, también considera plantar con un tipo de fresa resistente a las condiciones climáticas de " + datos.estados[datos.getEstado()];
            }
            return tex;
        }
        return " Fuera de limites(cambiar)";
    }

    public String CalTemp(Calidad calidad, Datos datos) {
        int res = calidad.CalidadTemporada(datos);
        if (calidad.ED) {
            if (res == 2) {
                return " es una buena temporada para plantar fresa en el estado de " + datos.estados[datos.getEstado()];
            } else if (res == 1) {
                return " es una mala temporada para plantar fresa en el estado de " + datos.estados[datos.getEstado()];
            }
        }

        if (res == 2) {
            return " es una buena temporada para plantar fresa en el estado de " + datos.estados[datos.getEstado()];
        } else if (res == 1) {
            return " es una temporada aceptable para plantar fresa en el estado de " + datos.estados[datos.getEstado()];
        } else if (res == 0) {
            return " es una mala temporada para plantar fresa en el estado de " + datos.estados[datos.getEstado()];
        }
        return " Fuera de limites(cambiar)";
    }

    public String CalpH(Calidad calidad, Datos datos) {
        if (datos.getpH() == 0 && datos.getpH() <= 3.7) {
            return " es extremadamente ácido, lo cual es poco común en suelos naturales. Para corregirlo, se recomienda agregar cal agrícola o carbonato de calcio gradualmente. Te sugerimos realizar análisis de suelo y consultar con un especialista en agronomía para determinar la cantidad precisa de enmiendas alcalinas necesarias";
        }else if (datos.getpH() > 3.7 && datos.getpH() <= 5.5) {
            return ", se encuentra dentro de lo óptimo para las fresas, por lo que es posible que no necesites hacer ajustes significativos. No obstante, se recomienda realizar análisis periódicos para realizar un seguimiento del pH y asegurarte de mantener las condiciones ideales para tus fresas";
        }else if (datos.getpH() > 5.5 && datos.getpH() <= 6.5) {
            return " se encuentra en el rango de pH adecuado para las fresas. Para mantener un crecimiento saludable, asegúrate de mantener un equilibrio nutricional óptimo utilizando fertilizantes balanceados. Además, no olvides agregar materia orgánica regularmente al suelo para mejorar su estructura y retención de humedad";
        }else if (datos.getpH() > 6.5 && datos.getpH() <= 7) {
            return " y las fresas pueden adaptarse a un pH neutro, aunque prefieren ligeramente ácido. Si el suelo es pesado o arcilloso, es recomendable mejorar su drenaje y estructura mediante la adición de materia orgánica. Asegúrate de monitorear la disponibilidad de nutrientes para asegurarte de que tus fresas estén recibiendo los nutrientes adecuados";
        }else if (datos.getpH() > 7 && datos.getpH() <= 9) {
            return " y es alcalinos, es recomendable cultivar fresas en camas elevadas o en contenedores con sustrato ácido para evitar la influencia directa del suelo alcalino. Realiza pruebas de pH y ajustes regulares del sustrato para mantener un entorno adecuado para las fresas. Además, utiliza fertilizantes que contengan micronutrientes quelatados para asegurar una absorción adecuada de nutrientes";
        }else if (datos.getpH() > 9 && datos.getpH() == 14) {
            return ", Cultivar fresas en suelos alcalinos puede ser desafiante. Para superar este desafío, considera el uso de camas elevadas con sustrato ácido o implementa sistemas de cultivo hidropónico o en macetas con un medio de cultivo adecuado";
        }
        
        /*
        if (datos.getpH() >= 6 && datos.getpH() <= 7) {
            return ", por lo tanto es adecuado para el cultivo de fresas, ya que proporciona"
                    + " un entorno favorable para la absorción de nutrientes y el crecimiento saludable de las plantas";
        } else if (datos.getpH() >= 5.5 && datos.getpH() < 6) {
            return ", es considerado óptimo para el cultivo de fresas. Proporciona un entorno equilibrado para la absorción de nutrientes, el "
                    + "crecimiento saludable de las plantas y el desarrollo de frutas de calidad";
        } else if (datos.getpH() > 7 && datos.getpH() <= 7.5) {
            return ", puede presentar desafíos en términos de disponibilidad de nutrientes y absorción de nutrientes por parte de las plantas";
        }
        */
        
        return " Fuera de limites(cambiar)";
    }

    public String CalHumedad(Calidad calidad, Datos datos) {
        if (datos.getHumedad() >= 67 && datos.getHumedad() <= 73) {
            return " es adecuado para promover la germinación exitosa de las semillas y "
                    + "el enraizamiento inicial de las plántulas";

        } else if (datos.getHumedad() >= 62 && datos.getHumedad() < 67) {
            return " puede ser aceptable para el cultivo de fresas, siempre que se realice un monitoreo constante "
                    + "y se realicen ajustes apropiados en el riego para mantener la humedad adecuada en el suelo";

        } else if (datos.getHumedad() > 73 && datos.getHumedad() <= 80) {
            return " puede ser problemático para el cultivo de fresas debido al aumento del riesgo de enfermedades fúngicas,"
                    + " la posibilidad de pudrición de raíces y tallos, así como el estrés hídrico y la pérdida de nutrientes";

        }
        return " Fuera de limites(cambiar)";
    }

    public String Recomendacion() {
        String Recomendacion = "Control ambiental: Asegúrate de mantener condiciones óptimas de temperatura, humedad y circulación del aire mediante sistemas de ventilación, calefacción y refrigeración."
                + "<br><br>Riego y drenaje: Proporciona la cantidad adecuada de agua a las plantas y asegúrate de contar con un sistema de drenaje eficiente para evitar problemas de encharcamiento o estrés hídrico."
                + "<br><br>Iluminación: Si el invernadero no recibe suficiente luz natural, considera la instalación de luces artificiales adecuadas para satisfacer las necesidades de las plantas."
                + "<br><br>Manejo de la cosecha: Realiza una cosecha adecuada y oportuna para evitar la propagación de enfermedades y mantener la calidad de los productos."
                + "<br><br>Mantenimiento y limpieza: Realiza un mantenimiento regular del invernadero, incluyendo la limpieza de instalaciones y la eliminación de residuos vegetales, para prevenir la acumulación de enfermedades.";

        return StrToHtml(StrAlinear(Recomendacion, 40));
    }

    public String ManualUsuario() {
        String manual = "Simulador de Agronomía"
                + "<br><br>¡Bienvenido al Simulador de Agronomía!"
                + "<br>Este manual te proporcionará una guía detallada sobre cómo utilizar nuestra aplicación y aprovechar al máximo sus características."
                + "<br>Asegúrate de leer cuidadosamente las instrucciones antes de comenzar.";
        return StrToHtml(StrAlinear(manual, 40));
    }
    
    public String costo() {
        String costo = "Implementando.";

        return StrToHtml(StrAlinear(costo, 40));
    }
}
