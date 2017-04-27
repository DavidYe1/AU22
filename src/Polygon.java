import java.awt.*;

/**
 * Created by @Autor DavidYe on @Version 27.04.2017.
 */
public class Polygon extends Drawable {
    Color c;
    int [] x;
    int [] y;
    int n;
    public Polygon(Color c,int[] x, int[] y, int n){
        this.n=n;
        this.x=x;
        this.y=y;
    }


    @Override
    public void draw(Graphics g) {
        g.drawPolygon(x,y,n);
    }

    @Override
    public Drawable clone() {
        return new Polygon(this.c,this.x,this.y,this.n);
    }
}
