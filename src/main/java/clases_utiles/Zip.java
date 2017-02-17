package clases_utiles;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import java.io.*;
import java.util.zip.*;

/**
 * Archivo comprimido, descomprimir el archivo comprimido
 * @author HHF 
 * El 30 de diciembre de 2014
 */
public class Zip {

        
	/**
	 * @param srcfile: Archivo de código fuente de la lista
	 * @param zipfile: Archivo
	 */
    public static void zipFiles(File[] srcfile, File zipfile) {
        byte[] buf = new byte[1024];
        try {
            // ZipOutputStream: completar el archivo o carpeta comprimir
            ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipfile));
            for (int i = 0; i < srcfile.length; i++) {
                FileInputStream in = new FileInputStream(srcfile[i]);
                out.putNextEntry(new ZipEntry(srcfile[i].getName()));
                int len;
                while ((len = in.read(buf)) > 0) {
                    out.write(buf, 0, len);
                }
                out.closeEntry();
                in.close();
            }
            out.close();
            System.out.println("Comprimido.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param zipfile: La necesidad de descomprimir el archivo
     * @param descDir: El Directorio de destino tras la extracción de la
     * @throws IOException
     */
    @SuppressWarnings("rawtypes")
    public static void unZipFiles(File zipfile, String descDir) {
        File file = new File(descDir);
        if (!file.exists()) {
            try {
                file.mkdir();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            ZipFile zf = new ZipFile(zipfile);
            for (Enumeration entries = zf.entries(); entries.hasMoreElements();) {
                ZipEntry entry = (ZipEntry) entries.nextElement();
                String zipEntryName = entry.getName();
                InputStream in = zf.getInputStream(entry);
                OutputStream out = new FileOutputStream(descDir + zipEntryName);
                byte[] buf1 = new byte[1024];
                int len;
                while ((len = in.read(buf1)) > 0) {
                    out.write(buf1, 0, len);
                }
                in.close();
                out.close();
                System.out.println("Descompresión completa.");
            }

            zf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    final static int BUFFER = 2048;

    public static void unzip(String ubicacion, String archivo_objetivo) {
        try {
            File dirDestino = new File(archivo_objetivo);
            //String separador = "/"; //linux
            String separador = "\\"; //windows
            String ruta = "";
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(ubicacion);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
            FileOutputStream fos = null;
            ZipEntry entry;
            int count;
            int index = 0;
            byte data[] = new byte[BUFFER];
            String rutaarchivo = null;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.print("\nExtracting: " + entry);
                rutaarchivo = entry.getName();
                // tenemos que quitar el primer directorio
                index = rutaarchivo.indexOf(separador);
                rutaarchivo = rutaarchivo.substring(index + 1);
                if (rutaarchivo.trim().length() > 0) {
                    // write the files to the disk
                    try {
                        dest = null;
                        //ruta = dirDestino.getAbsolutePath() + separador + rutaarchivo;
                        ruta = ubicacion + separador + rutaarchivo;
                        ruta = ruta.replace('/', '\\');//windows
                        //ruta=ruta.replace('\\','/' );//linux
                        ruta = ruta.replaceAll(".zip", "");

                        File fileDest = new File(ruta);

                        System.out.print("\nDestino: " + ruta);
                        if (entry.isDirectory()) {
                            fileDest.mkdirs();
                            System.out.println("-------directorio: ");
                        } else {
                            if (fileDest.getParentFile().exists() == false) {
                                fileDest.getParentFile().mkdirs();
                            }
                            System.out.print("-------archivo: ");
                            try {
                                    fileDest.createNewFile();
                                    fos = new FileOutputStream(fileDest);
                                    dest = new BufferedOutputStream(fos, BUFFER);
                                    while ((count = zis.read(data, 0, BUFFER)) != -1) {
                                        dest.write(data, 0, count);
                                    }
                                    dest.flush();
                                 
                            } catch (Exception ex) {
                                System.out.print("\nError " + ex.getMessage());
                            }
                        }
                    } finally {
                        try {
                            if (dest != null) {
                                dest.close();
                            }
                        } catch (Exception e) {;
                        }
                    }
                }
            }
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
    public static void unzipLinux(String ubicacion, String archivo_objetivo) {
        try {
            File dirDestino = new File(archivo_objetivo);
            String separador = "/"; //linux
            //String separador = "\\"; //windows
            String ruta = "";
            BufferedOutputStream dest = null;
            FileInputStream fis = new FileInputStream(ubicacion);
            ZipInputStream zis = new ZipInputStream(new BufferedInputStream(fis));
            FileOutputStream fos = null;
            ZipEntry entry;
            int count;
            int index = 0;
            byte data[] = new byte[BUFFER];
            String rutaarchivo = null;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.print("\nExtracting: " + entry);
                rutaarchivo = entry.getName();
                // tenemos que quitar el primer directorio
                index = rutaarchivo.indexOf(separador);
                rutaarchivo = rutaarchivo.substring(index + 1);
                if (rutaarchivo.trim().length() > 0) {
                    // write the files to the disk
                    try {
                        dest = null;
                        //ruta = dirDestino.getAbsolutePath() + separador + rutaarchivo;
                        ruta = ubicacion + separador + rutaarchivo;
                        //ruta = ruta.replace('/', '\\');//windows
                        ruta=ruta.replace('\\','/' );//linux
                        ruta = ruta.replaceAll(".zip", "");

                        File fileDest = new File(ruta);

                        System.out.print("\nDestino: " + ruta);
                        if (entry.isDirectory()) {
                            fileDest.mkdirs();
                            System.out.println("-------directorio: ");
                        } else {
                            if (fileDest.getParentFile().exists() == false) {
                                fileDest.getParentFile().mkdirs();
                            }
                            System.out.print("-------archivo: ");
                            try {
                                    fileDest.createNewFile();
                                    fos = new FileOutputStream(fileDest);
                                    dest = new BufferedOutputStream(fos, BUFFER);
                                    while ((count = zis.read(data, 0, BUFFER)) != -1) {
                                        dest.write(data, 0, count);
                                    }
                                    dest.flush();
                                 
                            } catch (Exception ex) {
                                System.out.print("\nError " + ex.getMessage());
                            }
                        }
                    } finally {
                        try {
                            if (dest != null) {
                                dest.close();
                            }
                        } catch (Exception e) {;
                        }
                    }
                }
            }
            zis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       
       
} 
        


