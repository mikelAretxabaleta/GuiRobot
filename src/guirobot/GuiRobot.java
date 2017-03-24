/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guirobot;

import java.awt.Color;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.*;

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
	
	//pm.getContentPane().setBackground(Color.blue);
        
	pm.setContentPane(pm.getjLabel7());
	pm.getContentPane().add(pm.getjLabel2()).setBounds(0, 0, 75, 75);
	pm.getContentPane().add(pm.getjLabel1()).setBounds(675, 675, 75, 75);
	pm.getContentPane().add(pm.getjLabel1()).setLocation(675, 675);
	pm.getContentPane().add(pm.getjLabel3()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel4()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel5()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel6()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel8()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel9()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel10()).setBounds(0, 0, 0, 0);
	pm.getContentPane().add(pm.getjLabel11()).setBounds(0, 0, 0, 0);
	pm.getContentPane().setBounds(0, 0, 750, 750);
	pm.setBounds(0, 0, 750, 875);
	/*
	BufferedImage img = null;
try {
    img = ImageIO.read(new File("sky.png"));
} catch (IOException e) {
}
	pm.setIconImage(img);
	  
		
*/

//pi.setVisible();
	
       
    }

    public static void main(String[] args) {
        start();
	

    }

}
