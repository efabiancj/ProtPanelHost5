package clases_utiles;


import acceso.Global;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class FStrings {
     static public String rellenar_espacios(String nombre_archivo, char caracter) // no reconoce so
     {
        String nueva ="";
        nueva = nombre_archivo.replace(' ','_');
        return nueva;
     }
     
      static public String obtener_dias(Object fecha) {
        String res = "0";
        String fec = fecha.toString();
        try {
            res = fec.substring(8, 10);//2014-02-02
        } catch (Exception ex) {
            System.out.println("Error obteniendo dias " + ex.getMessage());
        }
        return res;
    }

    static public String obtener_meses(Object fecha) {
        String res = "0";
        String fec = fecha.toString();
        try {
            res = fec.substring(5, 7); //2014-02-02
        } catch (Exception ex) {
            System.out.println("Error obteniendo dias " + ex.getMessage());
        }
        return res;
    }

    static public String obtener_anios(Object fecha) {
        String res = "0";
        String fec = fecha.toString();
        try {
            res = fec.substring(0, 4);
        } catch (Exception ex) {
            System.out.println("Error obteniendo dias " + ex.getMessage());
        }
        return res;
    }

    static public String llenar_ceros_izq(String cadena, int num_ceros) {
        String res = cadena;
        int valor = Integer.parseInt(cadena);
        int factor = 1;
        int i = 0;
        while (i < num_ceros) {
            factor = factor * 10;
            i++;
        }
        valor += factor;
        res = "" + valor;
        res = res.substring(1, i + 1);
        return res;
    }

    static public String llenar_ceros_izq(int valor, int num_ceros) {
        String res = "";

        int factor = 10;
        int i = 0;
        while (i < num_ceros) {
            factor = factor * 10;
            i++;
        }
        valor += factor;
        res = "" + valor;
        res = res.substring(1, i + 2);
        return res;
    }

    static public ArrayList<String> ini_years() {
        ArrayList<String> res = new ArrayList<String>();
        int i = 1940;
        while (i <= Global.anio_actual) {
            res.add("" + i);
            i++;
        }
        return res;
    }

    static public ArrayList<String> ini_months() {
        ArrayList<String> res = new ArrayList<String>();
        int i = 1;
        while (i <= 12) {
            res.add("" + llenar_ceros_izq(i, 1));
            i++;
        }
        return res;
    }

    static public ArrayList<String> ini_days() {
        ArrayList<String> res = new ArrayList<String>();

        int i = 1;

        while (i <= 31) {
            res.add("" + llenar_ceros_izq(i, 1));
            i++;
        }
        return res;
    }

    static public Date StringToDate(String fecha) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = fecha;
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(strFecha);
            System.out.println(fechaDate.toString());
            return fechaDate;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return fechaDate;
        }
    }

    static public String encriptar_cod3(String clave, String id_usuario) {
        String res = "";
        int codigo_ascii_clave = 0;
        int codigo_ascii_id_usuario = 0;
        int num_caracteres = clave.length();
        int num_caracteres1 = clave.length();
        int num_caracteres2 = id_usuario.length();

        HashMap hash = new HashMap();
        hash.put("0", "A");
        hash.put("1", "B");
        hash.put("2", "C");
        hash.put("3", "D");
        hash.put("4", "E");
        hash.put("5", "F");
        hash.put("6", "G");
        hash.put("7", "H");
        hash.put("8", "I");
        hash.put("9", "J");
        hash.put("10", "K");
        hash.put("11", "L");
        hash.put("12", "M");
        hash.put("13", "N");
        hash.put("14", "O");
        hash.put("15", "P");
        hash.put("16", "Q");
        hash.put("17", "R");
        hash.put("18", "S");
        hash.put("19", "T");
        hash.put("20", "U");
        hash.put("21", "V");
        hash.put("22", "W");
        hash.put("23", "X");
        hash.put("24", "Y");
        hash.put("25", "Z");

        char dif_caracter = 'C';  // es C si la clave es mayor que el id  e I si el id es mayor

        int diferencia = num_caracteres - num_caracteres2;
        String completado = "";
        String codigos = "";
        int abs_dif = Math.abs(diferencia);

        try {
            if (diferencia > 0) //iguala el numero de caracteres si el id es menor
            {
                completado = id_usuario;
                float div = abs_dif / num_caracteres2;
                double rep = Math.floor(div);
                int residuo = abs_dif % num_caracteres2;
                int i = 0;
                while (i < rep) {
                    completado += "" + id_usuario;
                    i++;
                }
                completado += "" + id_usuario.substring(0, residuo);
                num_caracteres = num_caracteres1;
                id_usuario = completado;
                dif_caracter = 'C';
                //System.out.println(" id menor.. igualando, nueva id=" + id_usuario);
            }
            if (diferencia < 0)//iguala el numero de caracteres si la clave es menor
            {
                completado = clave;
                float div = abs_dif / num_caracteres1;
                double rep = Math.floor(div);
                int residuo = abs_dif % num_caracteres1;
                int i = 0;

                //System.out.println(" div=" + div + "   repeticiones=" + rep + "    residuo=" + residuo);
                while (i < rep) {
                    completado += "" + clave;
                    //System.out.println(" claves aumentadas =" + completado);
                    i++;
                }
                completado += "" + clave.substring(0, residuo);
               // System.out.println(" clave completada =" + completado);
                num_caracteres = num_caracteres2;
                clave = completado;
                dif_caracter = 'I';
                //System.out.println(" clave menor.. igualando, nueva clave=" + clave);
            }

            System.out.println(" numero de caracteres = " + num_caracteres);
            System.out.println(" clave =  " + clave);
            System.out.println(" id     =  " + id_usuario);

            for (int x = 0; x < num_caracteres; x++) //realiza la suma invertida de los codigos ascii    
            {
                char caracter_clave = clave.charAt(x);
                char caracter_id_usuario = id_usuario.charAt(num_caracteres - x - 1);

                codigo_ascii_clave = (int) caracter_clave;
                codigo_ascii_id_usuario = (int) caracter_id_usuario;

                //System.out.println(" caracter clave = " + caracter_clave + "  cod_ascii=" + codigo_ascii_clave + "caracter id = " + caracter_id_usuario);

                int sum_codigos = codigo_ascii_clave + codigo_ascii_id_usuario;
                String cad_sum_codigos = "" + sum_codigos;

                //System.out.println(" suma de codigos = " + cad_sum_codigos);

                if ((sum_codigos / 100) < 1) {
                    sum_codigos += 1000;
                    cad_sum_codigos = "" + sum_codigos;
                    cad_sum_codigos = cad_sum_codigos.substring(1, cad_sum_codigos.length());
                    System.out.println(" llenando con ceros = " + cad_sum_codigos);
                }
                codigos += cad_sum_codigos;
                //System.out.println(" codigo semi completado = " + codigos);
            }

            int num_caracteres_cad_sum_codigos = codigos.length();
            //System.out.println(" numero de caracteres nuevo codigo = " + num_caracteres_cad_sum_codigos);
            //System.out.println(" dividiendo en pares ");
            int x = 0;
            int inicio = 65; //inicio en la tabla ascii

            while (x < num_caracteres_cad_sum_codigos) //transforma todos los digitos a caracters
            {
                char chr_cod = codigos.charAt(x);
                int int_cod = Integer.parseInt("" + chr_cod);

                int nuevo_cod = inicio + int_cod;
                res = "" + res + (char) nuevo_cod;

                x++;
            }
            System.out.println("\n Encriptacion exitosa.");
        } catch (Exception ex) {
            res = "error";
        }

        return res + "" + dif_caracter + hash.get("" + abs_dif);
    }

    static public String desencriptar_cod3(String clave_enc, String id_usuario) {

        HashMap hash = new HashMap();
        hash.put("A", 0);
        hash.put("B", 1);
        hash.put("C", 2);
        hash.put("D", 3);
        hash.put("E", 4);
        hash.put("F", 5);
        hash.put("G", 6);
        hash.put("H", 7);
        hash.put("I", 8);
        hash.put("J", 9);
        hash.put("K", 10);
        hash.put("L", 11);
        hash.put("M", 12);
        hash.put("N", 13);
        hash.put("O", 14);
        hash.put("P", 15);
        hash.put("Q", 16);
        hash.put("R", 17);
        hash.put("S", 18);
        hash.put("T", 19);
        hash.put("U", 20);
        hash.put("V", 21);
        hash.put("W", 22);
        hash.put("X", 23);
        hash.put("Y", 24);
        hash.put("Z", 26);

        String res = "";

        int inicio = 65;
        int int_cod = 0;
        int nuevo_cod = 0;
        char dif_caracter = 'C';
        int num_caracteres_cad_sum_codigos = clave_enc.length();
        String codigos = "";
        int x = 0;
        int restar_clave_enc = 0;

        try {
            dif_caracter = clave_enc.charAt(num_caracteres_cad_sum_codigos - 2);

            while (x < num_caracteres_cad_sum_codigos) //transforma todos los digitos a caracters
            {
                char chr_cod = clave_enc.charAt(x);
                nuevo_cod = (int) chr_cod;
                int_cod = nuevo_cod - inicio;
                //System.out.println(x + " - " + chr_cod + " codigo anterior: " + nuevo_cod + " codigo nuevo:" + int_cod + " des:" + int_cod);
                res = "" + res + int_cod;
                x++;
            }

            int num_caracteres = (num_caracteres_cad_sum_codigos / 3);
            String id_completado = id_usuario;
            String clave_completado = "";
            int num_caracteres2 = id_completado.length();
            //System.out.println("numero de caracteres enc=" + num_caracteres_cad_sum_codigos + "   dif_caracter=" + dif_caracter + "     numero de caracteres = " + num_caracteres);
            if (dif_caracter == 'C') //iguala el numero de caracteres si el id es menor
            {
                id_completado = id_usuario;

                int abs_dif = Math.abs(num_caracteres - num_caracteres2);

                float div = abs_dif / num_caracteres2;
                double rep = Math.floor(div);
                int residuo = abs_dif % num_caracteres2;
                int i = 0;
                while (i < rep) {
                    id_completado += "" + id_usuario;
                    i++;
                }
                id_completado += "" + id_usuario.substring(0, residuo);

                //System.out.println(" id menor.. igualando, nueva id=" + id_completado);
            }

            if (dif_caracter == 'I') {
                restar_clave_enc = Integer.parseInt("" + hash.get("" + clave_enc.charAt(num_caracteres_cad_sum_codigos - 1)));
            }
            codigos = "";

            x = 0;
            int i = 0;
            int longitud = res.length();
            //System.out.println("long nueva cadena=" + longitud);
            while (x < longitud - 2) //realiza la suma invertida de los codigos ascii    
            {
                int indice_f = x + 3;
                String cad_sum_codigos = res.substring(x, indice_f);

                int sum_codigos = Integer.parseInt(cad_sum_codigos);

                int codigo_ascii_id_usuario = (int) (id_completado.charAt(num_caracteres - i - 1));
                int codigo_ascii_clave = sum_codigos - codigo_ascii_id_usuario;

               // System.out.println(x + " < " + longitud + " siguiente=" + indice_f + "   suma de codigos = " + cad_sum_codigos + "  codigo id = " + codigo_ascii_id_usuario);
                char caracter_clave = (char) codigo_ascii_clave;
                //System.out.println(" recuperada = " + caracter_clave);
                codigos += "" + caracter_clave;
                x = x + 3;
                i++;
            }
            codigos = codigos.substring(0, num_caracteres - restar_clave_enc);
            System.out.println("\n Desncriptacion exitosa.");
        } catch (Exception ex) {
            codigos = "error";
        }
        return codigos;
    }

    static public String encriptar_cod5(String clave, String id_usuario) {
        String res = "";
        int codigo_ascii_clave = 0;
        int codigo_ascii_id_usuario = 0;
        int num_caracteres = clave.length();
        int num_caracteres1 = clave.length();
        int num_caracteres2 = id_usuario.length();

        HashMap hash = new HashMap();
        hash.put("0", "A");
        hash.put("1", "B");
        hash.put("2", "C");
        hash.put("3", "D");
        hash.put("4", "E");
        hash.put("5", "F");
        hash.put("6", "G");
        hash.put("7", "H");
        hash.put("8", "I");
        hash.put("9", "J");
        hash.put("10", "K");
        hash.put("11", "L");
        hash.put("12", "M");
        hash.put("13", "N");
        hash.put("14", "O");
        hash.put("15", "P");
        hash.put("16", "Q");
        hash.put("17", "R");
        hash.put("18", "S");
        hash.put("19", "T");
        hash.put("20", "U");
        hash.put("21", "V");
        hash.put("22", "W");
        hash.put("23", "X");
        hash.put("24", "Y");
        hash.put("25", "Z");

        char dif_caracter = 'C';  // es C si la clave es mayor que el id  e I si el id es mayor

        int diferencia = num_caracteres - num_caracteres2;
        String completado = "";
        String codigos = "";
        int abs_dif = Math.abs(diferencia);

        try {
            if (diferencia > 0) //iguala el numero de caracteres si el id es menor
            {
                completado = id_usuario;
                float div = abs_dif / num_caracteres2;
                double rep = Math.floor(div);
                int residuo = abs_dif % num_caracteres2;
                int i = 0;
                while (i < rep) {
                    completado += "" + id_usuario;
                    i++;
                }
                completado += "" + id_usuario.substring(0, residuo);
                num_caracteres = num_caracteres1;
                id_usuario = completado;
                dif_caracter = 'C';
                System.out.println(" id menor.. igualando, nueva id=" + id_usuario);
            }
            if (diferencia < 0)//iguala el numero de caracteres si la clave es menor
            {
                completado = clave;
                float div = abs_dif / num_caracteres1;
                double rep = Math.floor(div);
                int residuo = abs_dif % num_caracteres1;
                int i = 0;

                System.out.println(" div=" + div + "   repeticiones=" + rep + "    residuo=" + residuo);
                while (i < rep) {
                    completado += "" + clave;
                    System.out.println(" claves aumentadas =" + completado);
                    i++;
                }
                completado += "" + clave.substring(0, residuo);
                System.out.println(" clave completada =" + completado);
                num_caracteres = num_caracteres2;
                clave = completado;
                dif_caracter = 'I';
                System.out.println(" clave menor.. igualando, nueva clave=" + clave);
            }

            System.out.println(" numero de caracteres = " + num_caracteres);
            System.out.println(" clave =  " + clave);
            System.out.println(" id     =  " + id_usuario);

            for (int x = 0; x < num_caracteres; x++) //realiza la suma invertida de los codigos ascii    
            {
                char caracter_clave = clave.charAt(x);
                char caracter_id_usuario = id_usuario.charAt(num_caracteres - x - 1);

                codigo_ascii_clave = (int) caracter_clave;
                codigo_ascii_id_usuario = (int) caracter_id_usuario;

                System.out.println(" caracter clave = " + caracter_clave + "  cod_ascii=" + codigo_ascii_clave + "caracter id = " + caracter_id_usuario);

                int sum_codigos = codigo_ascii_clave + codigo_ascii_id_usuario;
                String cad_sum_codigos = "" + sum_codigos;

                System.out.println(" suma de codigos = " + cad_sum_codigos);

                if ((sum_codigos / 100) < 1) {
                    sum_codigos += 1000;
                    cad_sum_codigos = "" + sum_codigos;
                    cad_sum_codigos = cad_sum_codigos.substring(1, cad_sum_codigos.length());
                    System.out.println(" llenando con ceros = " + cad_sum_codigos);
                }
                codigos += cad_sum_codigos;
                System.out.println(" codigo semi completado = " + codigos);
            }

            int num_caracteres_cad_sum_codigos = codigos.length();
            System.out.println(" numero de caracteres nuevo codigo = " + num_caracteres_cad_sum_codigos);
            System.out.println(" dividiendo en pares ");
            int x = 0;
            int inicio = 65; //inicio en la tabla ascii

            while (x < num_caracteres_cad_sum_codigos) //transforma todos los digitos a caracters
            {
                char chr_cod = codigos.charAt(x);
                int int_cod = Integer.parseInt("" + chr_cod);

                int nuevo_cod = inicio + int_cod;
                res = "" + res + (char) nuevo_cod;

                x++;
            }
        } catch (Exception ex) {
            res = "error";
        }

        return res + "" + dif_caracter + hash.get("" + abs_dif);
    }

    static public String desencriptar_cod5(String clave_enc, String id_usuario) {

        HashMap hash = new HashMap();
        hash.put("A", 0);
        hash.put("B", 1);
        hash.put("C", 2);
        hash.put("D", 3);
        hash.put("E", 4);
        hash.put("F", 5);
        hash.put("G", 6);
        hash.put("H", 7);
        hash.put("I", 8);
        hash.put("J", 9);
        hash.put("K", 10);
        hash.put("L", 11);
        hash.put("M", 12);
        hash.put("N", 13);
        hash.put("O", 14);
        hash.put("P", 15);
        hash.put("Q", 16);
        hash.put("R", 17);
        hash.put("S", 18);
        hash.put("T", 19);
        hash.put("U", 20);
        hash.put("V", 21);
        hash.put("W", 22);
        hash.put("X", 23);
        hash.put("Y", 24);
        hash.put("Z", 26);

        String res = "";

        int inicio = 65;
        int int_cod = 0;
        int nuevo_cod = 0;
        char dif_caracter = 'C';
        int num_caracteres_cad_sum_codigos = clave_enc.length();
        String codigos = "";
        int x = 0;
        int restar_clave_enc = 0;

        try {
            dif_caracter = clave_enc.charAt(num_caracteres_cad_sum_codigos - 2);

            while (x < num_caracteres_cad_sum_codigos) //transforma todos los digitos a caracters
            {
                char chr_cod = clave_enc.charAt(x);
                nuevo_cod = (int) chr_cod;
                int_cod = nuevo_cod - inicio;
                System.out.println(x + " - " + chr_cod + " codigo anterior: " + nuevo_cod + " codigo nuevo:" + int_cod + " des:" + int_cod);
                res = "" + res + int_cod;
                x++;
            }

            int num_caracteres = (num_caracteres_cad_sum_codigos / 3);
            String id_completado = id_usuario;
            String clave_completado = "";
            int num_caracteres2 = id_completado.length();
            System.out.println("numero de caracteres enc=" + num_caracteres_cad_sum_codigos + "   dif_caracter=" + dif_caracter + "     numero de caracteres = " + num_caracteres);
            if (dif_caracter == 'C') //iguala el numero de caracteres si el id es menor
            {
                id_completado = id_usuario;

                int abs_dif = Math.abs(num_caracteres - num_caracteres2);

                float div = abs_dif / num_caracteres2;
                double rep = Math.floor(div);
                int residuo = abs_dif % num_caracteres2;
                int i = 0;
                while (i < rep) {
                    id_completado += "" + id_usuario;
                    i++;
                }
                id_completado += "" + id_usuario.substring(0, residuo);

                System.out.println(" id menor.. igualando, nueva id=" + id_completado);
            }

            if (dif_caracter == 'I') {
                restar_clave_enc = Integer.parseInt("" + hash.get("" + clave_enc.charAt(num_caracteres_cad_sum_codigos - 1)));
            }
            codigos = "";

            x = 0;
            int i = 0;
            int longitud = res.length();
            System.out.println("long nueva cadena=" + longitud);
            while (x < longitud - 2) //realiza la suma invertida de los codigos ascii    
            {
                int indice_f = x + 3;
                String cad_sum_codigos = res.substring(x, indice_f);

                int sum_codigos = Integer.parseInt(cad_sum_codigos);

                int codigo_ascii_id_usuario = (int) (id_completado.charAt(num_caracteres - i - 1));
                int codigo_ascii_clave = sum_codigos - codigo_ascii_id_usuario;

                System.out.println(x + " < " + longitud + " siguiente=" + indice_f + "   suma de codigos = " + cad_sum_codigos + "  codigo id = " + codigo_ascii_id_usuario);
                char caracter_clave = (char) codigo_ascii_clave;
                System.out.println(" recuperada = " + caracter_clave);
                codigos += "" + caracter_clave;
                x = x + 3;
                i++;
            }
            codigos = codigos.substring(0, num_caracteres - restar_clave_enc);
        } catch (Exception ex) {
            codigos = "error";
        }
        return codigos;
    }

    static public String cerrar_etiquetas(String texto) {
        String res = texto;
        int i = 0;
        int longitud = texto.length();
        String cad = "";
        int pos_eliminar = 0;
        int pos_tag_abierto = 0;
        HashMap etiquetas = new HashMap();
        Stack indice_tags= new Stack();
        while (i < longitud) {
            if ((texto.charAt(i) == '<')) 
            {
                cad = "";
                pos_eliminar = i;
                try {
                    if (!(texto.charAt(i + 1) == '/')) {
                        pos_tag_abierto = i;
                    }
                } catch (Exception ex) {

                }
            } 
            else 
            {
                if (texto.charAt(i) == '>') 
                {
                    if (!(texto.charAt(i - 1) == '/')) {
                        if (!(texto.charAt(pos_eliminar + 1) == '/')) {
                            if (!(texto.charAt(pos_tag_abierto + 1) == '/')) {
                                
                                etiquetas.put(pos_tag_abierto, cad);
                                indice_tags.add(pos_tag_abierto);
                                cad = "";
                            }
                        }
                        else
                        {
                            int indice=Integer.parseInt(indice_tags.pop().toString());
                            etiquetas.remove(indice);
                        }
                    }
                    pos_eliminar = longitud-1;
                } 
                else 
                {
                        cad += "" + texto.charAt(i);
                }
            }
            i++;
        }
        if(pos_eliminar!=0)
        {
            res = res.substring(0, pos_eliminar );
        }
       // System.out.println(" longitud: " + longitud + " posicion abierta: " + pos_eliminar + "   tag abierto:" + pos_tag_abierto);
        
        while(!indice_tags.empty())
        {
            int indice=Integer.parseInt(indice_tags.pop().toString());
            res=res+"</"+etiquetas.get(indice)+">";
        }

        return res;
    }
    
    static public String limitar_caracteres(String texto, int limite) {
        String res = texto;
        if (texto.length() >= limite) {
            res = texto.substring(0, limite);
        }
        res = cerrar_etiquetas(res);
        return res + "";
    }

    static public boolean verificar_si_parametro(String archivo)
    {
        boolean res=false;
        System.out.println("\nintenando detectar parametros..");
        int longitud=archivo.length();
        try
        {
            System.out.println("\nbuscando '?'..");
            
            for(int i=0; i<longitud; i++)
            {
                if(archivo.charAt(i)=='?')
                {
                    res=true;
                }
            }
               
        }
        catch(Exception ex)
        {
                System.out.println("\nerror.."+ex.toString());
        }
        return res;
    }
    
    public static String separarCorreo(String s) {
        int cp = 0; 
        String nombre=""; 
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '@') { 
                cp=i; 
            }
        }
        nombre = s.substring(0, cp);
        return nombre; 
    }
    
    public static String optener_ip() {
        String sHostName = "";
        String sIPAddress = Global.host;
//        try {
//            InetAddress address = InetAddress.getLocalHost();
//            sHostName = address.getHostName();
//            byte[] bIPAddress = address.getAddress();
//
//            for (int x = 0; x < bIPAddress.length; x++) {
//                if (x > 0) {
//
//                    sIPAddress += ".";
//                }
//                sIPAddress += bIPAddress[x] & 255;
//            }
//        } catch (Exception ex) {
//        }
        return sIPAddress;
    }
    
    public static String optener_host() {
        String sHostName = "";
        try {
            InetAddress address = InetAddress.getLocalHost();
            sHostName = address.getHostName();
           
        } catch (Exception ex) {
        }
        return sHostName;
    }
    
    public static String borrar_ultimos_caracteres(String palabra,int cuantos)
    {
        String res="";
        int longitud =  palabra.length();
        int cp = 0;
        res = palabra.substring(0,longitud-cuantos);
        return res;
    }
    
    public static String copiar_en_portapapeles(String texto)
    {
        String res="";
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection data = new StringSelection(texto);
        clipboard.setContents(data, data);
        res=texto;
        return res;
    }
}
