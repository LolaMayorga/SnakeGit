package snake;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class Ventana extends javax.swing.JFrame implements ActionListener{
    private Snake snake= new Snake();
    Comida comida= new Comida();
    MiCanvas canvas= new MiCanvas(snake,comida);
    Timer timerSnake= new Timer(150,this);
    Timer timerComida= new Timer(5000,this);
    public Ventana() {
        initComponents();
      
        this.getContentPane().add(canvas);
        timerSnake.start();
        timerComida.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(416, 438));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables


    

    @Override
    public void actionPerformed(ActionEvent e) {
     Timer t= (Timer)e.getSource();
     if (t.getDelay()==timerComida.getDelay())
               comida.nuevaComida();
     
     if (snake.getMov()=='L')
     {   snake.left();
         canvas.repaint();
     }
     if (snake.getMov()=='R')
     {   snake.right();
         canvas.repaint();
     }
     if (snake.getMov()=='U')
     {   snake.up();
         canvas.repaint();
     }
     if (snake.getMov()=='D')
     {   snake.down();
         canvas.repaint();
     }
    }


   
}
