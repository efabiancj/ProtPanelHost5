package clases_utiles;


import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class FArchivos {
    
     static File listFile[];
     static public int crear_archivo(String ubicacion, String nombre_archivo, String texto) // no reconoce so
     {
        int res =0;
        try {
            File archivo = new File(nombre_archivo);
            FileWriter escribir = new FileWriter(archivo, true);
            escribir.write(texto);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el texto " +ubicacion+nombre_archivo + " - path: " + e.getMessage());
        }
        return res;
     }
     static public int modificar_archivo(String nombre_archivo) // no reconoce so
     {
        int res =0;
        
        return res;
     }
     static public int borrar_archivo(String nombre_archivo) // no reconoce so
     {
        int res =0;

        return res;
     }
    static  public int compilar()
    {
        int res=0;
            
        return res;
    }

    static public int construir(String ubicacion, String nombre_apli) //build
    {
        int res=0;
        String comando =ubicacion+"jar -cvf "+nombre_apli+".war *";
        res=Terminal.Comando2(comando);
        
        return res;
    }
    
    static public int desplegar(String ubicacion, String nombre_war_apli,String destino)  //deploy
    {
        int res=0;   
        String comando ="as-install/bin/asadmin deploy "+ubicacion+nombre_war_apli+".war";
        res=Terminal.Comando2(comando);
        
        return res;
    }
    
    static public int Crear_directorio(String ubicacion, String nombre)
    {
        String so = System.getProperty("os.name");
        if (so.equals("Linux"))
        {
          Terminal.Comando2("mkdir "+ubicacion+nombre);
        }
        else
        {
          Terminal.Comando2("md "+ubicacion+nombre);
        }  
        return 0;
    }
    
    static public ArrayList<String> listar_archivos_directorio(String path)
    {
        ArrayList<String> res= new ArrayList<String>();
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for(int i = 0; i < listOfFiles.length; i++)         
        {
            if (listOfFiles[i].isFile())            
            {
                files = listOfFiles[i].getName();
                System.out.print("\n"+files);
                res.add(files);
            }
        }
        return res;
    }
    
    static public Arbol_directorios obtener_arbol_directorios(String path)//
    {
        Arbol_directorios res= null;
        Directorio dir  = null;
        boolean fin_path = false;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for (int i = 0; i < listOfFiles.length; i++)         
        {
            dir = new Directorio();
            dir.nombre=listOfFiles[i].getName();
            while(!fin_path)
            {
               if (listOfFiles[i].isDirectory())            
               {
                      //implementar  
               } 
            }
        }
        return res;
    }
    
    static public String buscar_war(String path)
    {
        String res="ninguno";
        int index = -1;
        ArrayList<String> lista_archivos = listar_archivos_directorio(path);
        for(String s: lista_archivos)
        {
            index = s.indexOf(".war");
            if(index>=0)
            {
                res=s;
            }
        }
        return res;
    }
    
    static public String buscar_war(String path,String file)
    {
        String res="ninguno";
        ArrayList<String> lista_archivos = listar_archivos_directorio(path);
        for(String s: lista_archivos)
        {
            if(s.equals(file))
            {
                res=s;
            }
        }
        return res;
    }
    static public String buscar_ext_en_subcarpetas(String path,String ext)
    {
        String res="ninguno";
        List lista = listarDirectorioRecursivo(path);
        int leng= lista.size();
        int leng_ext= ext.length();
        for(int i=0; i<leng; i++)
        {
            int index = lista.get(i).toString().indexOf(ext);
            //System.out.println("ext:"+ext+" leng:"+lista.get(i).toString().length()+"    index"+index);
            if((index > 0)&&(index==lista.get(i).toString().length()-leng_ext))
            {
                res=lista.get(i).toString();
            }
        }
        return res;
    }
  
    
    static public String buscar_archivo_en_subcarpetas(String path,String file)
    {
        String res="ninguno";
        File archivo = new File(path);
        List lista = listarDirectorioRecursivo(path);
        int leng= lista.size();
        for(int i=0; i<leng; i++)
        {
            archivo = new File(lista.get(i).toString());
            if(archivo.getName().equals(file))
            {
                res=archivo.getPath();
            }
        }
        return res;
    }
  
       
    public static List listarDirectorioRecursivo(String ruta) {
    File f = new File(ruta);
    List l = new LinkedList();
    if (f.exists()) {
      File[] ficheros = f.listFiles();
      for (int i = 0; i < ficheros.length; i++) {
         if (ficheros[i].isDirectory()) {
            List l1 = listarDirectorioRecursivo(ficheros[i].getAbsolutePath());
            l.addAll(l1);
         } 
         else {
               l.add(ficheros[i].getAbsolutePath());
         }
      }
   } else {
      System.out.println("Ruta incorrecta");
   }
   return l;
}

    
    static public String buscar_sql(String path)
    {
        String res="ninguno";
        int index = -1;
        ArrayList<String> lista_archivos = listar_archivos_directorio(path);
        for(String s: lista_archivos)
        {
            index = s.indexOf(".sql");
            if(index>=0)
            {
                res=s;  //obtendra siempre el ultimo de la lista
            }
        }
        return res;
    }
    
    static public String buscar_directorio_en_directorio(String path, String app)
    {
        String res="ninguno";
        String files;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();

        for(int i = 0; i < listOfFiles.length; i++)         
        {
            if (listOfFiles[i].isDirectory())            
            {
                files = listOfFiles[i].getName();
                System.out.println("\n "+files);
                if(files.equals(app))
                {
                    res=files;
                }
            }
        }
        return res;
    }

    public static String saber_extension(String archivo_subido)
    {
        int longitud = archivo_subido.length();
        int cp = 0;
        
        String extension=""; 
        int i = longitud-1;
        while((i > 0)||(cp==0))
        {
            if (archivo_subido.charAt(i) == '.')
            { 
                cp=i; 
            }
            i--;
        }
        try
        {
            extension = archivo_subido.substring(cp,longitud);
        }
        catch(Exception ex)
        {
            System.out.println("error obteniendo subcadena "+ex.getMessage());
                    
        }
        return extension; 
    }

    public static File[] getListFile() {
        return listFile;
    }

    public static void setListFile(File[] listFile) {
        FArchivos.listFile = listFile;
    }
    
    
}
