import java.awt.*;

/**
 * Created by @Autor DavidYe on @Version 27.04.2017.
 */
public class Polygon extends Drawable {
    Color c;
    int [] x;
    int [] y;
    int n;

    /**
     * Konstrucktor
     * @param c farbauswahl
     * @param x x koord
     * @param y y koord
     * @param n eckanzahl
     */
    public Polygon(Color c,int[] x, int[] y, int n){
        this.n=n;
        this.x=x;
        this.y=y;
    }

    /**
     * verdoppelt die koord werte
     * @param a
     * @return
     */
    public int[] cloneCoord(int[] a){
        for (int i = 0; i < x.length; i++) {
            a[i] = a[i] * 2;
        }
        return x;
    }

    /**
     * zeichnet ein polygon
     * @param g
     */
    @Override
    public void draw(Graphics g) {
        g.drawPolygon(x,y,n);
    }

    /**
     * erstellt eine kopie
     * @return Polygon()
     */
    @Override
    public Drawable clone() {
        return new Polygon(this.c,cloneCoord(this.x),cloneCoord(this.y),this.n);
    }
}
