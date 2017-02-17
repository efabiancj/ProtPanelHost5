package clases_utiles;


import acceso.Global;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edgar
 */
public class Terminal {
  /*  static public int Comando(String nombre_comando)
    {
         try {
                        // Determinar en qué SO estamos
                        String so = System.getProperty("os.name");
                        String comando;
                        String s;
                        // Comando para Linux
                        if (so.equals("Linux"))comando = "ifconfig";
                        // Comando para Windows
                        else
                                comando = "cmd /c ipconfig";
                        // Ejcutamos el comando
                        Process p = Runtime.getRuntime().exec(comando);
                        BufferedReader stdInput = new BufferedReader(new InputStreamReader(p.getInputStream()));
                        BufferedReader stdError = new BufferedReader(new InputStreamReader(p.getErrorStream()));

                        // Leemos la salida del comando
                        System.out.println("Ésta es la salida standard del comando:\n");
                        while ((s = stdInput.readLine()) != null) 
                        {
                                System.out.println(s);
                        }

                        // Leemos los errores si los hubiera
                        System.out.println("Ésta es la salida standard de error del comando (si la hay):\n");
                        while ((s = stdError.readLine()) != null) {
                                System.out.println(s);
                        }

                        System.exit(0);
                } 
         catch (IOException e) {
                        System.out.println("Excepción: ");
                        e.printStackTrace();
                        System.exit(-1);
                }
        return 0;
    }*/
    
    static public int Comando2(String nombre_comando) // no reconoce so
    {
        int res = 0;
        String salida = null;
        try{
 
            // Ejecucion Basica del Comando
            Process proceso = Runtime.getRuntime().exec(nombre_comando);
 
            InputStreamReader entrada = new InputStreamReader(proceso.getInputStream());
            BufferedReader stdInput = new BufferedReader(entrada);
            res=1;
            //Si el comando tiene una salida la mostramos
            if((salida=stdInput.readLine()) != null){
                System.out.println("Comando ejecutado Correctamente");
                while ((salida=stdInput.readLine()) != null){
                    System.out.println(salida);
                }
            }else{
                System.out.println("No se a producido ninguna salida");
            }
        }catch (IOException e) {
                System.out.println("Excepción: ");
                e.printStackTrace();
        }
        return res;
    }

    
    
    
    static public int Comando3(String path, String comando1, String objeto) throws IOException 
    { 
       int res = 0;
        String[] command = {"CMD", "/C", comando1,objeto};
    
        ProcessBuilder probuilder = new ProcessBuilder( command );
        probuilder.directory(new File(path));
        Process process = probuilder.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.printf("Output of running %s is:\n",Arrays.toString(command));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        try {
            int exitValue = process.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return res;
   }
   static public int Comando4(String path, String comando1,String comando2, String objeto) throws IOException 
    { 
       int res = 0;
        String[] command = {"CMD", "/C", comando1,comando2,objeto};
    
        ProcessBuilder probuilder = new ProcessBuilder( command );
        probuilder.directory(new File(path));
        Process process = probuilder.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.printf("Output of running %s is:\n",Arrays.toString(command));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        try {
            int exitValue = process.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return res;
   }
   
   static public int Comando(String path, String[] command) throws IOException 
    { 
       int res = 0;
        ProcessBuilder probuilder = new ProcessBuilder( command );
        probuilder.directory(new File(path));
        Process process = probuilder.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.printf("Output of running %s is:\n",Arrays.toString(command));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        try {
            int exitValue = process.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return res;
   }
   
   static public int ComandoLinux(String path, String comando) throws IOException 
    { 
       int res = 0;
        String[] command = {"bash", "-c", comando};
        ProcessBuilder probuilder = new ProcessBuilder( command );
        probuilder.directory(new File(path));
        Process process = probuilder.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.printf("Output of running %s is:\n",Arrays.toString(command));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        try {
            int exitValue = process.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return res;
   }
  
    static public int Buscar_archivo_Win(String path, String comando, String objeto) throws IOException 
    { 
       int res = 0;
        String[] command = {"CMD", "/C", comando,objeto};
    
        ProcessBuilder probuilder = new ProcessBuilder( command );
        probuilder.directory(new File(path));
        Process process = probuilder.start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;
        System.out.printf("Output of running %s is:\n",Arrays.toString(command));
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            line.lastIndexOf(path);
        }
        try {
            int exitValue = process.waitFor();
            System.out.println("\n\nExit Value is " + exitValue);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    return res;
   }
   
    
    
    
    
    static public int ejecutar_bash(String nombre_archivo_sin_ext) 
    {
         int res=0;
         try
         {
             Runtime.getRuntime().exec(nombre_archivo_sin_ext, new String[]{ "argumento" });
         }
         catch(Exception ex)
         {
            
         }
         return res;
    }
    
    static public int ejecutar_bash2(String nombre_archivo_sin_ext) 
    {
         int res=0;
         String nombre_archivo_con_ext="";
         String so = System.getProperty("os.name");
         try
         {
             if (so.equals("Linux"))
             {
                nombre_archivo_con_ext =nombre_archivo_sin_ext + ".sh";
                Comando2("bash "+nombre_archivo_con_ext);
             }
             else
             {
                nombre_archivo_con_ext =nombre_archivo_sin_ext + ".bat";
                Comando2("runas /user:administrator "+ nombre_archivo_con_ext);
             }    
             
         }
         catch(Exception ex)
         {
         }
         return res;
    }
    static public int borrar(String nombre_archivo_sin_ext) 
    {
        int res=00;
        return res;
    }
    
    public static void desplegar_war_linux( String origen, String destino  ) //coopia war en deploy
    {
    try
     {
        ProcessBuilder pbuilder;
        
        pbuilder = new ProcessBuilder("bash","-c","cp "+origen+" "+destino );
        pbuilder.redirectErrorStream( true );
        pbuilder.start();
        
      } catch (Exception e) { System.out.println("Error  - "+e.getMessage()); }
    }
    
    public static boolean crear_directorio_linux(String destino )
    {
    boolean res=false;
   
    try
     {
        ProcessBuilder pbuilder;
        
        pbuilder = new ProcessBuilder("bash","-c","cp -r "+Global.directorio_a_copiar+" "+destino );
        pbuilder.redirectErrorStream( true );
        pbuilder.start();
        
      } catch (Exception e) { System.out.println("Error  - "+e.getMessage()); }
    
    
       return res;
    }
    
    
    public static void restaurar_backup_pg_win( String servidor, String puerto, String usuario, String password, String basedatos, String path )
    {
    try
     {
        ProcessBuilder pbuilder;
        pbuilder = new ProcessBuilder(Global.directorio_bin_pg+"\\pg_restore.exe", "-i", "-h", servidor, "-p", puerto, "-U", usuario, "-d", basedatos, "-v", path );
        pbuilder.environment().put( "PGPASSWORD", password );
        pbuilder.redirectErrorStream( true );
        pbuilder.start();
      } catch (Exception e) { System.out.println("Error  - "+e.getMessage()); }
    }
    
    public static void restaurar_backup_pg_linux( String servidor, String puerto, String usuario, String password, String basedatos, String path )
    {
    try
     {
        ProcessBuilder pbuilder;
        pbuilder = new ProcessBuilder(Global.directorio_bin_pg+"/pg_restore", "-i", "-h", servidor, "-p", puerto, "-U", usuario, "-d", basedatos, "-v", path );
        pbuilder.environment().put( "PGPASSWORD", password );
        pbuilder.redirectErrorStream( true );
        pbuilder.start();
      } catch (Exception e) { System.out.println("Error  - "+e.getMessage()); }
    }
    
    public static void restaurar_sql_pg_win( String servidor, String puerto, String usuario, String password, String basedatos, String path )
    {
    try
     {
        ProcessBuilder pbuilder;
        pbuilder = new ProcessBuilder(Global.directorio_bin_pg+"\\psql.exe", "-h", servidor, "-p", puerto, "-U", usuario, "-d", basedatos, "-f", path );
        pbuilder.environment().put( "PGPASSWORD", password );
        pbuilder.redirectErrorStream( true );
        System.out.println("Ningun error - "+pbuilder.toString()+Global.directorio_bin_pg+"\\psql.exe");
        pbuilder.start();
       } catch (Exception e) { System.out.println("Error  - "+e.getMessage()); }
    }
    public static void restaurar_sql_pg_linux( String servidor, String puerto, String usuario, String password, String basedatos, String path )
    {
    try
     {
        System.out.println("Intentado restaurar... con restaurar_sql_pg_linux");
        ProcessBuilder pbuilder;
        pbuilder = new ProcessBuilder(Global.directorio_bin_pg+"/psql", "-h", servidor, "-p", puerto, "-U", usuario, "-d", basedatos, "-f", path );
        pbuilder.environment().put( "PGPASSWORD", password );
        pbuilder.redirectErrorStream( true );
        System.out.println("Ningun error - "+pbuilder.toString()+Global.directorio_bin_pg+"/psql");
        pbuilder.start();
       } catch (Exception e) { System.out.println("Error  - "+e.getMessage()); }
    }
}
