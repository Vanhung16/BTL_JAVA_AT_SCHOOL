/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilis;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JOptionPane;
import view.Login.Login;

/**
 *
 * @author XuanHoang
 */
public class ProtectScreen {

    public static Window protectScreen(Window frame) {
        if (Global.idLogin == 0) {
            frame.dispose();

            JOptionPane.showMessageDialog(frame, "Yêu cầu đăng nhập để truy cập !",
                    "ERROR", JOptionPane.ERROR_MESSAGE);
            Login loginScreen = new Login();
            loginScreen = (Login) CenterScreen.centerWindow(loginScreen);
            loginScreen.show();
            return null;
        } else {
            return frame;
        }
    }
}
