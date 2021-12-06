import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;

public class Enemigo {
    Laberinto lab = new Laberinto();

    public int x;
    public int y;
    public int limitex1;
    public int limitex2;
    public int limitey1;
    public int limitey2;
    public int stun = 0;
    private final int movimiento = 40;
    public int direccion = 1;
    public int Enemigo;
    public int aceleracion;
    public boolean monedas = false;
    public boolean opcion1;
    public boolean opcion2;
    public boolean opcion3;
    public boolean opcion4;
    public boolean opcion5;
    public boolean opcion6;
    public boolean opcion7;
    public boolean opcion8;
    public boolean opcion9;
    public boolean stop = false;

    public void paint(Graphics grafico) {
        if (Enemigo == 4 || Enemigo == 5) {
            grafico.setColor(Color.blue);
            grafico.fillOval(x, y, 35, 35);
            grafico.setColor(Color.black);
            grafico.drawOval(x, y, 35, 35);

        } else {
            if (aceleracion == 4) {
                grafico.setColor(Color.yellow);
                grafico.fillOval(x, y, 35, 35);
                grafico.setColor(Color.black);
                grafico.drawOval(x, y, 35, 35);
            } else {
                if (Enemigo == 3 || Enemigo == 2) {
                    grafico.setColor(Color.pink);
                    grafico.fillOval(x, y, 35, 35);
                    grafico.setColor(Color.black);
                    grafico.drawOval(x, y, 35, 35);
                } else {
                    grafico.setColor(Color.black);
                    grafico.fillOval(x, y, 35, 35);
                    grafico.setColor(Color.black);
                    grafico.drawOval(x, y, 35, 35);
                }
            }
        }
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
        monedas = false;
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
        lab.reseteo();
        return false;
    }

    public int aceleracion(int acelerar) {
        aceleracion = acelerar;
        return aceleracion;
    }

    public void teclaprecionada() {
        Timer tiempo = new Timer();
        TimerTask task = new TimerTask() {
            public void run() {
                if (stun == 0) {
                    int[][] laberinto = lab.obtenerlaberinto();
                    if (Enemigo == 0) {
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
                    } else if (Enemigo == 1) {
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
                    } else if (Enemigo == 2) {
                        if (direccion == 1) {
                            if ((x / 40) + 1 != (limitex1)) {
                                x = x + movimiento;
                            } else {
                                direccion = 0;
                            }
                        }
                        if (direccion == 0) {
                            if ((x / 40) - 1 != (limitex2)) {
                                x = x - movimiento;
                            } else {
                                direccion = 1;
                            }
                        }
                    } else if (Enemigo == 3) {
                        if (direccion == 1) {
                            if (((y / 40) + 1) != (limitey1)) {
                                y = y + movimiento;
                            } else {
                                direccion = 0;
                            }
                        }
                        if (direccion == 0) {
                            if ((y / 40) - 1 != (limitey2)) {
                                y = y - movimiento;
                            } else {
                                direccion = 1;
                            }
                        }
                    } else if (Enemigo == 4) {
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
                    } else if (Enemigo == 5) {
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

                } else {
                    stun--;
                }
            }
        };
        tiempo.schedule(task, 20, 250 / aceleracion);
    }
}