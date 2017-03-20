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
    public static Player p1 = new Player();

    public static Player p2 = new Player();

    public static void start() {
        pm.setVisible(true);
        p1.setVisible(true);
        p1.setJugador(1);
        p2.setVisible(true);
        p2.setJugador(2);
    }

    public static void main(String[] args) {
        start();

    }

}
