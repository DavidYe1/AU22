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

    /**
     * Konstruktor
     * @param c farbauswahl
     * @param x x koord
     * @param y y koord
     * @param w weite
     * @param h hoehe
     */
    public Oval(Color c,int x, int y, int w,int h){
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }

    /**
     * zeichnet eine ellipse
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        g.drawOval(x,y,w,h);
    }

    /**
     * kopiert die ellipse
     * @return Oval()
     */
    @Override
    public Drawable clone() {
        return new  Oval(this.c,this.x+this.x*2,this.y+this.y*2,this.w,this.h);
    }
}

