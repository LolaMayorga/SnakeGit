package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Comida {

    private Rectangle r;
    private  int lado=10;
   int x;
    int y;
    Comida()
    {   x=(int)(Math.random()*30)*10;
        y=(int)(Math.random()*30)*10;
        r=new Rectangle(x,y, lado,lado );
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void draw(Graphics g)
    {   if (r==null) return;
        g.setColor(Color.BLUE);
        g.fillRect(r.x, r.y, lado, lado);
    }
    public void nuevaComida()
    {   x=(int)(Math.random()*30)*10;
        y=(int)(Math.random()*30)*10;
        r=new Rectangle(x,y, lado,lado );
    }
    public void ocultaComida()
    {
        r=null;
        x=-1;
        y=-1;
        return;
    }
}
