/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilis;

import java.awt.Window;
import view.Login.Login;

/**
 *
 * @author XuanHoang
 */
public class Logout {

    public static void execute(Window frame) {
        Global.idLogin = 0;
        frame.dispose();
        Login loginScreen = new Login();
        loginScreen = (Login) CenterScreen.centerWindow(loginScreen);
        loginScreen.show();
        loginScreen.setTitle("Đăng nhập hệ thống");
    }
}
