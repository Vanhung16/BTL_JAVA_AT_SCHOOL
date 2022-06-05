/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilis;

import java.awt.Window;
import view.AdminHome.Home;
import view.StudentHome.StudentScreen_Home;

/**
 *
 * @author XuanHoang
 */
public class BackHome {

    public static void admin(Window frame) {
        frame.dispose();
        Home homeScreen = new Home();
        homeScreen = (Home) CenterScreen.centerWindow(homeScreen);
        homeScreen.show();
        homeScreen.setTitle("Trang chủ quản trị");
    }
    
    public static void client(Window frame){
        frame.dispose();
        StudentScreen_Home home = new StudentScreen_Home();
        home = (StudentScreen_Home) CenterScreen.centerWindow(home);
        home.show();
        home.setTitle("Trang chủ sinh viên");
    }
}
