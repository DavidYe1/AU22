import java.awt.*;

/**
 * Created by @Autor DavidYe on @Version 27.04.2017.
 */
public class Line extends Drawable {
    Color c;
    int x1;
    int x2;
    int y1;
    int y2;

    /**
     * Konstruktor
     * @param c fuer farbauswahl
     * @param x1 x fuer punkt 1
     * @param y1 y fuer punkt 1
     * @param x2 x fuer punkt 2
     * @param y2 y fuer punkt 2
     */
    public Line(Color c,int x1, int y1, int x2, int y2){
        this.c = c;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    /**
     * Zeichnet eine linie
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    /**
     * macht eine kopie vom original um 10 verschoben
     * @return Linie()
     */
    @Override
    public Drawable clone() {
        return new Line(this.c,this.x1+10,this.y1+10,this.x2+10,this.y2+10);
    }
}
