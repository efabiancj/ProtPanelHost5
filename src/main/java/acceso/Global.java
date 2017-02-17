/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;


import java.util.ResourceBundle;

/**
 *
 * @author root
 */
public final  class Global {

    java.util.ResourceBundle Configuracion = java.util.ResourceBundle.getBundle("acceso.database");
        
    private String URL    = Configuracion.getString("url");
    private String DRIVER = Configuracion.getString("driver");
    private String USER   = Configuracion.getString("user");
    private String PASS   = Configuracion.getString("password");
    

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    public String getDRIVER() {
        return DRIVER;
    }

    public void setDRIVER(String DRIVER) {
        this.DRIVER = DRIVER;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getPASS() {
        return PASS;
    }

    public void setPASS(String PASS) {
        this.PASS = PASS;
    }

      
    public  static String   ext=".jsf";
    
   // public  static String SO="WIN";
    public  static String SO="LIN";
    
//    LINUX
    public  static String   dir_base_aplicacion     = "/opt/glassfish4/glassfish/domains/domain1/applications/Modulos_protpanel/"; 
    public  static String   dir_base_war_aplicacion = "/opt/glassfish4/glassfish/domains/domain1/applications/"; 
    public  static String   dir_base_repo_m2_aplicacion = "/var/lib/jenkins/.m2/repository/";
   
    public  static String   dir_base_usuarios           = "/home/usuarios_host/"; 
    public  static String   dir_repositorio_svn         = "/home/usuarios_host/svn/";
    public  static String   dir_repositorio_git         = "/home/usuarios_host/git/";
    public  static String   dir_base_ftp_apli_usuario   = "/home/usuarios_host/ftp/";
    public  static String   dir_base_war_usuario        = "/opt/glassfish4/glassfish/domains/domain1/applications/"; 
    public  static String   dir_base_tmp_scrip_usr      = "/tmp/usuarios/";
    public  static String   separador_dir               = "/";
    //public  static String   directorio_bin_glassfish    = "/opt/glassfish4/bin";
    public  static String   directorio_bin_glassfish ="/opt/glassfish4/glassfish/bin";
////  public  static String   directorio_bin_glassfish ="/opt/glassfish4/glassfish/lib/asadmin";
////  public  static String   directorio_bin_glassfish ="/usr/bin/asadmin";
    
    public  static String   directorio_app_glasfish_domain = "/domain1/applications/";
    public  static String   directorio_padre_glassfish     = "/opt/glassfish4/glassfish/";
    //public  static String   directorio_bin_pg              = "/usr/pgsql-9.4/bin";
    public  static String   directorio_bin_pg              = "/usr/bin";
    public  static String   dir_autodeploy                 = "/opt/glassfish4/glassfish/domains/domain1/autodeploy/";
    public  static String   directorio_a_copiar            = "/home/directorio/";
    public  static String   geckodriver                    = "";
    
//    //WINDOWS
//    public  static String   dir_base_aplicacion      = "E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\"; 
//    public  static String   dir_base_war_aplicacion  = ""; 
//    public  static String   dir_base_repo_m2_aplicacion = "";
//   
//    public  static String   dir_base_usuarios           = "E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\";
//    public  static String   dir_repositorio_svn         = "";
//    public  static String   dir_repositorio_git         = "";
//    public  static String   dir_base_ftp_apli_usuario   = "";
//    public  static String   dir_base_war_usuario        = ""; 
//    public  static String   separador_dir               = "\\"+"\\";
//    public  static String   directorio_bin_glassfish    = "C:\\Program Files\\glassfish-4.0\\bin";
//    public  static String   directorio_app_glassfish_domain = "domain1\\applications\\";
//    public  static String   directorio_padre_glassfish   = "C:\\Users\\Edgar\\AppData\\Roaming\\NetBeans\\8.0.2\\config\\GF_4.0\\";
//    public  static String   directorio_bin_pg            = "C:\\Program Files\\PostgreSQL\\9.3\\bin";
    // public  static String   dir_base_tmp_scrip_usr      = "E:\\Temp\\Proyectos\\Modulos_protpanel\\web\\usuarios_host\\temp\\";
  //public  static String   dir_base_war_app_usuario    = "/opt/glassfish4/glassfish/domains/domain1/applications/users/usuario1/"; 

    
    
    public static String    email_administrador="Kapiasoft.host@gmail.com";
    public static String    email_cliente="Kapiasoft.host@gmail.com";
    public static String    email_servidor="administrador@Kapiasoft.host.com";
    public static String    usuario_email_servidor = "administrador";
    //public static String    host="Kapiasoft.com";
    public static String    host ="138.68.13.48";
    public static String    puerto_pg="5432";
    public static String    dns_host ="http://www.Kapiasoft.com/Prot_panel_hostv3";
    public static int       tiempo_enlace=3600000;  //milisegundos
    //public  static String directorio = new File("").getAbsolutePath()+"\\";
        
    public  static String  driver_pg    = "org.postgresql.Driver";
    public  static String  url_pg_temp  = "jdbc:postgresql://localhost:5432/";
    public  static String  usuario      = "postgres";
    public  static String  clave        = "123456";
    public static int anio_actual=2017;
    public  static String  url_app        = "http://138.68.13.48:8080/Prot_panel_host5/";
    public ResourceBundle getConfiguracion() {
        return Configuracion;
    }

    public void setConfiguracion(ResourceBundle Configuracion) {
        this.Configuracion = Configuracion;
    }
   
    /**
     * @return the URL
     */

}
