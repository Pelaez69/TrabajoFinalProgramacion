
import java.awt.*;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Personaje {

    Laberinto lab = new Laberinto();
    public int tipo = 0;
    public int x;
    public int y;
    public int xInicial;
    public int yInicial;
    private final int movimiento = 40;
    public int mover;
    public static int Vidas = 6;
    public static int Escudos = 0;
    public static int Escudos2 = 0;
    public static int Estrella = 0;
    public boolean opcion1;
    public boolean opcion2;
    public boolean opcion3;
    public boolean opcion4;
    public boolean opcion5;
    public boolean opcion6;
    public boolean opcion7;
    public boolean opcion8;
    public boolean opcion9;
    public boolean opcion51;
    public boolean opcion52;
    public boolean opcion53;
    public boolean opcion90 = false;
    public boolean opcion91 = false;
    public boolean opcion92 = false;
    public boolean opcion93 = false;
    public boolean opcion94 = false;
    public boolean opcion95 = false;
    public boolean opcion96 = false;
    public boolean opcion97 = false;
    public boolean opcion98 = false;
    public boolean opcion99 = false;
    public int stun = 0;
    public boolean stop = false;
    Font hola = new Font("Tiemes New Roman", Font.PLAIN, 28);

    public void paint(Graphics grafico) {

        if (tipo == 0) {
            grafico.setColor(Color.lightGray);
            grafico.fillOval(x, y, 35, 35);
            grafico.setColor(Color.lightGray);
            grafico.drawOval(x, y, 35, 35);

        } else if (tipo == 1) {
            grafico.setColor(Color.lightGray);
            grafico.fillOval(x, y, 35, 35);
            grafico.setColor(Color.lightGray);
            grafico.drawOval(x, y, 35, 35);
        } else if (tipo == 2) {
            grafico.setColor(Color.lightGray);
            grafico.fillOval(x, y, 35, 35);
            grafico.setColor(Color.lightGray);
            grafico.drawOval(x, y, 35, 35);
        } else if (tipo == 3) {
            grafico.setColor(Color.lightGray);
            grafico.fillOval(x, y, 35, 35);
            grafico.setColor(Color.lightGray);
            grafico.drawOval(x, y, 35, 35);
        } else if (tipo == 4) {
            grafico.setColor(Color.lightGray);
            grafico.fillOval(x, y, 35, 35);
            grafico.setColor(Color.lightGray);
            grafico.drawOval(x, y, 35, 35);
        }

        String Escudo = "Escudos wir = " + Escudos;
        String estrella = "Gemas = " + Estrella;
        String Vida = "Vidas = " + Vidas;
        String escudos2 = "Escudos Che = " + Escudos2;
        grafico.setFont(hola);
        grafico.drawString(Vida, 25 * 40, 40 - 10);
        grafico.drawString(Escudo, 25 * 30, 40 - 10);
        grafico.drawString(escudos2, 25 * 20, 40 - 10);
        grafico.drawString(estrella, 25 * 10, 40 - 10);
        grafico.drawString("Alien: 4", 25 * 40, (40 * 16) - 10);
        grafico.drawString("Tron: 3", 25 * 30, (40 * 16) - 10);
        grafico.drawString("Foresy: 2", 25 * 20, (40 * 16) - 10);
        grafico.drawString("Basica: 1", 25 * 10, (40 * 16) - 10);

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

    public int perdervidas() {
        return Vidas--;
    }

    public int obtenervidas() {
        return Vidas;
    }

    public int perderEscudo() {
        return Escudos--;
    }

    public int obtenerEscudo() {
        return Escudos;
    }

    public int ganarEscudo() {
        return Escudos++;
    }

    public int perderEscudo2() {
        return Escudos2--;
    }

    public int obtenerEscudo2() {
        return Escudos2;
    }

    public int ganarEscudo2() {
        return Escudos2++;
    }

    public int ganarstun() {
        stun = stun + 3;
        return stun;
    }

    public int obtenerstun() {
        return stun;
    }

    public boolean reseteo() {
        stop = false;
        opcion1 = false;
        opcion2 = false;
        opcion3 = false;
        opcion4 = false;
        opcion5 = false;
        opcion6 = false;
        opcion7 = false;
        opcion8 = false;
        opcion9 = false;
        opcion51 = false;
        opcion52 = false;
        opcion90 = false;
        opcion91 = false;
        opcion92 = false;
        opcion93 = false;
        opcion94 = false;
        opcion95 = false;
        opcion96 = false;
        opcion97 = false;
        opcion98 = false;
        opcion99 = false;
        lab.reseteo();
        return false;
    }

    public void teclaprecionada(KeyEvent evento) {
        int[][] laberinto = lab.obtenerlaberinto();
        if (stun == 0) {
            if (evento.getKeyCode() == 37) {// Izquierda
                if (laberinto[y / 40][(x / 40) - 1] != 1 && laberinto[y / 40][(x / 40) - 1] != 3) {
                    x = x - movimiento;
                    mover = 0;
                }
            }
            if (evento.getKeyCode() == 39) {// Derecha
                if (laberinto[y / 40][(x / 40) + 1] != 1 && laberinto[y / 40][(x / 40) + 1] != 3) {
                    x = x + movimiento;
                    mover = 1;
                }
            }
            if (evento.getKeyCode() == 40) {// Abajo
                if (laberinto[(y / 40) + 1][(x / 40)] != 1 && laberinto[(y / 40) + 1][(x / 40)] != 3) {
                    y = y + movimiento;
                    mover = 2;
                }
            }
            if (evento.getKeyCode() == 38) {// Arriba
                if (laberinto[(y / 40) - 1][(x / 40)] != 1 && laberinto[(y / 40) - 1][(x / 40)] != 3) {
                    y = y - movimiento;
                    mover = 3;
                }
            }
            if (evento.getKeyCode() == 49) {// Arriba
                tipo = 0;
            }
            if (evento.getKeyCode() == 50) {// Arriba
                tipo = 1;
            }
            if (evento.getKeyCode() == 51) {// Arriba
                tipo = 2;
            }
            if (evento.getKeyCode() == 52) {// Arriba
                tipo = 3;
            }
            if (evento.getKeyCode() == 53) {// Arriba
                tipo = 4;
            }

        } else {
            stun--;
        }
        if (laberinto[y / 40][x / 40] == 5) {
            Juego.cambiarnivel();
        }
        if (obtenervidas() == 0 || obtenervidas() < 0) {
            JOptionPane.showMessageDialog(null, "GG IZZI MANCO DE MIERDA");
            System.exit(0);
        }
        if (laberinto[(y / 40)][(x / 40)] == 22) {
            lab.opcion2 = true;
            opcion2 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 21) {
            lab.opcion1 = true;
            opcion1 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 23) {
            lab.opcion3 = true;
            opcion3 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 24) {
            lab.opcion4 = true;
            opcion4 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 51) {
            if (Estrella >= 8) {
                lab.opcion51 = true;
                ganarEscudo();
                Estrella = Estrella - 8;
            }

        }
        if (laberinto[(y / 40)][(x / 40)] == 52) {
            if (Estrella >= 8) {
                lab.opcion52 = true;
                ganarEscudo2();
                Estrella = Estrella - 8;
            }

        }
        if (laberinto[(y / 40)][(x / 40)] == 53) {
            opcion53 = true;

        }
        if (laberinto[(y / 40)][(x / 40)] == 90) {
            Estrella++;
            lab.opcion90 = true;
            opcion90 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 91) {
            Estrella++;
            lab.opcion91 = true;
            opcion91 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 92) {
            Estrella++;
            lab.opcion92 = true;
            opcion92 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 93) {
            Estrella++;
            lab.opcion93 = true;
            opcion93 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 94) {
            Estrella++;
            lab.opcion94 = true;
            opcion94 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 95) {
            Estrella++;
            lab.opcion95 = true;
            opcion95 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 96) {
            Estrella++;
            lab.opcion96 = true;
            opcion96 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 97) {
            Estrella++;
            lab.opcion97 = true;
            opcion97 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 98) {
            Estrella++;
            lab.opcion98 = true;
            opcion98 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 99) {
            Estrella++;
            lab.opcion99 = true;
            opcion99 = true;
        }
        if (laberinto[(y / 40)][(x / 40)] == 53) {
            stop = true;
        }

    }
}
