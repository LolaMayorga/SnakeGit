package snake;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MiCanvas extends Canvas implements KeyListener{
    
    private Snake snake;
    Comida comida;
    
    MiCanvas(Snake snake, Comida comida)
    {
        this.snake=snake;
        this.comida=comida;
        this.setBackground(Color.white);
        this.setBounds(50,50,300,300);
          this.addKeyListener(this);
          //Modificado desde github
        
   }
   public void paint(Graphics g)
    {
      if (comida.getX()==snake.getxCabeza()&&comida.getY()==snake.getyCabeza())  
      {    snake.setCrece();
           comida.ocultaComida();
      }
        snake.draw(g);
        comida.draw(g);
    }
   @Override
    public void keyPressed(KeyEvent e) {
     int key= e.getKeyCode();
     if (key==KeyEvent.VK_LEFT)
     {   
//         snake.left();
         snake.setMov('L');
         repaint();
     }
     if (key==KeyEvent.VK_RIGHT)
     {  
//         snake.right();
         snake.setMov('R');
         repaint();
     }
     if (key==KeyEvent.VK_UP)
     {  
//         snake.up();
         snake.setMov('U');
         repaint();
     }
     if (key==KeyEvent.VK_DOWN)
     {  
//         snake.down();
         snake.setMov('D');
        repaint();
     }
    }
   
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
