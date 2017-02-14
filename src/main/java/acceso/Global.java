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

    //LINUX
    public  static String   dir_base_aplicacion = "/opt/glassfish4/glassfish/domains/domain1/applications/Prot_Panel_hostv3/"; 
    public  static String   dir_base_war_aplicacion = "/opt/glassfish4/glassfish/domains/domain1/applications/"; 
    public  static String   dir_repositorio_svn  = "/home/usuarios_host/repos/";
    public  static String   dir_repositorio_git  = "/home/usuarios_host/git/";
    public  static String   dir_base_usuario = "/home/usuarios_host/"; 
    public  static String   dir_base_apli_usuario = "/home/usuarios_host/repos/";
    public  static String   dir_base_war_usuario = "/opt/glassfish4/glassfish/domains/domain1/applications/users/"; 
    
        
    public static String    email_administrador="Kapiasoft.host@gmail.com";
    public static String    email_cliente="Kapiasoft.host@gmail.com";
    public static String    email_servidor="administrador@Kapiasoft.host.com";
    public static String    usuario_email_servidor = "administrador";
    public static String    url_panel="http://localhost:8080/Prot_panel_host5/";
    
    public static String    url_panel_local="file:///C:/Users/Edgar/Desktop/";
    public static String    ext=".jsf";
    //public static String    host="Kapiasoft.com";
    public static String    host="Kapiasoft.com";
    //public static String    dns_host ="http://www.Kapiasoft.com/Prot_panel_host5";
    public static int       tiempo_enlace=3600000;  //milisegundos
    //public  static String directorio = new File("").getAbsolutePath()+"\\";
    
    //pruebas
    
   public static String    gecodriver="H:\\tesis 3\\herramientas\\geckodriver-v0.14.0-win64\\geckodriver.exe";
    
    
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
