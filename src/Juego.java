
//import javax.swing.JButton;
import javax.swing.*;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Juego extends JPanel {

    Laberinto laberinto = new Laberinto();
    Personaje personaje = new Personaje();
    Enemigo enemigo1 = new Enemigo(); // HORIZONTAL
    Enemigo enemigo2 = new Enemigo(); // HORIZONTAL
    Enemigo enemigo3 = new Enemigo(); // HORIZONTAL
    Enemigo enemigo4 = new Enemigo(); // HORIZONTAL
    Enemigo enemigo5 = new Enemigo(); // VERTICAL
    Enemigo enemigo6 = new Enemigo(); // VERTICAL
    Enemigo enemigo7 = new Enemigo(); // VERTICAL
    Enemigo enemigo8 = new Enemigo(); // VERTICAL
    Enemigo enemigo9 = new Enemigo(); // VERTICAL
    Enemigo enemigo10 = new Enemigo(); // VERTICAL
    Enemigo enemigo11 = new Enemigo(); // VERTICAL
    Enemigo enemigo12 = new Enemigo(); // HORIZONTAL CH
    Enemigo enemigo13 = new Enemigo(); // HORIZONTAL CH
    Enemigo enemigo14 = new Enemigo(); // HORIZONTAL CH
    Enemigo enemigo15 = new Enemigo(); // HORIZONTAL CH
    Enemigo enemigo16 = new Enemigo(); // VERTICAL CH
    Enemigo enemigo17 = new Enemigo(); // VERTICAL CH
    //

    Aliados aliado1 = new Aliados();
    Aliados aliado2 = new Aliados();
    Aliados aliado3 = new Aliados();
    Aliados aliado4 = new Aliados();

    public static int Nivel = 1;
    public static int inicial = 1;
    int[][] lab = laberinto.obtenerlaberinto();

    // Personaje
    ImageIcon Imgper11 = new ImageIcon(getClass().getResource("/imagenes/Recurso1.png"));
    ImageIcon Imgper12 = new ImageIcon(getClass().getResource("/imagenes/Recurso2.png"));
    ImageIcon Imgper13 = new ImageIcon(getClass().getResource("/imagenes/Recurso3.png"));
    ImageIcon Imgper14 = new ImageIcon(getClass().getResource("/imagenes/Recurso4.png"));

    ImageIcon Imgper21 = new ImageIcon(getClass().getResource("/imagenes/Recurso21.png"));
    ImageIcon Imgper22 = new ImageIcon(getClass().getResource("/imagenes/Recurso22.png"));
    ImageIcon Imgper23 = new ImageIcon(getClass().getResource("/imagenes/Recurso23.png"));
    ImageIcon Imgper24 = new ImageIcon(getClass().getResource("/imagenes/Recurso24.png"));

    ImageIcon Imgper31 = new ImageIcon(getClass().getResource("/imagenes/Recurso31.png"));
    ImageIcon Imgper32 = new ImageIcon(getClass().getResource("/imagenes/Recurso32.png"));
    ImageIcon Imgper33 = new ImageIcon(getClass().getResource("/imagenes/Recurso33.png"));
    ImageIcon Imgper34 = new ImageIcon(getClass().getResource("/imagenes/Recurso34.png"));

    ImageIcon Imgper41 = new ImageIcon(getClass().getResource("/imagenes/Recurso41.png"));
    ImageIcon Imgper42 = new ImageIcon(getClass().getResource("/imagenes/Recurso42.png"));
    ImageIcon Imgper43 = new ImageIcon(getClass().getResource("/imagenes/Recurso43.png"));
    ImageIcon Imgper44 = new ImageIcon(getClass().getResource("/imagenes/Recurso44.png"));

    ImageIcon Imgper51 = new ImageIcon(getClass().getResource("/imagenes/Recurso51.png"));
    ImageIcon Imgper52 = new ImageIcon(getClass().getResource("/imagenes/Recurso52.png"));
    ImageIcon Imgper53 = new ImageIcon(getClass().getResource("/imagenes/Recurso53.png"));
    ImageIcon Imgper54 = new ImageIcon(getClass().getResource("/imagenes/Recurso54.png"));

    // Enemigo2
    ImageIcon ImgEnem211 = new ImageIcon(getClass().getResource("/imagenes/Enemigo11.png"));
    ImageIcon ImgEnem221 = new ImageIcon(getClass().getResource("/imagenes/Enemigo13.png"));
    ImageIcon ImgEnem231 = new ImageIcon(getClass().getResource("/imagenes/Enemigo12.png"));
    ImageIcon ImgEnem241 = new ImageIcon(getClass().getResource("/imagenes/Enemigo14.png"));

    ImageIcon ImgEnem212 = new ImageIcon(getClass().getResource("/imagenes/Enemigo21.png"));
    ImageIcon ImgEnem222 = new ImageIcon(getClass().getResource("/imagenes/Enemigo23.png"));
    ImageIcon ImgEnem232 = new ImageIcon(getClass().getResource("/imagenes/Enemigo22.png"));
    ImageIcon ImgEnem242 = new ImageIcon(getClass().getResource("/imagenes/Enemigo24.png"));

    ImageIcon ImgEnem213 = new ImageIcon(getClass().getResource("/imagenes/Enemigo31.png"));
    ImageIcon ImgEnem223 = new ImageIcon(getClass().getResource("/imagenes/Enemigo33.png"));
    ImageIcon ImgEnem233 = new ImageIcon(getClass().getResource("/imagenes/Enemigo32.png"));
    ImageIcon ImgEnem243 = new ImageIcon(getClass().getResource("/imagenes/Enemigo34.png"));

    ImageIcon ImgEnem244 = new ImageIcon(getClass().getResource("/imagenes/Fanton.png"));

    // Enemigo2
    ImageIcon ImgAli1 = new ImageIcon(getClass().getResource("/imagenes/Aliado1.png"));
    ImageIcon ImgAli2 = new ImageIcon(getClass().getResource("/imagenes/Aliado2.png"));
    ImageIcon ImgAli3 = new ImageIcon(getClass().getResource("/imagenes/Aliado3.png"));
    ImageIcon ImgAli4 = new ImageIcon(getClass().getResource("/imagenes/Aliado4.png"));

    // puerta
    ImageIcon puerta11 = new ImageIcon(getClass().getResource("/imagenes/Puerta11.png"));
    ImageIcon puerta12 = new ImageIcon(getClass().getResource("/imagenes/Puerta12.png"));
    ImageIcon puerta2 = new ImageIcon(getClass().getResource("/imagenes/Puerta2.png"));
    ImageIcon puerta3 = new ImageIcon(getClass().getResource("/imagenes/Puerta3.png"));
    ImageIcon puerta4 = new ImageIcon(getClass().getResource("/imagenes/Puerta4.png"));
    ImageIcon puerta5 = new ImageIcon(getClass().getResource("/imagenes/Puerta5.png"));

    // gema
    ImageIcon Gema1 = new ImageIcon(getClass().getResource("/imagenes/Gema.png"));

    // boton
    ImageIcon Boton1 = new ImageIcon(getClass().getResource("/imagenes/Boton.png"));
    ImageIcon Boton2 = new ImageIcon(getClass().getResource("/imagenes/Boton2.png"));
    ImageIcon Boton3 = new ImageIcon(getClass().getResource("/imagenes/Boton3.png"));
    ImageIcon Boton4 = new ImageIcon(getClass().getResource("/imagenes/Boton4.png"));
    ImageIcon Boton5 = new ImageIcon(getClass().getResource("/imagenes/Boton5.png"));

    // Cofre
    ImageIcon Cofre1 = new ImageIcon(getClass().getResource("/imagenes/Cofre1.png"));
    ImageIcon Cofre2 = new ImageIcon(getClass().getResource("/imagenes/Cofre2.png"));
    ImageIcon Cofre3 = new ImageIcon(getClass().getResource("/imagenes/Cofre3.png"));

    // Fin
    ImageIcon Fin = new ImageIcon(getClass().getResource("/imagenes/Fin.png"));

    public Juego() {
        // posisicones iniciales
        // personaje
        personaje.x = 40;
        personaje.y = 13 * 40;
        personaje.xInicial = 40;
        personaje.yInicial = 13 * 40;
        // wirplos
        enemigo1.x = 25 * 40;
        enemigo1.y = 14 * 40;
        enemigo1.Enemigo = 0;
        enemigo1.aceleracion = 1;
        enemigo2.x = 13 * 40;
        enemigo2.y = 13 * 40;
        enemigo2.Enemigo = 0;
        enemigo2.aceleracion = 1;
        enemigo3.x = 25 * 40;
        enemigo3.y = 14 * 40;
        enemigo3.Enemigo = 0;
        enemigo3.aceleracion = 1;
        enemigo4.x = 25 * 40;
        enemigo4.y = 14 * 40;
        enemigo4.Enemigo = 0;
        enemigo4.aceleracion = 1;
        enemigo5.x = 7 * 40;
        enemigo5.y = 9 * 40;
        enemigo5.Enemigo = 1;
        enemigo5.aceleracion = 1;
        enemigo6.x = 13 * 40;
        enemigo6.y = 3 * 40;
        enemigo6.Enemigo = 1;
        enemigo6.aceleracion = 1;
        enemigo7.x = 17 * 40;
        enemigo7.y = 6 * 40;
        enemigo7.Enemigo = 1;
        enemigo7.aceleracion = 1;
        enemigo8.x = 25 * 40;
        enemigo8.y = 14 * 40;
        enemigo8.Enemigo = 1;
        enemigo8.aceleracion = 1;
        enemigo9.x = 25 * 40;
        enemigo9.y = 14 * 40;
        enemigo9.Enemigo = 1;
        enemigo9.aceleracion = 1;
        enemigo10.x = 25 * 40;
        enemigo10.y = 14 * 40;
        enemigo10.Enemigo = 1;
        enemigo10.aceleracion = 1;
        enemigo11.x = 25 * 40;
        enemigo11.y = 14 * 40;
        enemigo11.Enemigo = 1;
        enemigo11.aceleracion = 1;
        // chersans
        enemigo12.x = 20 * 40;
        enemigo12.y = 5 * 40;
        enemigo12.Enemigo = 4;
        enemigo12.aceleracion = 1;
        enemigo13.x = 25 * 40;
        enemigo13.y = 14 * 40;
        enemigo13.Enemigo = 4;
        enemigo13.aceleracion = 1;
        enemigo14.x = 25 * 40;
        enemigo14.y = 14 * 40;
        enemigo14.Enemigo = 4;
        enemigo14.aceleracion = 1;
        enemigo15.x = 25 * 40;
        enemigo15.y = 14 * 40;
        enemigo15.Enemigo = 4;
        enemigo15.aceleracion = 1;
        enemigo16.x = 20 * 40;
        enemigo16.y = 5 * 40;
        enemigo16.Enemigo = 5;
        enemigo16.aceleracion = 1;
        enemigo17.x = 25 * 40;
        enemigo17.y = 14 * 40;
        enemigo17.Enemigo = 5;
        enemigo17.aceleracion = 1;
        //
        aliado1.x = 40;
        aliado1.y = 9 * 40;
        aliado1.xInicial = 40;
        aliado1.yInicial = 9 * 40;
        aliado1.aliado = 0;
        aliado2.x = 25 * 40;
        aliado2.y = 14 * 40;
        aliado2.aliado = 0;
        aliado3.x = 25 * 40;
        aliado3.y = 14 * 40;
        aliado3.aliado = 0;
        aliado4.x = 25 * 40;
        aliado4.y = 14 * 40;
        aliado4.aliado = 0;
        inicial++;

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                personaje.teclaprecionada(e);

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }

        });
        setFocusable(true);

        enemigo1.teclaprecionada();
        enemigo2.teclaprecionada();
        enemigo3.teclaprecionada();
        enemigo4.teclaprecionada();
        enemigo5.teclaprecionada();
        enemigo6.teclaprecionada();
        enemigo7.teclaprecionada();
        enemigo8.teclaprecionada();
        enemigo9.teclaprecionada();
        enemigo10.teclaprecionada();
        enemigo11.teclaprecionada();
        enemigo12.teclaprecionada();
        enemigo13.teclaprecionada();
        enemigo14.teclaprecionada();
        enemigo15.teclaprecionada();
        enemigo16.teclaprecionada();
        enemigo17.teclaprecionada();
        aliado1.teclaprecionada();
        aliado2.teclaprecionada();
        aliado3.teclaprecionada();
        aliado4.teclaprecionada();
    }

    public static int cambiarnivel() {
        return Nivel++;
    }

    public static int obtenernivel() {
        return Nivel;
    }

    @Override
    public void paint(Graphics grafico) {

        if (Nivel == 1) {
            // graficas
            laberinto.paint(grafico);
            personaje.paint(grafico);
            enemigo2.paint(grafico);
            enemigo5.paint(grafico);
            enemigo6.paint(grafico);
            enemigo7.paint(grafico);
            enemigo12.paint(grafico);
            enemigo16.paint(grafico);
            aliado1.paint(grafico);

            // fin
            grafico.drawImage(Fin.getImage(), 25 * 40, 9 * 40, 40, 40, this);

            // opciones de enemigos
            if (enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo7.x == personaje.x && enemigo7.y == personaje.y && personaje.obtenerEscudo() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo();
            } else if (enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo7.x == personaje.x && enemigo7.y == personaje.y && personaje.obtenerEscudo() == 0) {
                personaje.x = personaje.xInicial;
                personaje.y = personaje.yInicial;
                personaje.perdervidas();

            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo2();
            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() == 0) {
                personaje.x = 7 * 40;
                personaje.y = 7 * 40;
                personaje.ganarstun();
            }

            // opciones de puertas
            if (personaje.opcion1) {
                grafico.drawImage(Boton2.getImage(), 1 * 40, 6 * 40, 40, 40, this);
                aliado1.opcion1 = true;
                enemigo2.opcion1 = true;
                enemigo5.opcion1 = true;
                enemigo6.opcion1 = true;
                enemigo7.opcion1 = true;
                enemigo12.opcion1 = true;
                enemigo16.opcion1 = true;
                laberinto.opcion1 = true;
            } else {
                grafico.drawImage(Boton2.getImage(), 1 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 11 * 40, 10 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 11 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 11 * 40, 9 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 14 * 40, 12 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 14 * 40, 13 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 14 * 40, 14 * 40, 40, 40, this);
            }
            if (personaje.opcion2) {
                grafico.drawImage(Boton3.getImage(), 8 * 40, 13 * 40, 40, 40, this);
                aliado1.opcion2 = true;
                enemigo2.opcion2 = true;
                enemigo5.opcion2 = true;
                enemigo6.opcion2 = true;
                enemigo7.opcion2 = true;
                enemigo12.opcion2 = true;
                enemigo16.opcion2 = true;
                laberinto.opcion2 = true;
            } else {
                grafico.drawImage(Boton3.getImage(), 8 * 40, 13 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 3 * 40, 10 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 3 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 3 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion3) {
                grafico.drawImage(Boton1.getImage(), 1 * 40, 2 * 40, 40, 40, this);
                aliado1.opcion3 = true;
                enemigo2.opcion3 = true;
                enemigo5.opcion3 = true;
                enemigo6.opcion3 = true;
                enemigo7.opcion3 = true;
                enemigo12.opcion3 = true;
                enemigo16.opcion3 = true;
                laberinto.opcion3 = true;
            } else {
                grafico.drawImage(Boton1.getImage(), 1 * 40, 2 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 24 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 25 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 26 * 40, 4 * 40, 40, 40, this);
            }
            if (aliado1.opcion6) {
                grafico.drawImage(Boton1.getImage(), 4 * 40, 9 * 40, 40, 40, this);
                personaje.opcion6 = true;
                enemigo2.opcion6 = true;
                enemigo5.opcion6 = true;
                enemigo6.opcion6 = true;
                enemigo7.opcion6 = true;
                enemigo12.opcion6 = true;
                enemigo16.opcion6 = true;
                laberinto.opcion6 = true;
            } else {
                grafico.drawImage(Boton1.getImage(), 4 * 40, 9 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 6 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 7 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 8 * 40, 11 * 40, 40, 40, this);
            }

            if (personaje.opcion90) {
                laberinto.opcion90 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 4 * 40, 13 * 40, 40, 40, this);
            }

            if (personaje.opcion91) {
                laberinto.opcion91 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 4 * 40, 5 * 40, 40, 40, this);
            }

            if (personaje.opcion92) {
                laberinto.opcion92 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 9 * 40, 9 * 40, 40, 40, this);
            }

            if (personaje.opcion93) {
                laberinto.opcion93 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 11 * 40, 13 * 40, 40, 40, this);
            }

            if (personaje.opcion94) {
                laberinto.opcion94 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 19 * 40, 13 * 40, 40, 40, this);
            }
            if (personaje.opcion95) {
                laberinto.opcion95 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 18 * 40, 9 * 40, 40, 40, this);
            }

            if (personaje.opcion96) {
                laberinto.opcion96 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 11 * 40, 5 * 40, 40, 40, this);
            }

            if (personaje.opcion97) {
                laberinto.opcion97 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 5 * 40, 2 * 40, 40, 40, this);
            }

            if (personaje.opcion98) {
                laberinto.opcion98 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 13 * 40, 2 * 40, 40, 40, this);
            }

            if (personaje.opcion99) {
                laberinto.opcion99 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 20 * 40, 4 * 40, 40, 40, this);
            }
            grafico.drawImage(Cofre1.getImage(), 20 * 40, 1 * 40, 40, 40, this);

            // enemigos 2
            if (enemigo2.Enemigo == 0) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 1) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 2) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 3) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 4) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 5) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            }

            // enemigos 5
            if (enemigo5.Enemigo == 0) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 1) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 2) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 3) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 4) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 5) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            }
            // enemigos 6
            if (enemigo6.Enemigo == 0) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 1) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 2) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 3) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 4) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 5) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            }

            // enemigos 7
            if (enemigo7.Enemigo == 0) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 1) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 2) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 3) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 4) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 5) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            }

            // enemigos 12
            if (enemigo12.Enemigo == 0) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 1) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 2) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 3) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 4) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 5) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            }

            // enemigos 16
            if (enemigo16.Enemigo == 0) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 1) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 2) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 3) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 4) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 5) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            }
            // aliado1
            if (aliado1.aliado == 0) {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            } else {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            }

            // personaje
            if (personaje.tipo == 0) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 1) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper23.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper21.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper22.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper24.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 2) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper33.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper31.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper32.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper34.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 3) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper43.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper41.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper42.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper44.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 4) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper53.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper51.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper52.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper54.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            }

        } else if (Nivel == 2) {
            if (inicial == 2) {
                reseteo();
                // posisicones iniciales
                // personaje
                personaje.x = 11 * 40;
                personaje.y = 7 * 40;
                personaje.xInicial = 11 * 40;
                personaje.yInicial = 7 * 40;
                // wirplos
                enemigo1.x = 11 * 40;
                enemigo1.y = 9 * 40;
                enemigo1.Enemigo = 0;
                enemigo1.aceleracion = 1;
                enemigo2.x = 11 * 40;
                enemigo2.y = 2 * 40;
                enemigo2.Enemigo = 0;
                enemigo2.aceleracion = 1;
                enemigo3.x = 25 * 40;
                enemigo3.y = 14 * 40;
                enemigo3.Enemigo = 0;
                enemigo3.aceleracion = 1;
                enemigo4.x = 25 * 40;
                enemigo4.y = 14 * 40;
                enemigo4.Enemigo = 0;
                enemigo4.aceleracion = 1;
                enemigo5.x = 7 * 40;
                enemigo5.y = 9 * 40;
                enemigo5.Enemigo = 1;
                enemigo5.aceleracion = 1;
                enemigo6.x = 17 * 40;
                enemigo6.y = 9 * 40;
                enemigo6.Enemigo = 1;
                enemigo6.aceleracion = 1;
                enemigo7.x = 25 * 40;
                enemigo7.y = 14 * 40;
                enemigo7.Enemigo = 1;
                enemigo7.aceleracion = 1;
                enemigo8.x = 25 * 40;
                enemigo8.y = 14 * 40;
                enemigo8.Enemigo = 1;
                enemigo8.aceleracion = 1;
                enemigo9.x = 25 * 40;
                enemigo9.y = 14 * 40;
                enemigo9.Enemigo = 1;
                enemigo9.aceleracion = 1;
                enemigo10.x = 25 * 40;
                enemigo10.y = 14 * 40;
                enemigo10.Enemigo = 1;
                enemigo10.aceleracion = 1;
                enemigo11.x = 25 * 40;
                enemigo11.y = 14 * 40;
                enemigo11.Enemigo = 1;
                enemigo11.aceleracion = 1;
                // chersans
                enemigo12.x = 40;
                enemigo12.y = 3 * 40;
                enemigo12.Enemigo = 4;
                enemigo12.aceleracion = 1;
                enemigo13.x = 25 * 40;
                enemigo13.y = 14 * 40;
                enemigo13.Enemigo = 4;
                enemigo13.aceleracion = 1;
                enemigo14.x = 25 * 40;
                enemigo14.y = 14 * 40;
                enemigo14.Enemigo = 4;
                enemigo14.aceleracion = 1;
                enemigo15.x = 25 * 40;
                enemigo15.y = 14 * 40;
                enemigo15.Enemigo = 4;
                enemigo15.aceleracion = 1;
                enemigo16.x = 19 * 40;
                enemigo16.y = 9 * 40;
                enemigo16.Enemigo = 5;
                enemigo16.aceleracion = 1;
                enemigo17.x = 4 * 40;
                enemigo17.y = 12 * 40;
                enemigo17.Enemigo = 5;
                enemigo17.aceleracion = 1;

                // aliados
                aliado1.x = 1 * 40;
                aliado1.y = 5 * 40;
                aliado1.xInicial = 1 * 40;
                aliado1.yInicial = 5 * 40;
                aliado1.aliado = 0;
                aliado2.x = 27 * 40;
                aliado2.y = 5 * 40;
                aliado2.xInicial = 27 * 40;
                aliado2.yInicial = 5 * 40;
                aliado2.aliado = 0;
                aliado3.x = 25 * 40;
                aliado3.y = 14 * 40;
                aliado3.aliado = 0;
                aliado4.x = 25 * 40;
                aliado4.y = 14 * 40;
                aliado4.aliado = 0;
                inicial++;

            }

            laberinto.paint(grafico);
            personaje.paint(grafico);
            enemigo1.paint(grafico);
            enemigo2.paint(grafico);
            enemigo5.paint(grafico);
            enemigo6.paint(grafico);
            enemigo12.paint(grafico);
            enemigo16.paint(grafico);
            enemigo17.paint(grafico);
            aliado1.paint(grafico);
            aliado2.paint(grafico);

            // fin
            grafico.drawImage(Fin.getImage(), 11 * 40, 14 * 40, 40, 40, this);

            // Cofre
            grafico.drawImage(Cofre2.getImage(), 26 * 40, 2 * 40, 40, 40, this);

            if (personaje.opcion90) {
                laberinto.opcion90 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 19 * 40, 6 * 40, 40, 40, this);
            }
            if (personaje.opcion91) {
                laberinto.opcion91 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 7 * 40, 12 * 40, 40, 40, this);
            }
            if (personaje.opcion92) {
                laberinto.opcion92 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 7 * 40, 14 * 40, 40, 40, this);
            }
            if (personaje.opcion93) {
                laberinto.opcion93 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 2 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion94) {
                laberinto.opcion94 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 4 * 40, 3 * 40, 40, 40, this);
            }
            if (personaje.opcion95) {
                laberinto.opcion95 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 10 * 40, 1 * 40, 40, 40, this);
            }
            if (personaje.opcion96) {
                laberinto.opcion96 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 12 * 40, 1 * 40, 40, 40, this);
            }
            if (personaje.opcion97) {
                laberinto.opcion97 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 16 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion98) {
                laberinto.opcion98 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 19 * 40, 13 * 40, 40, 40, this);
            }
            if (personaje.opcion99) {
                laberinto.opcion99 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 25 * 40, 9 * 40, 40, 40, this);
            }
            // opciones de puertas
            if (personaje.opcion1) {
                grafico.drawImage(Boton3.getImage(), 10 * 40, 4 * 40, 40, 40, this);
                aliado1.opcion1 = true;
                aliado2.opcion1 = true;
                enemigo1.opcion1 = true;
                enemigo2.opcion1 = true;
                enemigo5.opcion1 = true;
                enemigo6.opcion1 = true;
                enemigo17.opcion1 = true;
                enemigo12.opcion1 = true;
                enemigo16.opcion1 = true;
                laberinto.opcion1 = true;
            } else {
                grafico.drawImage(Boton3.getImage(), 10 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 5 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 5 * 40, 6 * 40, 40, 40, this);
            }
            if (personaje.opcion2) {
                grafico.drawImage(Boton4.getImage(), 1 * 40, 13 * 40, 40, 40, this);
                aliado1.opcion2 = true;
                aliado2.opcion2 = true;
                enemigo1.opcion2 = true;
                enemigo2.opcion2 = true;
                enemigo5.opcion2 = true;
                enemigo6.opcion2 = true;
                enemigo17.opcion2 = true;
                enemigo12.opcion2 = true;
                enemigo16.opcion2 = true;
                laberinto.opcion2 = true;
            } else {
                grafico.drawImage(Boton4.getImage(), 1 * 40, 13 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 6 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 7 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 8 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 21 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 21 * 40, 6 * 40, 40, 40, this);
            }
            if (personaje.opcion3) {
                grafico.drawImage(Boton5.getImage(), 1 * 40, 2 * 40, 40, 40, this);
                aliado1.opcion3 = true;
                aliado2.opcion3 = true;
                enemigo1.opcion3 = true;
                enemigo2.opcion3 = true;
                enemigo5.opcion3 = true;
                enemigo6.opcion3 = true;
                enemigo17.opcion3 = true;
                enemigo12.opcion3 = true;
                enemigo16.opcion3 = true;
                laberinto.opcion3 = true;
            } else {
                grafico.drawImage(Boton5.getImage(), 1 * 40, 2 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 15 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 16 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 17 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 19 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 18 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 14 * 40, 4 * 40, 40, 40, this);
            }
            if (personaje.opcion4) {
                grafico.drawImage(Boton1.getImage(), 17 * 40, 14 * 40, 40, 40, this);
                aliado1.opcion4 = true;
                aliado2.opcion4 = true;
                enemigo1.opcion4 = true;
                enemigo2.opcion4 = true;
                enemigo5.opcion4 = true;
                enemigo6.opcion4 = true;
                enemigo17.opcion4 = true;
                enemigo12.opcion4 = true;
                enemigo16.opcion4 = true;
                laberinto.opcion4 = true;
            } else {
                grafico.drawImage(Boton1.getImage(), 17 * 40, 14 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 13 * 40, 10 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 13 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 13 * 40, 9 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 10 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 11 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 12 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 24 * 40, 3 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 24 * 40, 2 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 24 * 40, 1 * 40, 40, 40, this);
            }
            if (aliado1.opcion6) {
                grafico.drawImage(Boton3.getImage(), 8 * 40, 5 * 40, 40, 40, this);
                personaje.opcion6 = true;
                aliado2.opcion6 = true;
                enemigo1.opcion6 = true;
                enemigo2.opcion6 = true;
                enemigo5.opcion6 = true;
                enemigo6.opcion6 = true;
                enemigo17.opcion6 = true;
                enemigo12.opcion6 = true;
                enemigo16.opcion6 = true;
                laberinto.opcion6 = true;
            } else {
                grafico.drawImage(Boton3.getImage(), 8 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 9 * 40, 10 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 9 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 9 * 40, 9 * 40, 40, 40, this);

            }
            if (aliado2.opcion7) {
                grafico.drawImage(Boton4.getImage(), 14 * 40, 5 * 40, 40, 40, this);
                personaje.opcion7 = true;
                aliado1.opcion7 = true;
                enemigo1.opcion7 = true;
                enemigo2.opcion7 = true;
                enemigo5.opcion7 = true;
                enemigo6.opcion7 = true;
                enemigo12.opcion7 = true;
                enemigo16.opcion7 = true;
                enemigo17.opcion7 = true;
                laberinto.opcion7 = true;
            } else {
                grafico.drawImage(Boton4.getImage(), 14 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 19 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 20 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 21 * 40, 11 * 40, 40, 40, this);

            }
            // Aliados1
            if (aliado1.aliado == 0) {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            } else {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            }
            // aliado2
            if (aliado2.aliado == 0) {
                if (aliado2.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                }
            } else {
                if (aliado2.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                }
            }
            // opciones de enemigos
            if (enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo();
            } else if (enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() == 0) {
                personaje.x = personaje.xInicial;
                personaje.y = personaje.yInicial;
                personaje.perdervidas();

            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo17.x == personaje.x && enemigo17.y == personaje.y && personaje.obtenerEscudo2() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo2();
            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo17.x == personaje.x && enemigo17.y == personaje.y && personaje.obtenerEscudo2() == 0) {
                personaje.x = 7 * 40;
                personaje.y = 7 * 40;
                personaje.ganarstun();
            }

            // personaje
            if (personaje.tipo == 0) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 1) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper23.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper21.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper22.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper24.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 2) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper33.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper31.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper32.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper34.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 3) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper43.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper41.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper42.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper44.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 4) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper53.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper51.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper52.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper54.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            }

            // enemigo1
            if (enemigo1.Enemigo == 0) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 1) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 2) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 3) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 4) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 5) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            }

            // enemigo2
            if (enemigo2.Enemigo == 0) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 1) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 2) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 3) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 4) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 5) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            }

            // enemigo5
            if (enemigo5.Enemigo == 0) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 1) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 2) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 3) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 4) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 5) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            }

            // enemigo16
            if (enemigo16.Enemigo == 0) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 1) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 2) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 3) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 4) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 5) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            }

            // enemigo6
            if (enemigo6.Enemigo == 0) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 1) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 2) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 3) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 4) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 5) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            }

            // enemigo12
            if (enemigo12.Enemigo == 0) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 1) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 2) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 3) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 4) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 5) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            }

            // enemigo17
            if (enemigo17.Enemigo == 0) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 1) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 2) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 3) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 4) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 5) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            }
        } else if (Nivel == 3) {
            if (inicial == 3) {
                reseteo();
                // posisicones iniciales
                // personaje
                personaje.x = 11 * 40;
                personaje.y = 8 * 40;
                personaje.xInicial = 11 * 40;
                personaje.yInicial = 8 * 40;
                // wirplos
                enemigo1.x = 25 * 40;
                enemigo1.y = 8 * 40;
                enemigo1.Enemigo = 0;
                enemigo1.aceleracion = 1;
                enemigo2.x = 11 * 40;
                enemigo2.y = 9 * 40;
                enemigo2.Enemigo = 0;
                enemigo2.aceleracion = 1;
                enemigo3.x = 40;
                enemigo3.y = 13 * 40;
                enemigo3.Enemigo = 0;
                enemigo3.aceleracion = 1;
                enemigo4.x = 25 * 40;
                enemigo4.y = 14 * 40;
                enemigo4.Enemigo = 0;
                enemigo4.aceleracion = 1;
                enemigo5.x = 21 * 40;
                enemigo5.y = 8 * 40;
                enemigo5.Enemigo = 1;
                enemigo5.aceleracion = 1;
                enemigo6.x = 25 * 40;
                enemigo6.y = 14 * 40;
                enemigo6.Enemigo = 1;
                enemigo6.aceleracion = 1;
                enemigo7.x = 25 * 40;
                enemigo7.y = 14 * 40;
                enemigo7.Enemigo = 1;
                enemigo7.aceleracion = 1;
                enemigo8.x = 25 * 40;
                enemigo8.y = 14 * 40;
                enemigo8.Enemigo = 1;
                enemigo8.aceleracion = 1;
                enemigo9.x = 25 * 40;
                enemigo9.y = 14 * 40;
                enemigo9.Enemigo = 1;
                enemigo9.aceleracion = 1;
                enemigo10.x = 25 * 40;
                enemigo10.y = 14 * 40;
                enemigo10.Enemigo = 1;
                enemigo10.aceleracion = 1;
                enemigo11.x = 25 * 40;
                enemigo11.y = 14 * 40;
                enemigo11.Enemigo = 1;
                enemigo11.aceleracion = 1;
                // chersans
                enemigo12.x = 25 * 40;
                enemigo12.y = 14 * 40;
                enemigo12.Enemigo = 4;
                enemigo12.aceleracion = 1;
                enemigo13.x = 25 * 40;
                enemigo13.y = 14 * 40;
                enemigo13.Enemigo = 4;
                enemigo13.aceleracion = 1;
                enemigo14.x = 25 * 40;
                enemigo14.y = 14 * 40;
                enemigo14.Enemigo = 4;
                enemigo14.aceleracion = 1;
                enemigo15.x = 25 * 40;
                enemigo15.y = 14 * 40;
                enemigo15.Enemigo = 4;
                enemigo15.aceleracion = 1;
                enemigo16.x = 24 * 40;
                enemigo16.y = 8 * 40;
                enemigo16.Enemigo = 5;
                enemigo16.aceleracion = 1;
                enemigo17.x = 12 * 40;
                enemigo17.y = 8 * 40;
                enemigo17.Enemigo = 5;
                enemigo17.aceleracion = 1;
                inicial++;
                // aliado
                aliado1.x = 2 * 40;
                aliado1.y = 1 * 40;
                aliado1.xInicial = 2 * 40;
                aliado1.yInicial = 1 * 40;
                aliado1.aliado = 1;
                aliado2.x = 25 * 40;
                aliado2.y = 14 * 40;
                aliado2.aliado = 0;
                aliado3.x = 25 * 40;
                aliado3.y = 14 * 40;
                aliado3.aliado = 0;
                aliado4.x = 25 * 40;
                aliado4.y = 14 * 40;
                aliado4.aliado = 0;
            }

            laberinto.paint(grafico);
            personaje.paint(grafico);
            enemigo1.paint(grafico);
            enemigo2.paint(grafico);
            enemigo3.paint(grafico);
            enemigo5.paint(grafico);
            enemigo16.paint(grafico);
            enemigo17.paint(grafico);
            aliado1.paint(grafico);
            aliado2.paint(grafico);
            // fin
            grafico.drawImage(Fin.getImage(), 1 * 40, 9 * 40, 40, 40, this);

            // opcion enemigos
            if (enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo3.x == personaje.x && enemigo3.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo();
            } else if (enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo3.x == personaje.x && enemigo3.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() == 0) {
                personaje.x = personaje.xInicial;
                personaje.y = personaje.yInicial;
                personaje.perdervidas();

            } else if (enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo17.x == personaje.x && enemigo17.y == personaje.y && personaje.obtenerEscudo2() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo2();
            } else if (enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo17.x == personaje.x && enemigo17.y == personaje.y && personaje.obtenerEscudo2() == 0) {
                personaje.x = 11 * 40;
                personaje.y = 8 * 40;
                personaje.ganarstun();
            }
            // cofre
            grafico.drawImage(Cofre1.getImage(), 3 * 40, 13 * 40, 40, 40, this);

            // opcion puertas
            if (personaje.opcion1) {
                grafico.drawImage(Boton5.getImage(), 27 * 40, 4 * 40, 40, 40, this);
                aliado1.opcion1 = true;
                enemigo1.opcion1 = true;
                enemigo2.opcion1 = true;
                enemigo3.opcion1 = true;
                enemigo5.opcion1 = true;
                enemigo16.opcion1 = true;
                enemigo17.opcion1 = true;
                laberinto.opcion1 = true;
            } else {
                grafico.drawImage(Boton5.getImage(), 27 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 1 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 2 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 3 * 40, 4 * 40, 40, 40, this);

            }
            if (aliado1.opcion6) {
                grafico.drawImage(Boton3.getImage(), 2 * 40, 6 * 40, 40, 40, this);
                personaje.opcion6 = true;
                enemigo1.opcion6 = true;
                enemigo2.opcion6 = true;
                enemigo3.opcion6 = true;
                enemigo5.opcion6 = true;
                enemigo16.opcion6 = true;
                enemigo17.opcion6 = true;
                laberinto.opcion6 = true;
            } else {
                grafico.drawImage(Boton3.getImage(), 2 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 6 * 40, 10 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 6 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 6 * 40, 9 * 40, 40, 40, this);

            }

            if (personaje.opcion90) {
                laberinto.opcion90 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 14 * 40, 8 * 40, 40, 40, this);
            }
            if (personaje.opcion91) {
                laberinto.opcion91 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 20 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion92) {
                laberinto.opcion92 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 24 * 40, 8 * 40, 40, 40, this);
            }
            if (personaje.opcion93) {
                laberinto.opcion93 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 20 * 40, 4 * 40, 40, 40, this);
            }
            if (personaje.opcion94) {
                laberinto.opcion94 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 12 * 40, 4 * 40, 40, 40, this);
            }
            if (personaje.opcion95) {
                laberinto.opcion95 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 16 * 40, 14 * 40, 40, 40, this);
            }
            if (personaje.opcion96) {
                laberinto.opcion96 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 10 * 40, 13 * 40, 40, 40, this);
            }
            if (personaje.opcion97) {
                laberinto.opcion97 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 4 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion98) {
                laberinto.opcion98 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 24 * 40, 4 * 40, 40, 40, this);
            }
            if (personaje.opcion99) {
                laberinto.opcion99 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 19 * 40, 13 * 40, 40, 40, this);
            }
            // aliado1
            if (aliado1.aliado == 0) {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            } else {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            }

            // personaje
            if (personaje.tipo == 0) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 1) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper23.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper21.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper22.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper24.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 2) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper33.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper31.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper32.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper34.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 3) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper43.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper41.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper42.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper44.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 4) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper53.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper51.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper52.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper54.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            }

            // enemigo17
            if (enemigo1.Enemigo == 0) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 1) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 2) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 3) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 4) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 5) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            }
            // enemigo2
            if (enemigo2.Enemigo == 0) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 1) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 2) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 3) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 4) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 5) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            }
            // enemigo3
            if (enemigo3.Enemigo == 0) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 1) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 2) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 3) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 4) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 5) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            }
            // enemigo5
            if (enemigo5.Enemigo == 0) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 1) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 2) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 3) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 4) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 5) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            }
            // enemigo16
            if (enemigo16.Enemigo == 0) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 1) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 2) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 3) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 4) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 5) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            }
            // enemigo17
            if (enemigo17.Enemigo == 0) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 1) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 2) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 3) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 4) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            } else if (enemigo17.Enemigo == 5) {
                if (enemigo17.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo17.x, enemigo17.y, 40, 40, this);
                }
            }

        } else if (Nivel == 4) {
            if (inicial == 4) {
                reseteo();
                // posisicones iniciales
                // personaje
                personaje.x = 2 * 40;
                personaje.y = 2 * 40;
                personaje.xInicial = 2 * 40;
                personaje.yInicial = 2 * 40;
                // wirplos
                enemigo1.x = 2 * 40;
                enemigo1.y = 6 * 40;
                enemigo1.Enemigo = 0;
                enemigo1.aceleracion(4);
                enemigo2.x = 2 * 40;
                enemigo2.y = 7 * 40;
                enemigo2.Enemigo = 0;
                enemigo2.aceleracion(4);
                enemigo3.x = 13 * 40;
                enemigo3.y = 9 * 40;
                enemigo3.Enemigo = 0;
                enemigo3.aceleracion(4);
                enemigo4.x = 26 * 40;
                enemigo4.y = 7 * 40;
                enemigo4.Enemigo = 0;
                enemigo4.aceleracion(4);
                enemigo5.x = 4 * 40;
                enemigo5.y = 9 * 40;
                enemigo5.Enemigo = 1;
                enemigo5.aceleracion(4);
                enemigo6.x = 7 * 40;
                enemigo6.y = 40;
                enemigo6.Enemigo = 1;
                enemigo6.aceleracion(4);
                enemigo7.x = 10 * 40;
                enemigo7.y = 10 * 40;
                enemigo7.Enemigo = 1;
                enemigo7.aceleracion = 4;
                enemigo8.x = 14 * 40;
                enemigo8.y = 10 * 40;
                enemigo8.Enemigo = 1;
                enemigo8.aceleracion = 4;
                enemigo9.x = 17 * 40;
                enemigo9.y = 9 * 40;
                enemigo9.Enemigo = 1;
                enemigo9.aceleracion = 4;
                enemigo10.x = 5 * 40;
                enemigo10.y = 21 * 40;
                enemigo10.Enemigo = 1;
                enemigo10.aceleracion = 4;
                enemigo11.x = 27 * 40;
                enemigo11.y = 40;
                enemigo11.Enemigo = 1;
                enemigo11.aceleracion = 4;
                // chersans
                enemigo12.x = 9 * 40;
                enemigo12.y = 40;
                enemigo12.Enemigo = 4;
                enemigo12.aceleracion = 1;
                enemigo13.x = 6 * 40;
                enemigo13.y = 5 * 40;
                enemigo13.Enemigo = 4;
                enemigo13.aceleracion = 1;
                enemigo14.x = 40;
                enemigo14.y = 9 * 40;
                enemigo14.Enemigo = 4;
                enemigo14.aceleracion = 1;
                enemigo15.x = 7 * 40;
                enemigo15.y = 14 * 40;
                enemigo15.Enemigo = 4;
                enemigo15.aceleracion = 1;
                enemigo16.x = 40;
                enemigo16.y = 27 * 40;
                enemigo16.Enemigo = 4;
                enemigo16.aceleracion = 1;
                enemigo17.x = 25 * 40;
                enemigo17.y = 14 * 40;
                enemigo17.Enemigo = 5;
                enemigo17.aceleracion = 1;
                // aliado
                aliado1.x = 25 * 40;
                aliado1.y = 14 * 40;
                aliado1.aliado = 1;
                aliado2.x = 25 * 40;
                aliado2.y = 14 * 40;
                aliado2.aliado = 0;
                aliado3.x = 25 * 40;
                aliado3.y = 14 * 40;
                aliado3.aliado = 0;
                aliado4.x = 25 * 40;
                aliado4.y = 14 * 40;
                aliado4.aliado = 0;
                inicial++;
            }
            laberinto.paint(grafico);
            personaje.paint(grafico);
            enemigo1.paint(grafico);
            enemigo2.paint(grafico);
            enemigo3.paint(grafico);
            enemigo4.paint(grafico);
            enemigo5.paint(grafico);
            enemigo6.paint(grafico);
            enemigo7.paint(grafico);
            enemigo8.paint(grafico);
            enemigo9.paint(grafico);
            enemigo10.paint(grafico);
            enemigo11.paint(grafico);
            enemigo12.paint(grafico);
            enemigo13.paint(grafico);
            enemigo14.paint(grafico);
            enemigo15.paint(grafico);
            enemigo16.paint(grafico);

            // fin
            grafico.drawImage(Fin.getImage(), 24 * 40, 8 * 40, 40, 40, this);

            // Cofre
            grafico.drawImage(Cofre2.getImage(), 2 * 40, 13 * 40, 40, 40, this);

            if (enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo3.x == personaje.x && enemigo3.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo4.x == personaje.x && enemigo4.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo7.x == personaje.x && enemigo7.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo8.x == personaje.x && enemigo8.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo9.x == personaje.x && enemigo9.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo10.x == personaje.x && enemigo10.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo11.x == personaje.x && enemigo11.y == personaje.y && personaje.obtenerEscudo() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo();
            } else if (enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo3.x == personaje.x && enemigo3.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo4.x == personaje.x && enemigo4.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo7.x == personaje.x && enemigo7.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo8.x == personaje.x && enemigo8.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo9.x == personaje.x && enemigo9.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo10.x == personaje.x && enemigo10.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo11.x == personaje.x && enemigo11.y == personaje.y && personaje.obtenerEscudo() == 0) {
                personaje.x = personaje.xInicial;
                personaje.y = personaje.yInicial;
                personaje.perdervidas();

            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo13.x == personaje.x && enemigo13.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo14.x == personaje.x && enemigo14.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo15.x == personaje.x && enemigo15.y == personaje.y && personaje.obtenerEscudo2() > 0
                    || enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo2();
            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo13.x == personaje.x && enemigo13.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo14.x == personaje.x && enemigo14.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo15.x == personaje.x && enemigo15.y == personaje.y && personaje.obtenerEscudo2() == 0
                    || enemigo16.x == personaje.x && enemigo16.y == personaje.y && personaje.obtenerEscudo2() == 0) {
                personaje.x = 7 * 40;
                personaje.y = 7 * 40;
                personaje.ganarstun();
            }

            if (personaje.opcion90) {
                laberinto.opcion90 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 7 * 40, 6 * 40, 40, 40, this);
            }
            if (personaje.opcion91) {
                laberinto.opcion91 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 7 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion92) {
                laberinto.opcion92 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 2 * 40, 10 * 40, 40, 40, this);
            }
            if (personaje.opcion93) {
                laberinto.opcion93 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 9 * 40, 12 * 40, 40, 40, this);
            }
            if (personaje.opcion94) {
                laberinto.opcion94 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 3 * 40, 6 * 40, 40, 40, this);
            }
            if (personaje.opcion95) {
                laberinto.opcion95 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 13 * 40, 2 * 40, 40, 40, this);
            }
            if (personaje.opcion96) {
                laberinto.opcion96 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 15 * 40, 13 * 40, 40, 40, this);
            }
            if (personaje.opcion97) {
                laberinto.opcion97 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 19 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion98) {
                laberinto.opcion98 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 20 * 40, 5 * 40, 40, 40, this);
            }
            if (personaje.opcion99) {
                laberinto.opcion99 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 22 * 40, 1 * 40, 40, 40, this);
            }
            // personaje
            if (personaje.tipo == 0) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 1) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper23.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper21.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper22.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper24.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 2) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper33.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper31.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper32.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper34.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 3) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper43.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper41.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper42.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper44.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 4) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper53.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper51.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper52.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper54.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            }

            // enemigo1
            if (enemigo1.Enemigo == 0) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 1) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 2) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 3) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 4) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 5) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            }
            // enemigo2
            if (enemigo2.Enemigo == 0) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 1) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 2) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 3) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 4) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 5) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            }
            // enemigo16
            if (enemigo16.Enemigo == 0) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 1) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 2) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 3) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 4) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            } else if (enemigo16.Enemigo == 5) {
                if (enemigo16.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo16.x, enemigo16.y, 40, 40, this);
                }
            }
            // enemigo3
            if (enemigo3.Enemigo == 0) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 1) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 2) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 3) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 4) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 5) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            }
            // enemigo4
            if (enemigo4.Enemigo == 0) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 1) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 2) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 3) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 4) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 5) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            }
            // enemigo5
            if (enemigo5.Enemigo == 0) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 1) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 2) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 3) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 4) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 5) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            }
            // enemigo6
            if (enemigo6.Enemigo == 0) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 1) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 2) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 3) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 4) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 5) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            }
            // enemigo7
            if (enemigo7.Enemigo == 0) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 1) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 2) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 3) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 4) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 5) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            }
            // enemigo8
            if (enemigo8.Enemigo == 0) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 1) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 2) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 3) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 4) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 5) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            }
            // enemigo9
            if (enemigo9.Enemigo == 0) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 1) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 2) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 3) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 4) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 5) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            }
            // enemigo10
            if (enemigo10.Enemigo == 0) {
                if (enemigo10.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                }
            } else if (enemigo10.Enemigo == 1) {
                if (enemigo10.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                }
            } else if (enemigo10.Enemigo == 2) {
                if (enemigo10.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                }
            } else if (enemigo10.Enemigo == 3) {
                if (enemigo10.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                }
            } else if (enemigo10.Enemigo == 4) {
                if (enemigo10.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                }
            } else if (enemigo10.Enemigo == 5) {
                if (enemigo10.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo10.x, enemigo10.y, 40, 40, this);
                }
            }
            // enemigo11
            if (enemigo11.Enemigo == 0) {
                if (enemigo11.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                }
            } else if (enemigo11.Enemigo == 1) {
                if (enemigo11.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                }
            } else if (enemigo11.Enemigo == 2) {
                if (enemigo11.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo11.Enemigo == 3) {
                if (enemigo11.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                }
            } else if (enemigo11.Enemigo == 4) {
                if (enemigo11.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                }
            } else if (enemigo11.Enemigo == 5) {
                if (enemigo11.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo11.x, enemigo11.y, 40, 40, this);
                }
            }
            // enemigo12
            if (enemigo12.Enemigo == 0) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 1) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 2) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 3) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 4) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 5) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            }
            // enemigo13
            if (enemigo13.Enemigo == 0) {
                if (enemigo13.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                }
            } else if (enemigo13.Enemigo == 1) {
                if (enemigo13.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                }
            } else if (enemigo13.Enemigo == 2) {
                if (enemigo13.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                }
            } else if (enemigo13.Enemigo == 3) {
                if (enemigo13.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                }
            } else if (enemigo13.Enemigo == 4) {
                if (enemigo13.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                }
            } else if (enemigo13.Enemigo == 5) {
                if (enemigo13.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo13.x, enemigo13.y, 40, 40, this);
                }
            }
            // enemigo14
            if (enemigo14.Enemigo == 0) {
                if (enemigo14.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                }
            } else if (enemigo14.Enemigo == 1) {
                if (enemigo14.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                }
            } else if (enemigo14.Enemigo == 2) {
                if (enemigo14.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                }
            } else if (enemigo14.Enemigo == 3) {
                if (enemigo14.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                }
            } else if (enemigo14.Enemigo == 4) {
                if (enemigo14.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                }
            } else if (enemigo14.Enemigo == 5) {
                if (enemigo14.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo14.x, enemigo14.y, 40, 40, this);
                }
            }
            // enemigo15
            if (enemigo15.Enemigo == 0) {
                if (enemigo15.direccion == 0) {
                    grafico.drawImage(ImgEnem223.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem213.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                }
            } else if (enemigo15.Enemigo == 1) {
                if (enemigo15.direccion == 0) {
                    grafico.drawImage(ImgEnem233.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem243.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                }
            } else if (enemigo15.Enemigo == 2) {
                if (enemigo15.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                }
            } else if (enemigo15.Enemigo == 3) {
                if (enemigo15.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                }
            } else if (enemigo15.Enemigo == 4) {
                if (enemigo15.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                }
            } else if (enemigo15.Enemigo == 5) {
                if (enemigo15.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo15.x, enemigo15.y, 40, 40, this);
                }
            }

        } else if (Nivel == 5) {
            if (inicial == 5) {
                reseteo();
                // posisicones iniciales
                // personaje
                personaje.x = 2 * 40;
                personaje.y = 14 * 40;
                personaje.xInicial = 2 * 40;
                personaje.yInicial = 14 * 40;
                // wirplos
                enemigo1.x = 5 * 40;
                enemigo1.y = 6 * 40;
                enemigo1.Enemigo = 0;
                enemigo1.aceleracion(1);
                enemigo2.x = 25 * 40;
                enemigo2.y = 14 * 40;
                enemigo2.Enemigo = 0;
                enemigo2.aceleracion(1);
                enemigo3.x = 25 * 40;
                enemigo3.y = 14 * 40;
                enemigo3.Enemigo = 0;
                enemigo3.aceleracion(1);
                enemigo4.x = 25 * 40;
                enemigo4.y = 14 * 40;
                enemigo4.Enemigo = 0;
                enemigo4.aceleracion(1);
                enemigo5.x = 3 * 40;
                enemigo5.y = 2 * 40;
                enemigo5.Enemigo = 1;
                enemigo5.aceleracion(1);
                enemigo6.x = 7 * 40;
                enemigo6.y = 2 * 40;
                enemigo6.Enemigo = 1;
                enemigo6.aceleracion(1);
                enemigo7.x = 17 * 40;
                enemigo7.y = 5 * 40;
                enemigo7.Enemigo = 3;
                enemigo7.limitey1 = 15;
                enemigo7.limitey2 = 4;
                enemigo7.aceleracion = 1;
                enemigo8.x = 14 * 40;
                enemigo8.y = 5 * 40;
                enemigo8.limitey1 = 15;
                enemigo8.limitey2 = 4;
                enemigo8.Enemigo = 3;
                enemigo8.aceleracion = 1;
                enemigo9.x = 11 * 40;
                enemigo9.y = 2 * 40;
                enemigo9.Enemigo = 1;
                enemigo9.aceleracion = 1;
                enemigo10.x = 25 * 40;
                enemigo10.y = 14 * 40;
                enemigo10.Enemigo = 1;
                enemigo10.aceleracion = 1;
                enemigo11.x = 25 * 40;
                enemigo11.y = 14 * 40;
                enemigo11.Enemigo = 1;
                enemigo11.aceleracion = 1;
                // chersans
                enemigo12.x = 25 * 40;
                enemigo12.y = 14 * 40;
                enemigo12.Enemigo = 4;
                enemigo12.aceleracion = 1;
                enemigo13.x = 25 * 40;
                enemigo13.y = 14 * 40;
                enemigo13.Enemigo = 4;
                enemigo13.aceleracion = 1;
                enemigo14.x = 25 * 40;
                enemigo14.y = 14 * 40;
                enemigo14.Enemigo = 4;
                enemigo14.aceleracion = 1;
                enemigo15.x = 25 * 40;
                enemigo15.y = 14 * 40;
                enemigo15.Enemigo = 4;
                enemigo15.aceleracion = 1;
                enemigo16.x = 25 * 40;
                enemigo16.y = 14 * 40;
                enemigo16.Enemigo = 4;
                enemigo16.aceleracion = 1;
                enemigo17.x = 25 * 40;
                enemigo17.y = 14 * 40;
                enemigo17.Enemigo = 5;
                enemigo17.aceleracion = 1;
                // aliado
                aliado1.x = 26 * 40;
                aliado1.y = 9 * 40;
                aliado1.xInicial = 26 * 40;
                aliado1.yInicial = 9 * 40;
                aliado1.aliado = 1;
                aliado2.x = 20 * 40;
                aliado2.y = 13 * 40;
                aliado2.xInicial = 20 * 40;
                aliado2.yInicial = 13 * 40;
                aliado2.aliado = 0;
                aliado3.x = 16 * 40;
                aliado3.y = 40;
                aliado3.xInicial = 16 * 40;
                aliado3.yInicial = 40;
                aliado3.aliado = 0;
                aliado4.x = 10 * 40;
                aliado4.y = 6 * 40;
                aliado4.xInicial = 10 * 40;
                aliado4.yInicial = 6 * 40;
                aliado4.aliado = 0;
                inicial++;
            }

            laberinto.paint(grafico);
            personaje.paint(grafico);
            enemigo5.paint(grafico);
            enemigo6.paint(grafico);
            enemigo7.paint(grafico);
            enemigo8.paint(grafico);
            enemigo1.paint(grafico);
            enemigo9.paint(grafico);
            aliado1.paint(grafico);
            aliado2.paint(grafico);
            aliado3.paint(grafico);
            aliado4.paint(grafico);
            // fin
            grafico.drawImage(Fin.getImage(), 2 * 40, 6 * 40, 40, 40, this);

            if (personaje.mover == 0) {
                grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
            } else if (personaje.mover == 1) {
                grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
            } else if (personaje.mover == 2) {
                grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
            } else if (personaje.mover == 3) {
                grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
            }

            // opocion enemigos
            if (enemigo1.x == aliado1.x && enemigo1.y == aliado1.y
                    || enemigo4.x == aliado1.x && enemigo4.y == aliado1.y
                    || enemigo5.x == aliado1.x && enemigo5.y == aliado1.y
                    || enemigo6.x == aliado1.x && enemigo6.y == aliado1.y
                    || enemigo7.x == aliado1.x && enemigo7.y == aliado1.y
                    || enemigo8.x == aliado1.x && enemigo8.y == aliado1.y
                    || enemigo9.x == aliado1.x && enemigo9.y == aliado1.y) {
                aliado1.x = aliado1.xInicial;
                aliado1.y = aliado1.yInicial;
            }
            if (enemigo1.x == aliado2.x && enemigo1.y == aliado2.y
                    || enemigo4.x == aliado2.x && enemigo4.y == aliado2.y
                    || enemigo5.x == aliado2.x && enemigo5.y == aliado2.y
                    || enemigo6.x == aliado2.x && enemigo6.y == aliado2.y
                    || enemigo7.x == aliado2.x && enemigo7.y == aliado2.y
                    || enemigo8.x == aliado2.x && enemigo8.y == aliado2.y
                    || enemigo9.x == aliado2.x && enemigo9.y == aliado2.y) {
                aliado2.x = aliado2.xInicial;
                aliado2.y = aliado2.yInicial;
            }
            if (enemigo1.x == aliado4.x && enemigo1.y == aliado4.y
                    || enemigo4.x == aliado4.x && enemigo4.y == aliado4.y
                    || enemigo5.x == aliado4.x && enemigo5.y == aliado4.y
                    || enemigo6.x == aliado4.x && enemigo6.y == aliado4.y
                    || enemigo7.x == aliado4.x && enemigo7.y == aliado4.y
                    || enemigo8.x == aliado4.x && enemigo8.y == aliado4.y
                    || enemigo9.x == aliado4.x && enemigo9.y == aliado4.y) {
                aliado4.x = aliado4.xInicial;
                aliado4.y = aliado4.yInicial;
            }

            // opcion puertas
            if (personaje.opcion1) {
                grafico.drawImage(Boton2.getImage(), 6 * 40, 10 * 40, 40, 40, this);
                aliado1.opcion1 = true;
                aliado2.opcion1 = true;
                aliado3.opcion1 = true;
                aliado4.opcion1 = true;
                enemigo1.opcion1 = true;
                enemigo5.opcion1 = true;
                enemigo6.opcion1 = true;
                enemigo7.opcion1 = true;
                enemigo8.opcion1 = true;
                enemigo9.opcion1 = true;
                laberinto.opcion1 = true;
            } else {
                grafico.drawImage(Boton2.getImage(), 6 * 40, 10 * 40, 40, 40, this);
                grafico.drawImage(puerta2.getImage(), 13 * 40, 1 * 40, 40, 40, this);

            }
            if (personaje.opcion2) {
                grafico.drawImage(Boton3.getImage(), 6 * 40, 11 * 40, 40, 40, this);
                aliado1.opcion2 = true;
                aliado2.opcion2 = true;
                aliado3.opcion2 = true;
                aliado4.opcion2 = true;
                enemigo1.opcion2 = true;
                enemigo5.opcion2 = true;
                enemigo6.opcion2 = true;
                enemigo7.opcion2 = true;
                enemigo8.opcion2 = true;
                enemigo9.opcion2 = true;
                laberinto.opcion2 = true;
            } else {
                grafico.drawImage(Boton3.getImage(), 6 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 19 * 40, 12 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 19 * 40, 13 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 19 * 40, 14 * 40, 40, 40, this);

            }
            if (personaje.opcion3) {
                grafico.drawImage(Boton1.getImage(), 6 * 40, 12 * 40, 40, 40, this);
                aliado1.opcion3 = true;
                aliado2.opcion3 = true;
                aliado3.opcion3 = true;
                aliado4.opcion3 = true;
                enemigo1.opcion3 = true;
                enemigo5.opcion3 = true;
                enemigo6.opcion3 = true;
                enemigo7.opcion3 = true;
                enemigo8.opcion3 = true;
                enemigo9.opcion3 = true;
                laberinto.opcion3 = true;
            } else {
                grafico.drawImage(Boton1.getImage(), 6 * 40, 12 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 8 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 8 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 8 * 40, 7 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 12 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 12 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 12 * 40, 7 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 20 * 40, 5 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 20 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 20 * 40, 7 * 40, 40, 40, this);
            }
            if (aliado3.opcion6) {
                grafico.drawImage(Boton4.getImage(), 1 * 40, 1 * 40, 40, 40, this);
                personaje.opcion6 = true;
                aliado1.opcion6 = true;
                aliado2.opcion6 = true;
                aliado4.opcion6 = true;
                enemigo1.opcion6 = true;
                enemigo5.opcion6 = true;
                enemigo6.opcion6 = true;
                enemigo7.opcion6 = true;
                enemigo8.opcion6 = true;
                enemigo9.opcion6 = true;
                laberinto.opcion6 = true;
            } else {
                grafico.drawImage(Boton4.getImage(), 1 * 40, 1 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 25 * 40, 2 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 26 * 40, 2 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 27 * 40, 2 * 40, 40, 40, this);

            }
            if (aliado1.opcion7) {
                grafico.drawImage(Boton5.getImage(), 26 * 40, 1 * 40, 40, 40, this);
                personaje.opcion7 = true;
                aliado2.opcion7 = true;
                aliado3.opcion7 = true;
                aliado4.opcion7 = true;
                enemigo1.opcion7 = true;
                enemigo5.opcion7 = true;
                enemigo6.opcion7 = true;
                enemigo7.opcion7 = true;
                enemigo8.opcion7 = true;
                enemigo9.opcion7 = true;
                laberinto.opcion7 = true;
            } else {
                grafico.drawImage(Boton5.getImage(), 26 * 40, 1 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 1 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 2 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 3 * 40, 8 * 40, 40, 40, this);

            }
            if (aliado2.opcion8) {
                grafico.drawImage(Boton1.getImage(), 8 * 40, 13 * 40, 40, 40, this);
                personaje.opcion8 = true;
                aliado1.opcion8 = true;
                aliado3.opcion8 = true;
                aliado4.opcion8 = true;
                enemigo1.opcion8 = true;
                enemigo5.opcion8 = true;
                enemigo6.opcion8 = true;
                enemigo7.opcion8 = true;
                enemigo8.opcion8 = true;
                enemigo9.opcion8 = true;
                laberinto.opcion8 = true;
            } else {
                grafico.drawImage(Boton1.getImage(), 8 * 40, 13 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 25 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 26 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 27 * 40, 6 * 40, 40, 40, this);

            }
            if (aliado4.opcion9) {
                grafico.drawImage(Boton5.getImage(), 22 * 40, 6 * 40, 40, 40, this);
                personaje.opcion9 = true;
                aliado1.opcion9 = true;
                aliado3.opcion9 = true;
                aliado2.opcion9 = true;
                enemigo1.opcion9 = true;
                enemigo5.opcion9 = true;
                enemigo6.opcion9 = true;
                enemigo7.opcion9 = true;
                enemigo8.opcion9 = true;
                enemigo9.opcion9 = true;
                laberinto.opcion9 = true;
            } else {
                grafico.drawImage(Boton5.getImage(), 22 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 25 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 26 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 27 * 40, 4 * 40, 40, 40, this);

            }

            if (personaje.opcion90) {
                laberinto.opcion90 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 3 * 40, 14 * 40, 40, 40, this);
            }
            if (personaje.opcion91) {
                laberinto.opcion91 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 3 * 40, 9 * 40, 40, 40, this);
            }
            if (personaje.opcion92) {
                laberinto.opcion92 = true;
            }
            if (personaje.opcion93) {
                laberinto.opcion93 = true;
            }
            if (personaje.opcion94) {
                laberinto.opcion94 = true;
            }
            if (personaje.opcion95) {
                laberinto.opcion95 = true;
            }
            if (personaje.opcion96) {
                laberinto.opcion96 = true;
            }
            if (personaje.opcion97) {
                laberinto.opcion97 = true;
            }
            if (personaje.opcion98) {
                laberinto.opcion98 = true;
            }
            if (personaje.opcion99) {
                laberinto.opcion99 = true;
            }
            // aliado1
            if (aliado1.aliado == 0) {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            } else {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            }
            // aliado2
            if (aliado2.aliado == 0) {
                if (aliado2.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                }
            } else {
                if (aliado2.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                }
            }
            // aliado3
            if (aliado3.aliado == 0) {
                if (aliado3.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado3.x, aliado3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado3.x, aliado3.y, 40, 40, this);
                }
            } else {
                if (aliado3.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado3.x, aliado3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado3.x, aliado3.y, 40, 40, this);
                }
            }
            // aliado4
            if (aliado4.aliado == 0) {
                if (aliado4.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado4.x, aliado4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado4.x, aliado4.y, 40, 40, this);
                }
            } else {
                if (aliado4.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado4.x, aliado4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado4.x, aliado4.y, 40, 40, this);
                }
            }
            // personaje
            if (personaje.tipo == 0) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 1) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper23.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper21.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper22.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper24.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 2) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper33.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper31.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper32.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper34.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 3) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper43.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper41.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper42.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper44.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 4) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper53.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper51.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper52.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper54.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            }

            // enemigo1
            if (enemigo1.Enemigo == 0) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 1) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 2) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 3) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 4) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 5) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            }

            // enemigo5
            if (enemigo5.Enemigo == 0) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 1) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 2) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 3) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 4) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 5) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            }
            // enemigo6
            if (enemigo6.Enemigo == 0) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 1) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 2) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 3) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 4) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 5) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            }

            // enemigos 7
            if (enemigo7.Enemigo == 0) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 1) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 2) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 3) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 4) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 5) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            }

            // enemigo8
            if (enemigo8.Enemigo == 0) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 1) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 2) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 3) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 4) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 5) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            }

            // enemigo9
            if (enemigo9.Enemigo == 0) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 1) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 2) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 3) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 4) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            } else if (enemigo9.Enemigo == 5) {
                if (enemigo9.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo9.x, enemigo9.y, 40, 40, this);
                }
            }

        } else if (Nivel == 6) {
            if (inicial == 6) {
                enemigo1.stop = true;
                enemigo2.stop = true;
                enemigo3.stop = true;
                enemigo4.stop = true;
                enemigo5.stop = true;
                enemigo6.stop = true;
                enemigo8.stop = true;
                enemigo12.stop = true;

                reseteo();
                // posisicones iniciales
                // personaje
                personaje.x = 2 * 40;
                personaje.y = 6 * 40;
                personaje.xInicial = 2 * 40;
                personaje.yInicial = 6 * 40;
                // wirplos
                enemigo1.x = 2 * 40;
                enemigo1.y = 2 * 40;
                enemigo1.Enemigo = 0;
                enemigo1.aceleracion = 5;
                enemigo2.x = 14 * 40;
                enemigo2.y = 2 * 40;
                enemigo2.Enemigo = 0;
                enemigo2.aceleracion = 5;
                enemigo3.x = 19 * 40;
                enemigo3.y = 5 * 40;
                enemigo3.Enemigo = 0;
                enemigo3.aceleracion = 5;
                enemigo4.x = 10 * 40;
                enemigo4.y = 6 * 40;
                enemigo4.Enemigo = 0;
                enemigo4.monedas = true;
                enemigo4.aceleracion = 5;
                enemigo5.x = 8 * 40;
                enemigo5.y = 10 * 40;
                enemigo5.Enemigo = 1;
                enemigo5.aceleracion = 5;
                enemigo6.x = 10 * 40;
                enemigo6.y = 2 * 40;
                enemigo6.Enemigo = 1;
                enemigo6.monedas = true;
                enemigo6.aceleracion = 5;
                enemigo7.x = 22 * 40;
                enemigo7.y = 8 * 40;
                enemigo7.Enemigo = 1;
                enemigo7.aceleracion = 7;
                enemigo8.x = 5 * 40;
                enemigo8.y = 10 * 40;
                enemigo8.Enemigo = 3;
                enemigo8.aceleracion = 5;
                enemigo9.x = 25 * 40;
                enemigo9.y = 14 * 40;
                enemigo9.Enemigo = 1;
                enemigo9.aceleracion = 5;
                enemigo10.x = 25 * 40;
                enemigo10.y = 14 * 40;
                enemigo10.Enemigo = 1;
                enemigo10.aceleracion = 1;
                enemigo11.x = 25 * 40;
                enemigo11.y = 14 * 40;
                enemigo11.Enemigo = 1;
                enemigo11.aceleracion = 1;
                // chersans
                enemigo12.x = 13 * 40;
                enemigo12.y = 9 * 40;
                enemigo8.limitey1 = 15;
                enemigo8.limitey2 = 5;
                enemigo12.Enemigo = 4;
                enemigo12.aceleracion = 5;
                enemigo13.x = 25 * 40;
                enemigo13.y = 14 * 40;
                enemigo13.Enemigo = 4;
                enemigo13.aceleracion = 1;
                enemigo14.x = 25 * 40;
                enemigo14.y = 14 * 40;
                enemigo14.Enemigo = 4;
                enemigo14.aceleracion = 1;
                enemigo15.x = 25 * 40;
                enemigo15.y = 14 * 40;
                enemigo15.Enemigo = 4;
                enemigo15.aceleracion = 1;
                enemigo16.x = 25 * 40;
                enemigo16.y = 14 * 40;
                enemigo16.Enemigo = 5;
                enemigo16.aceleracion = 1;
                enemigo17.x = 25 * 40;
                enemigo17.y = 14 * 40;
                enemigo17.Enemigo = 5;
                enemigo17.aceleracion = 1;

                // aliados
                aliado1.x = 1 * 40;
                aliado1.y = 11 * 40;
                aliado1.aliado = 1;
                aliado2.x = 27 * 40;
                aliado2.y = 4 * 40;
                aliado2.aliado = 1;
                aliado3.x = 25 * 40;
                aliado3.y = 14 * 40;
                aliado3.aliado = 0;
                aliado4.x = 25 * 40;
                aliado4.y = 14 * 40;
                aliado4.aliado = 0;
                inicial++;

                enemigo1.teclaprecionada();
                enemigo2.teclaprecionada();
                enemigo3.teclaprecionada();
                enemigo4.teclaprecionada();
                enemigo5.teclaprecionada();
                enemigo6.teclaprecionada();
                enemigo7.teclaprecionada();
            }

            laberinto.paint(grafico);
            personaje.paint(grafico);
            aliado1.paint(grafico);
            aliado2.paint(grafico);
            enemigo1.paint(grafico);
            enemigo2.paint(grafico);
            enemigo3.paint(grafico);
            enemigo4.paint(grafico);
            enemigo5.paint(grafico);
            enemigo6.paint(grafico);
            enemigo7.paint(grafico);
            enemigo8.paint(grafico);
            enemigo12.paint(grafico);

            // fin
            grafico.drawImage(Fin.getImage(), 20 * 40, 14 * 40, 40, 40, this);
            // cofre
            grafico.drawImage(Cofre3.getImage(), 15 * 40, 5 * 40, 40, 40, this);

            // Relentizar
            if (personaje.opcion53) {
                personaje.opcion53 = false;
                enemigo1.stun = 130;
                enemigo2.stun = 130;
                enemigo3.stun = 130;
                enemigo4.stun = 130;
                enemigo5.stun = 130;
                enemigo6.stun = 130;
                enemigo7.stun = 130;
                enemigo8.stun = 130;
                enemigo12.stun = 130;

            }

            if (enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo3.x == personaje.x && enemigo3.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo4.x == personaje.x && enemigo4.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo7.x == personaje.x && enemigo7.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo8.x == personaje.x && enemigo8.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo9.x == personaje.x && enemigo9.y == personaje.y && personaje.obtenerEscudo() == 0) {
                personaje.x = 10 * 40;
                personaje.y = 8 * 40;
                personaje.perderEscudo();
            } else if (enemigo1.x == personaje.x && enemigo1.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo2.x == personaje.x && enemigo2.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo3.x == personaje.x && enemigo3.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo4.x == personaje.x && enemigo4.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo5.x == personaje.x && enemigo5.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo6.x == personaje.x && enemigo6.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo7.x == personaje.x && enemigo7.y == personaje.y && personaje.obtenerEscudo() > 0
                    || enemigo8.x == personaje.x && enemigo8.y == personaje.y && personaje.obtenerEscudo() == 0
                    || enemigo9.x == personaje.x && enemigo9.y == personaje.y && personaje.obtenerEscudo() == 0) {
                personaje.x = 40;
                personaje.y = 8 * 40;
                personaje.perdervidas();

            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() > 0) {
                personaje.x = 10 * 40;
                personaje.y = 10 * 40;
                personaje.perderEscudo2();
            } else if (enemigo12.x == personaje.x && enemigo12.y == personaje.y && personaje.obtenerEscudo2() == 0) {
                personaje.x = 10 * 40;
                personaje.y = 6 * 40;
                personaje.ganarstun();
            }

            if (personaje.opcion1) {
                grafico.drawImage(Boton5.getImage(), 5 * 40, 8 * 40, 40, 40, this);
                laberinto.opcion1 = true;
                aliado1.opcion1 = true;
                aliado2.opcion1 = true;
                enemigo1.opcion1 = true;
                enemigo2.opcion1 = true;
                enemigo3.opcion1 = true;
                enemigo4.opcion1 = true;
                enemigo5.opcion1 = true;
                enemigo6.opcion1 = true;
                enemigo7.opcion1 = true;
                enemigo8.opcion1 = true;
                enemigo12.opcion1 = true;
            } else {
                grafico.drawImage(Boton5.getImage(), 5 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 27 * 40, 2 * 40, 40, 40, this);

            }
            if (personaje.opcion2) {
                grafico.drawImage(Boton4.getImage(), 27 * 40, 8 * 40, 40, 40, this);
                laberinto.opcion2 = true;
                aliado1.opcion2 = true;
                aliado2.opcion2 = true;
                enemigo1.opcion2 = true;
                enemigo2.opcion2 = true;
                enemigo3.opcion2 = true;
                enemigo4.opcion2 = true;
                enemigo5.opcion2 = true;
                enemigo6.opcion2 = true;
                enemigo7.opcion2 = true;
                enemigo8.opcion2 = true;
                enemigo12.opcion2 = true;
            } else {
                grafico.drawImage(Boton4.getImage(), 27 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 19 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 20 * 40, 11 * 40, 40, 40, this);
                grafico.drawImage(puerta4.getImage(), 21 * 40, 11 * 40, 40, 40, this);

            }
            if (personaje.opcion3) {
                grafico.drawImage(Boton3.getImage(), 4 * 40, 14 * 40, 40, 40, this);
                laberinto.opcion3 = true;
                aliado1.opcion3 = true;
                aliado2.opcion3 = true;
                enemigo1.opcion3 = true;
                enemigo2.opcion3 = true;
                enemigo3.opcion3 = true;
                enemigo4.opcion3 = true;
                enemigo5.opcion3 = true;
                enemigo6.opcion3 = true;
                enemigo7.opcion3 = true;
                enemigo8.opcion3 = true;
                enemigo12.opcion3 = true;
            } else {
                grafico.drawImage(Boton3.getImage(), 4 * 40, 14 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 23 * 40, 7 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 23 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta3.getImage(), 23 * 40, 9 * 40, 40, 40, this);

            }
            if (aliado2.opcion6) {
                grafico.drawImage(Boton1.getImage(), 27 * 40, 1 * 40, 40, 40, this);
                laberinto.opcion6 = true;
                personaje.opcion6 = true;
                aliado1.opcion6 = true;
                enemigo1.opcion6 = true;
                enemigo2.opcion6 = true;
                enemigo3.opcion6 = true;
                enemigo4.opcion6 = true;
                enemigo5.opcion6 = true;
                enemigo6.opcion6 = true;
                enemigo7.opcion6 = true;
                enemigo8.opcion6 = true;
                enemigo12.opcion6 = true;
            } else {
                grafico.drawImage(Boton1.getImage(), 27 * 40, 1 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 8 * 40, 6 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 8 * 40, 7 * 40, 40, 40, this);
                grafico.drawImage(puerta11.getImage(), 8 * 40, 8 * 40, 40, 40, this);
                grafico.drawImage(puerta12.getImage(), 1 * 40, 13 * 40, 40, 40, this);

            }
            if (aliado1.opcion7) {
                grafico.drawImage(Boton5.getImage(), 1 * 40, 14 * 40, 40, 40, this);
                laberinto.opcion7 = true;
                personaje.opcion7 = true;
                aliado2.opcion7 = true;
                enemigo1.opcion7 = true;
                enemigo2.opcion7 = true;
                enemigo3.opcion7 = true;
                enemigo4.opcion7 = true;
                enemigo5.opcion7 = true;
                enemigo6.opcion7 = true;
                enemigo7.opcion7 = true;
                enemigo8.opcion7 = true;
                enemigo12.opcion7 = true;
            } else {
                grafico.drawImage(Boton5.getImage(), 1 * 40, 14 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 10 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 9 * 40, 4 * 40, 40, 40, this);
                grafico.drawImage(puerta5.getImage(), 11 * 40, 4 * 40, 40, 40, this);

            }

            if (personaje.opcion90) {
                laberinto.opcion90 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 2 * 40, 2 * 40, 40, 40, this);
            }

            if (personaje.opcion91) {
                laberinto.opcion91 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 6 * 40, 2 * 40, 40, 40, this);
            }
            if (personaje.opcion92) {
                laberinto.opcion92 = true;
            } else {
                grafico.drawImage(Gema1.getImage(), 5 * 40, 12 * 40, 40, 40, this);
            }
            // aliado1
            if (aliado1.aliado == 0) {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            } else {
                if (aliado1.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado1.x, aliado1.y, 40, 40, this);
                }
            }
            // aliado2
            if (aliado2.aliado == 0) {
                if (aliado2.direccion == 0) {
                    grafico.drawImage(ImgAli3.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli1.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                }
            } else {
                if (aliado2.direccion == 0) {
                    grafico.drawImage(ImgAli2.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgAli4.getImage(), aliado2.x, aliado2.y, 40, 40, this);
                }
            }
            // personaje
            if (personaje.tipo == 0) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper13.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper11.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper12.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper14.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 1) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper23.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper21.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper22.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper24.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 2) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper33.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper31.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper32.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper34.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 3) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper43.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper41.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper42.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper44.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            } else if (personaje.tipo == 4) {
                if (personaje.mover == 0) {
                    grafico.drawImage(Imgper53.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 1) {
                    grafico.drawImage(Imgper51.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 2) {
                    grafico.drawImage(Imgper52.getImage(), personaje.x, personaje.y, 40, 40, this);
                } else if (personaje.mover == 3) {
                    grafico.drawImage(Imgper54.getImage(), personaje.x, personaje.y, 40, 40, this);
                }
            }

            // enemigo9
            if (enemigo1.Enemigo == 0) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 1) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 2) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 3) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 4) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            } else if (enemigo1.Enemigo == 5) {
                if (enemigo1.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo1.x, enemigo1.y, 40, 40, this);
                }
            }
            // enemigo2
            if (enemigo2.Enemigo == 0) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 1) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 2) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 3) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 4) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            } else if (enemigo2.Enemigo == 5) {
                if (enemigo2.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo2.x, enemigo2.y, 40, 40, this);
                }
            }
            // enemigo3
            if (enemigo3.Enemigo == 0) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 1) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 2) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 3) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 4) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            } else if (enemigo3.Enemigo == 5) {
                if (enemigo3.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo3.x, enemigo3.y, 40, 40, this);
                }
            }
            // enemigo4
            if (enemigo4.Enemigo == 0) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 1) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 2) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 3) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 4) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            } else if (enemigo4.Enemigo == 5) {
                if (enemigo4.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo4.x, enemigo4.y, 40, 40, this);
                }
            }
            // enemigo5
            if (enemigo5.Enemigo == 0) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 1) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 2) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 3) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 4) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            } else if (enemigo5.Enemigo == 5) {
                if (enemigo5.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo5.x, enemigo5.y, 40, 40, this);
                }
            }
            // enemigo6
            if (enemigo6.Enemigo == 0) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 1) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 2) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 3) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 4) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            } else if (enemigo6.Enemigo == 5) {
                if (enemigo6.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo6.x, enemigo6.y, 40, 40, this);
                }
            }
            // enemigo7
            if (enemigo7.Enemigo == 0) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 1) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 2) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 3) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 4) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            } else if (enemigo7.Enemigo == 5) {
                if (enemigo7.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo7.x, enemigo7.y, 40, 40, this);
                }
            }
            // enemigo8
            if (enemigo8.Enemigo == 0) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 1) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 2) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 3) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 4) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            } else if (enemigo8.Enemigo == 5) {
                if (enemigo8.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo8.x, enemigo8.y, 40, 40, this);
                }
            }

            // enemigo12
            if (enemigo12.Enemigo == 0) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem221.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem211.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 1) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem231.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem241.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 2) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 3) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem244.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 4) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem222.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem212.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            } else if (enemigo12.Enemigo == 5) {
                if (enemigo12.direccion == 0) {
                    grafico.drawImage(ImgEnem232.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                } else {
                    grafico.drawImage(ImgEnem242.getImage(), enemigo12.x, enemigo12.y, 40, 40, this);
                }
            }
        }
    }

    public void reseteo() {
        laberinto.reseteo();
        personaje.reseteo();
        aliado1.reseteo();
        aliado2.reseteo();
        aliado3.reseteo();
        aliado4.reseteo();
        enemigo1.reseteo();
        enemigo2.reseteo();
        enemigo3.reseteo();
        enemigo4.reseteo();
        enemigo5.reseteo();
        enemigo6.reseteo();
        enemigo7.reseteo();
        enemigo8.reseteo();
        enemigo9.reseteo();
        enemigo10.reseteo();
        enemigo11.reseteo();
        enemigo12.reseteo();
        enemigo13.reseteo();
        enemigo14.reseteo();
        enemigo15.reseteo();
        enemigo16.reseteo();
        enemigo17.reseteo();

    }

    public static void main(String[] args) {
        JFrame miventana = new JFrame("mi primer laberinto");
        Juego game = new Juego();
        miventana.add(game);

        miventana.setSize(1200, 700);
        miventana.setLocation(300, 200);
        miventana.setVisible(true);

        miventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        while (true) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            game.repaint();
            if (obtenernivel() > 6) {
                JOptionPane.showMessageDialog(null, "ACABAS DE GANAR 20 DE TULA");
                System.exit(0);
            }

        }

    }

}
