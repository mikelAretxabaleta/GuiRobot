/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guirobot;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 *
 * @author 7FPROG07
 */
public class PanelMovimientos extends javax.swing.JFrame {

	
    
    
    private int jLabel3set=0;
    private int jLabel4set=0;
    private int jLabel5set=0;
    private int jLabel6set=0;
    private int jLabel8set=0;
    private int jLabel9set=0;
    private int jLabel10set=0;
    private int jLabel11set=0;
    private int contador1=0;
    private int contador2=0;
    
    
    
    /**
     * Creates new form PanelMovimientos
     */
    public PanelMovimientos() {
		
        
	  
       
	    
	
       
        
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel7 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel1 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                jOptionPane1 = new javax.swing.JOptionPane();
                jLabel8 = new javax.swing.JLabel();
                jLabel9 = new javax.swing.JLabel();
                jLabel10 = new javax.swing.JLabel();
                jLabel11 = new javax.swing.JLabel();
                jLabel12 = new javax.swing.JLabel();
                jLabel13 = new javax.swing.JLabel();
                jLabel14 = new javax.swing.JLabel();
                jLabel15 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(52, 45, 201));
                setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
                setMaximumSize(new java.awt.Dimension(750, 750));
                setMinimumSize(new java.awt.Dimension(750, 750));
                setResizable(false);
                setSize(new java.awt.Dimension(750, 750));
                addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyTyped(java.awt.event.KeyEvent evt) {
                                formKeyTyped(evt);
                        }
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                formKeyPressed(evt);
                        }
                });

                jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/sky.png"))); // NOI18N

                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/robot.png"))); // NOI18N
                jLabel2.setFocusCycleRoot(true);
                jLabel2.setFocusTraversalPolicyProvider(true);
                jLabel2.setNextFocusableComponent(jLabel2);
                jLabel2.setOpaque(true);

                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/robot.png"))); // NOI18N
                jLabel1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
                jLabel1.setOpaque(true);

                jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
                jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel3.setMinimumSize(new java.awt.Dimension(0, 0));
                jLabel3.setPreferredSize(new java.awt.Dimension(0, 0));

                jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel4.setPreferredSize(new java.awt.Dimension(0, 0));

                jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel5.setPreferredSize(new java.awt.Dimension(0, 0));

                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel6.setPreferredSize(new java.awt.Dimension(0, 0));

                jOptionPane1.setMessage("You win!!!!");

                jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel8.setText("jLabel8");

                jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel9.setText("jLabel9");

                jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel10.setText("jLabel10");

                jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guirobot/fire.png"))); // NOI18N
                jLabel11.setText("jLabel11");

                jLabel12.setFont(new java.awt.Font("Cantarell", 0, 100)); // NOI18N
                jLabel12.setText("Jugador 1");

                jLabel13.setFont(new java.awt.Font("Cantarell", 0, 100)); // NOI18N
                jLabel13.setText("Jugador 2");

                jLabel14.setFont(new java.awt.Font("Cantarell", 0, 200)); // NOI18N
                jLabel14.setForeground(new java.awt.Color(40, 172, 30));
                jLabel14.setText("0");

                jLabel15.setFont(new java.awt.Font("Cantarell", 0, 200)); // NOI18N
                jLabel15.setForeground(new java.awt.Color(154, 14, 42));
                jLabel15.setText("0");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(210, 210, 210)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(150, 150, 150)
                                                                .addComponent(jLabel11))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(153, 153, 153)
                                                                .addComponent(jLabel13))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(28, 28, 28)
                                                                .addComponent(jLabel10))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(110, 110, 110)
                                                                .addComponent(jLabel14)
                                                                .addGap(116, 116, 116)
                                                                .addComponent(jLabel15)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 1293, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(274, 274, 274)
                                                .addComponent(jLabel12)))
                                .addGap(3024, 3024, 3024))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jLabel9)
                                .addGap(33, 33, 33)
                                .addComponent(jOptionPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13)
                                .addGap(74, 74, 74)
                                .addComponent(jLabel12)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel14)
                                .addGap(66, 66, 66))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(196, 196, 196)
                                                .addComponent(jLabel10)
                                                .addGap(189, 189, 189)
                                                .addComponent(jLabel11)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15)
                                .addGap(42, 42, 42))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        int c = evt.getKeyCode();
	
	//JUGADOR 1
	
        if( c == java.awt.event.KeyEvent.VK_P){
          if (GuiRobot.pm.getjLabel2().getLocation().x<675 && GuiRobot.pm.getjLabel2().getLocation().x>=0)
        GuiRobot.pm.getjLabel2().setLocation((GuiRobot.pm.getjLabel2().getLocation().x+75), GuiRobot.pm.getjLabel2().getLocation().y);  
        }
        
        
        if( c == java.awt.event.KeyEvent.VK_O){
        if (GuiRobot.pm.getjLabel2().getLocation().x<=750 && GuiRobot.pm.getjLabel2().getLocation().x>74)
        GuiRobot.pm.getjLabel2().setLocation((GuiRobot.pm.getjLabel2().getLocation().x-75), GuiRobot.pm.getjLabel2().getLocation().y);
        }
        if( c == java.awt.event.KeyEvent.VK_A){
        if (GuiRobot.pm.getjLabel2().getLocation().y<675 && GuiRobot.pm.getjLabel2().getLocation().y>=0)
        GuiRobot.pm.getjLabel2().setLocation((GuiRobot.pm.getjLabel2().getLocation().x), GuiRobot.pm.getjLabel2().getLocation().y+75);    
        }
        if( c == java.awt.event.KeyEvent.VK_Q){
        if (GuiRobot.pm.getjLabel2().getLocation().y<=750 && GuiRobot.pm.getjLabel2().getLocation().y>74)
        GuiRobot.pm.getjLabel2().setLocation((GuiRobot.pm.getjLabel2().getLocation().x), GuiRobot.pm.getjLabel2().getLocation().y-75);
        }
        if( c == java.awt.event.KeyEvent.VK_SPACE){
        if (jLabel3set==0){
		
        GuiRobot.pm.jLabel3.reshape((GuiRobot.pm.getjLabel2().getLocation().x+75), GuiRobot.pm.getjLabel2().getLocation().y, 75, 75);
	jLabel3set=1;
	timer1.start();
	}
	else if (jLabel4set==0){
        GuiRobot.pm.jLabel4.reshape((GuiRobot.pm.getjLabel2().getLocation().x+75), GuiRobot.pm.getjLabel2().getLocation().y, 75, 75);
	jLabel4set=1;
	timer2.start();
	}
	else if (jLabel5set==0){
        GuiRobot.pm.jLabel5.reshape((GuiRobot.pm.getjLabel2().getLocation().x+75), GuiRobot.pm.getjLabel2().getLocation().y, 75, 75);
	jLabel5set=1;
	timer3.start();
	}
	else if (jLabel6set==0){
        GuiRobot.pm.jLabel6.reshape((GuiRobot.pm.getjLabel2().getLocation().x+75), GuiRobot.pm.getjLabel2().getLocation().y, 75, 75);
	jLabel6set=1;
	timer4.start();
	}
	else {jLabel3set=0;
              jLabel4set=0;
              jLabel5set=0;
              jLabel6set=0;}
	
        }
	
	//JUGADOR 2
	
	if( c == java.awt.event.KeyEvent.VK_RIGHT){
          if (GuiRobot.pm.getjLabel1().getLocation().x<675 && GuiRobot.pm.getjLabel1().getLocation().x>=0)
        GuiRobot.pm.getjLabel1().setLocation((GuiRobot.pm.getjLabel1().getLocation().x+75), GuiRobot.pm.getjLabel1().getLocation().y);  
        }
        
        
        if( c == java.awt.event.KeyEvent.VK_LEFT){
        if (GuiRobot.pm.getjLabel1().getLocation().x<=750 && GuiRobot.pm.getjLabel1().getLocation().x>74)
        GuiRobot.pm.getjLabel1().setLocation((GuiRobot.pm.getjLabel1().getLocation().x-75), GuiRobot.pm.getjLabel1().getLocation().y);
        }
        if( c == java.awt.event.KeyEvent.VK_DOWN){
        if (GuiRobot.pm.getjLabel1().getLocation().y<675 && GuiRobot.pm.getjLabel1().getLocation().y>=0)
        GuiRobot.pm.getjLabel1().setLocation((GuiRobot.pm.getjLabel1().getLocation().x), GuiRobot.pm.getjLabel1().getLocation().y+75);    
        }
        if( c == java.awt.event.KeyEvent.VK_UP){
        if (GuiRobot.pm.getjLabel1().getLocation().y<=750 && GuiRobot.pm.getjLabel1().getLocation().y>74)
        GuiRobot.pm.getjLabel1().setLocation((GuiRobot.pm.getjLabel1().getLocation().x), GuiRobot.pm.getjLabel1().getLocation().y-75);
        }
        if( c == java.awt.event.KeyEvent.VK_ENTER){
        if (jLabel8set==0){
		
        GuiRobot.pm.jLabel8.reshape((GuiRobot.pm.getjLabel1().getLocation().x-75), GuiRobot.pm.getjLabel1().getLocation().y, 75, 75);
	jLabel8set=1;
	timer5.start();
	}
	else if (jLabel9set==0){
        GuiRobot.pm.jLabel9.reshape((GuiRobot.pm.getjLabel1().getLocation().x-75), GuiRobot.pm.getjLabel1().getLocation().y, 75, 75);
	jLabel9set=1;
	timer6.start();
	}
	else if (jLabel10set==0){
        GuiRobot.pm.jLabel10.reshape((GuiRobot.pm.getjLabel1().getLocation().x-75), GuiRobot.pm.getjLabel1().getLocation().y, 75, 75);
	jLabel10set=1;
	timer7.start();
	}
	else if (jLabel11set==0){
        GuiRobot.pm.jLabel11.reshape((GuiRobot.pm.getjLabel1().getLocation().x-75), GuiRobot.pm.getjLabel1().getLocation().y, 75, 75);
	jLabel11set=1;
	timer8.start();
	}
	else {jLabel8set=0;
              jLabel9set=0;
              jLabel10set=0;
              jLabel11set=0;}
	
        }
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
       
    }//GEN-LAST:event_formKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelMovimientos().setVisible(true);
            }
        });
    }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel12;
        private javax.swing.JLabel jLabel13;
        private javax.swing.JLabel jLabel14;
        private javax.swing.JLabel jLabel15;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JOptionPane jOptionPane1;
        // End of variables declaration//GEN-END:variables

	public JLabel getjLabel1() {
		return jLabel1;
	}

	public void setjLabel1(JLabel jLabel1) {
		this.jLabel1 = jLabel1;
	}

	public JLabel getjLabel2() {
		return jLabel2;
	}

	public void setjLabel2(JLabel jLabel2) {
		this.jLabel2 = jLabel2;
	}

    public JLabel getjLabel3() {
        return jLabel3;
    }
    

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

	public JLabel getjLabel4() {
		return jLabel4;
	}

	public void setjLabel4(JLabel jLabel4) {
		this.jLabel4 = jLabel4;
	}

	public JLabel getjLabel5() {
		return jLabel5;
	}

	public void setjLabel5(JLabel jLabel5) {
		this.jLabel5 = jLabel5;
	}

	public JLabel getjLabel6() {
		return jLabel6;
	}

	public void setjLabel6(JLabel jLabel6) {
		this.jLabel6 = jLabel6;
	}

	public JLabel getjLabel7() {
		return jLabel7;
	}

	public void setjLabel7(JLabel jLabel7) {
		this.jLabel7 = jLabel7;
	}

	public JOptionPane getjOptionPane1() {
		return jOptionPane1;
	}

	public void setjOptionPane1(JOptionPane jOptionPane1) {
		this.jOptionPane1 = jOptionPane1;
	}

	public JLabel getjLabel10() {
		return jLabel10;
	}

	public void setjLabel10(JLabel jLabel10) {
		this.jLabel10 = jLabel10;
	}

	public JLabel getjLabel11() {
		return jLabel11;
	}

	public void setjLabel11(JLabel jLabel11) {
		this.jLabel11 = jLabel11;
	}

	public JLabel getjLabel8() {
		return jLabel8;
	}

	public void setjLabel8(JLabel jLabel8) {
		this.jLabel8 = jLabel8;
	}

	public JLabel getjLabel9() {
		return jLabel9;
	}

	public void setjLabel9(JLabel jLabel9) {
		this.jLabel9 = jLabel9;
	}

	public JLabel getjLabel12() {
		return jLabel12;
	}

	public void setjLabel12(JLabel jLabel12) {
		this.jLabel12 = jLabel12;
	}

	public JLabel getjLabel13() {
		return jLabel13;
	}

	public void setjLabel13(JLabel jLabel13) {
		this.jLabel13 = jLabel13;
	}

	public JLabel getjLabel14() {
		return jLabel14;
	}

	public void setjLabel14(JLabel jLabel14) {
		this.jLabel14 = jLabel14;
	}

	public JLabel getjLabel15() {
		return jLabel15;
	}

	public void setjLabel15(JLabel jLabel15) {
		this.jLabel15 = jLabel15;
	}

	public int getContador1() {
		return contador1;
	}

	public void setContador1(int contador1) {
		this.contador1 = contador1;
	}

	public int getContador2() {
		return contador2;
	}

	public void setContador2(int contador2) {
		this.contador2 = contador2;
	}

	

	

	
    

    
        
		
	ActionListener al1=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel3.reshape((GuiRobot.pm.getjLabel3().getLocation().x+75), GuiRobot.pm.getjLabel3().getLocation().y, 75, 75);
		if(GuiRobot.pm.getjLabel3().getLocation().x==GuiRobot.pm.getjLabel1().getLocation().x &&  GuiRobot.pm.getjLabel3().getLocation().y==GuiRobot.pm.getjLabel1().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER1 WINS!!!!"); contador1++;jLabel14.setText(String.valueOf(getContador1()));}
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer1 = new Timer(200, al1);
    
	ActionListener al2=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel4.reshape((GuiRobot.pm.getjLabel4().getLocation().x+75), GuiRobot.pm.getjLabel4().getLocation().y, 75, 75);
                if(GuiRobot.pm.getjLabel4().getLocation().x==GuiRobot.pm.getjLabel1().getLocation().x &&  GuiRobot.pm.getjLabel4().getLocation().y==GuiRobot.pm.getjLabel1().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER1 WINS!!!!");contador1++; jLabel14.setText(String.valueOf(getContador1()));}		
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer2 = new Timer(200, al2);
    
	ActionListener al3=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel5.reshape((GuiRobot.pm.getjLabel5().getLocation().x+75), GuiRobot.pm.getjLabel5().getLocation().y, 75, 75);
                if(GuiRobot.pm.getjLabel5().getLocation().x==GuiRobot.pm.getjLabel1().getLocation().x &&  GuiRobot.pm.getjLabel5().getLocation().y==GuiRobot.pm.getjLabel1().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER1 WINS!!!!");contador1++;jLabel14.setText(String.valueOf(getContador1()));}		
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer3 = new Timer(200, al3);

	ActionListener al4=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel6.reshape((GuiRobot.pm.getjLabel6().getLocation().x+75), GuiRobot.pm.getjLabel6().getLocation().y, 75, 75);
                if(GuiRobot.pm.getjLabel6().getLocation().x==GuiRobot.pm.getjLabel1().getLocation().x &&  GuiRobot.pm.getjLabel6().getLocation().y==GuiRobot.pm.getjLabel1().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER1 WINS!!!!");contador1++;jLabel14.setText(String.valueOf(getContador1()));}		
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer4 = new Timer(200, al4);
    
        //PLAYER 2
	
	ActionListener al5=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel8.reshape((GuiRobot.pm.getjLabel8().getLocation().x-75), GuiRobot.pm.getjLabel8().getLocation().y, 75, 75);
		if(GuiRobot.pm.getjLabel8().getLocation().x==GuiRobot.pm.getjLabel2().getLocation().x &&  GuiRobot.pm.getjLabel8().getLocation().y==GuiRobot.pm.getjLabel2().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER2 WINS!!!!");contador2++;jLabel15.setText(String.valueOf(getContador2()));}
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer5 = new Timer(200, al5);
    
	ActionListener al6=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel9.reshape((GuiRobot.pm.getjLabel9().getLocation().x-75), GuiRobot.pm.getjLabel9().getLocation().y, 75, 75);
                if(GuiRobot.pm.getjLabel9().getLocation().x==GuiRobot.pm.getjLabel2().getLocation().x &&  GuiRobot.pm.getjLabel9().getLocation().y==GuiRobot.pm.getjLabel2().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER2 WINS!!!!");contador2++;jLabel15.setText(String.valueOf(getContador2()));}		
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer6 = new Timer(200, al6);
    
	ActionListener al7=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel10.reshape((GuiRobot.pm.getjLabel10().getLocation().x-75), GuiRobot.pm.getjLabel10().getLocation().y, 75, 75);
                if(GuiRobot.pm.getjLabel10().getLocation().x==GuiRobot.pm.getjLabel2().getLocation().x &&  GuiRobot.pm.getjLabel10().getLocation().y==GuiRobot.pm.getjLabel2().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER2 WINS!!!!");contador2++;jLabel15.setText(String.valueOf(getContador2()));}		
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer7 = new Timer(200, al7);

	ActionListener al8=new ActionListener() {
	@Override
	public void actionPerformed(ActionEvent e) {
		GuiRobot.pm.jLabel11.reshape((GuiRobot.pm.getjLabel11().getLocation().x-75), GuiRobot.pm.getjLabel11().getLocation().y, 75, 75);
                if(GuiRobot.pm.getjLabel11().getLocation().x==GuiRobot.pm.getjLabel2().getLocation().x &&  GuiRobot.pm.getjLabel11().getLocation().y==GuiRobot.pm.getjLabel2().getLocation().y)
		{JOptionPane.showMessageDialog(GuiRobot.pm, "PLAYER2 WINS!!!!");contador2++;jLabel15.setText(String.valueOf(getContador2()));}		
//To change body of generated methods, choose Tools | Templates.
	}};
	Timer timer8 = new Timer(200, al8);



}
