/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilis;

import java.awt.Window;
import view.AdminHome.Home;

/**
 *
 * @author XuanHoang
 */
public class BackHomeAdmin {

    public static void excute(Window frame) {
        frame.dispose();
        Home homeScreen = new Home();
        homeScreen = (Home) CenterScreen.centerWindow(homeScreen);
        homeScreen.show();
    }
}
