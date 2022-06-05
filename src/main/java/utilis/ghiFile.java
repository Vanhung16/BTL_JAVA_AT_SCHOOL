/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilis;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Admin
 */
public class ghiFile {
    public static void GhiFile(String path, XSSFWorkbook workbook){
        File file = new File("path");
        try {
            
            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException ex) {
            Logger.getLogger(ghiFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
