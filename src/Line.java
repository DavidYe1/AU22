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

    public Line(Color c,int x1, int y1, int x2, int y2){
        this.c = c;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public void draw(Graphics g) {
        g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public Drawable clone() {
        return new Line(this.c,this.x1+5,this.y1+5,this.x2+5,this.y2+5);
    }
}
