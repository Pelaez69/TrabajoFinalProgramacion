import java.awt.Color;
import java.awt.Graphics;

public class Gemas {
    public int x;
    public int y;
    private final int anchoBloque = 40;
    private final int altoBloque = 40;

    public void paint(Graphics grafico) {
        grafico.setColor(Color.MAGENTA);
        grafico.fillOval(x, y, anchoBloque, altoBloque);
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, anchoBloque, altoBloque);
    }

}