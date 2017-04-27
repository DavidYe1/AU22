import java.awt.*;

/**
 * Created by @Autor DavidYe on @Version 27.04.2017.
 */
public abstract class Drawable{

    /**
     * draw methode
     * @param g
     */
    public abstract void draw(Graphics g);

    /**
     * kopier methode
     * @return konstruktor
     */
    public abstract Drawable clone();
}
