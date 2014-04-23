package snake;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Snake {
    LinkedList <Rectangle> snake= new LinkedList();
    int lado=10;
    int body=3;
    char mov=' ';
    boolean crece;
    int xCabeza, yCabeza;

    Snake()
    {   int x=150;
        int y=150;
        xCabeza=x;
        yCabeza=y;
        for (int i=0; i<body; i++)
        {
            Rectangle r= new Rectangle(x,y,lado,lado);
            snake.add(r);
            y+=10;
        }
        crece=false;
    }
    public void draw (Graphics g)
    {
        for (int i=0; i<snake.size(); i++)
        {
            g.setColor(Color.red);
            Rectangle r=snake.get(i);
            g.fillRect(r.x, r.y, r.width, r.height);
        }
    }
    public void left ()
    {
        Rectangle r= new Rectangle(snake.getFirst()); //Ojo, hay que crear nuevo rectángulo
        r.x=r.x-lado;
        if (r.x<0)
            r.x=300-lado;
        xCabeza=r.x;
        yCabeza=r.y;
        snake.add(0, r);
        if (this.snake.size()>body)
            snake.removeLast();
    }
    public void right()
    {
        Rectangle r= new Rectangle(snake.getFirst()); //Ojo, hay que crear nuevo rectángulo
        r.x=r.x+lado;
        if (r.x>=300)
            r.x=0;
        xCabeza=r.x;
        yCabeza=r.y;
        snake.add(0, r);
        if (this.snake.size()>body)
            snake.removeLast();
    }
    public void up()
    {
        Rectangle r= new Rectangle(snake.getFirst()); //Ojo, hay que crear nuevo rectángulo
        r.y=r.y-lado;
        if (r.y<0)
            r.y=300-lado;
        xCabeza=r.x;
        yCabeza=r.y;
        snake.add(0, r);
        if (this.snake.size()>body)
            snake.removeLast();
    }
    public void down()
    {
        Rectangle r= new Rectangle(snake.getFirst()); //Ojo, hay que crear nuevo rectángulo
        r.y=r.y+lado;
        if (r.y>=300)
            r.y=0;
        xCabeza=r.x;
        yCabeza=r.y;
        snake.add(0, r);
        if (this.snake.size()>body)
            snake.removeLast();
    }
    public void setCrece() {
        body++;
    }
    public int getxCabeza() {
        return xCabeza;
    }
    public int getyCabeza() {
        return yCabeza;
    }
    public char getMov() {
        return mov;
    }
    public void setMov(char mov) {
        this.mov = mov;
    }
}

