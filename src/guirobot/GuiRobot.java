/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guirobot;

/**
 *
 * @author 7FPROG07
 */
public class GuiRobot {

    /**
     * @param args the command line arguments
     */
    public static PanelMovimientos pm = new PanelMovimientos();
    //public static PlayerInit pi=new PlayerInit();
    

   

    public static void start() {
        pm.setVisible(true);
        GuiRobot.pm.getjLabel3().setVisible(true);
        //pi.setVisible();
	
       
    }

    public static void main(String[] args) {
        start();
	

    }

}
