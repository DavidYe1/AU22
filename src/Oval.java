import java.awt.*;

/**
 * Created by @Autor DavidYe on @Version 27.04.2017.
 */
public class Oval extends  Drawable{
        Color c;
        int x;
        int y;
        int w;
        int h;
    public Oval(Color c,int x, int y, int w,int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    @Override
    public void draw(Graphics g) {
        g.drawOval(x,y,w,h);
    }

    @Override
    public Drawable clone() {
        return new  Oval(this.c,this.x+this.x*2,this.y+this.y*2,this.w,this.h);
    }
}

