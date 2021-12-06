import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class Aliados {
    Laberinto lab = new Laberinto();
    public int x;
    public int y;
    public int xInicial;
    public int yInicial;
    private final int ancho = 40;
    private final int alto = 40;
    private final int movimiento = 40;

    public int aliado;
    public int direccion = 1;
    public boolean opcion1;
    public boolean opcion2;
    public boolean opcion3;
    public boolean opcion4;
    public boolean opcion5;
    public boolean opcion6;
    public boolean opcion7;
    public boolean opcion8;
    public boolean opcion9;

    public void paint(Graphics grafico) {
        grafico.setColor(Color.red);
        grafico.fillOval(x, y, ancho, alto);
        grafico.setColor(Color.black);
        grafico.drawOval(x, y, ancho, alto);

        if (opcion1) {
            lab.opcion1 = true;
        }
        if (opcion2) {
            lab.opcion2 = true;
        }
        if (opcion3) {
            lab.opcion3 = true;
        }
        if (opcion4) {
            lab.opcion4 = true;
        }
        if (opcion5) {
            lab.opcion5 = true;
        }
        if (opcion6) {
            lab.opcion6 = true;
        }
        if (opcion7) {
            lab.opcion7 = true;
        }
        if (opcion8) {
            lab.opcion8 = true;
        }
        if (opcion9) {
            lab.opcion9 = true;
        }
    }

    public boolean reseteo() {
        opcion1 = false;
        opcion2 = false;
        opcion3 = false;
        opcion4 = false;
        opcion5 = false;
        opcion6 = false;
        opcion7 = false;
        opcion8 = false;
        opcion9 = false;
        lab.reseteo();
        return false;
    }

    public void teclaprecionada() {
        Timer tiempo = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                int[][] laberinto = lab.obtenerlaberinto();
                if (aliado == 0) {
                    if (direccion == 1) {
                        if (laberinto[y / 40][(x / 40) + 1] != 1 && laberinto[y / 40][(x / 40) + 1] != 3) {
                            x = x + movimiento;
                        } else {
                            direccion = 0;
                        }
                    }
                    if (direccion == 0) {
                        if ((laberinto[y / 40][(x / 40) - 1] != 1 && laberinto[y / 40][(x / 40) - 1] != 3)) {
                            x = x - movimiento;
                        } else {
                            direccion = 1;
                        }
                    }
                } else if (aliado == 1) {
                    if (direccion == 1) {
                        if (laberinto[(y / 40) + 1][(x / 40)] != 1 && laberinto[(y / 40) + 1][(x / 40)] != 3) {
                            y = y + movimiento;
                        } else {
                            direccion = 0;
                        }
                    }
                    if (direccion == 0) {
                        if (laberinto[(y / 40) - 1][(x / 40)] != 1 && laberinto[(y / 40) - 1][(x / 40)] != 3) {
                            y = y - movimiento;
                        } else {
                            direccion = 1;
                        }
                    }
                }
                if (laberinto[(y / 40)][(x / 40)] == 26) {
                    lab.opcion6 = true;
                    opcion6 = true;
                }
                if (laberinto[(y / 40)][(x / 40)] == 27) {
                    lab.opcion7 = true;
                    opcion7 = true;
                }
                if (laberinto[(y / 40)][(x / 40)] == 28) {
                    lab.opcion8 = true;
                    opcion8 = true;
                }
                if (laberinto[(y / 40)][(x / 40)] == 29) {
                    lab.opcion9 = true;
                    opcion9 = true;
                }

            }
        };
        tiempo.schedule(task, 20, 150);
    }

}