
import java.awt.*;

public class Laberinto {
    public int[][] lab = new int[16][29];
    public int fila = 0;
    public int columna = 0;
    public final int numFilas = 16;
    public final int numColum = 29;
    public final int anchoBloque = 40;
    public final int altoBloque = 40;
    public boolean opcion1 = false;
    public boolean opcion2 = false;
    public boolean opcion3 = false;
    public boolean opcion4 = false;
    public boolean opcion5 = false;
    public boolean opcion6 = false;
    public boolean opcion7 = false;
    public boolean opcion8 = false;
    public boolean opcion9 = false;
    public boolean opcion51 = false;
    public boolean opcion52 = false;
    public boolean opcion53 = false;
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
        opcion51 = false;
        opcion52 = false;
        opcion53 = false;
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
        return false;
    }

    public <BufferedImage> void paint(Graphics grafico) {
        int[][] laberinto = obtenerlaberinto();

        for (fila = 0; fila < numFilas; fila++) {
            for (columna = 0; columna < numColum; columna++) {
                if (laberinto[fila][columna] == 0) {

                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);

                }
                if (laberinto[fila][columna] == 1) { // muros
                    grafico.setColor(Color.gray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.gray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                }
                if (laberinto[fila][columna] == 5) {
                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.drawString("Fin", (columna * 40) + 15, (fila * 40) + 18);
                }
                if (laberinto[fila][columna] == 3) {
                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                }
                if (laberinto[fila][columna] == 51) {// cofre wirplo
                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                }
                if (laberinto[fila][columna] == 52) { // cofre shersan
                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                }
                if (laberinto[fila][columna] == 90 || laberinto[fila][columna] == 91 || laberinto[fila][columna] == 92
                        || laberinto[fila][columna] == 93
                        || laberinto[fila][columna] == 94 || laberinto[fila][columna] == 95
                        || laberinto[fila][columna] == 96 || laberinto[fila][columna] == 97
                        || laberinto[fila][columna] == 98 || laberinto[fila][columna] == 99) {
                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.drawString("Fin", (columna * 40) + 15, (fila * 40) + 18);
                }
                if (laberinto[fila][columna] == 22 || laberinto[fila][columna] == 21 || laberinto[fila][columna] == 23
                        ||
                        laberinto[fila][columna] == 24 || laberinto[fila][columna] == 25
                        || laberinto[fila][columna] == 26 ||
                        laberinto[fila][columna] == 27 || laberinto[fila][columna] == 28
                        || laberinto[fila][columna] == 29) {
                    grafico.setColor(Color.lightGray);
                    grafico.fillRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                    grafico.setColor(Color.lightGray);
                    grafico.drawRect(columna * 40, fila * 40, anchoBloque, altoBloque);
                }
            }
        }
    }

    public int[][] obtenerlaberinto() {

        if (Juego.obtenernivel() == 1) {
            int laberinto[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 52, 0, 0, 0, 0, 0, 0, 0, 1 }, // 2
                    { 1, 23, 0, 0, 0, 97, 0, 0, 0, 0, 0, 0, 0, 98, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 3
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 4
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 99, 0, 1, 1, 3, 3, 3, 1, 1 }, // 5
                    { 1, 0, 0, 0, 91, 0, 0, 0, 0, 1, 0, 96, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 6
                    { 1, 21, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 7
                    { 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 8
                    { 1, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 9
                    { 1, 0, 0, 3, 26, 1, 0, 0, 0, 92, 0, 3, 0, 0, 0, 0, 0, 0, 95, 0, 0, 0, 1, 0, 0, 5, 0, 0, 1 }, // 10
                    { 1, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 11
                    { 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 12
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 13
                    { 1, 0, 0, 0, 90, 0, 0, 0, 22, 1, 0, 93, 0, 0, 3, 0, 0, 0, 0, 94, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 14
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 15
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };// 16
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2
            if (opcion52) {
                laberinto[1][20] = 0;
            }
            if (opcion1) {
                laberinto[10][11] = 0;
                laberinto[9][11] = 0;
                laberinto[8][11] = 0;
                laberinto[12][14] = 0;
                laberinto[13][14] = 0;
                laberinto[14][14] = 0;
            }
            if (opcion2) {
                laberinto[10][3] = 0;
                laberinto[9][3] = 0;
                laberinto[8][3] = 0;
            }
            if (opcion3) {
                laberinto[4][24] = 0;
                laberinto[4][25] = 0;
                laberinto[4][26] = 0;
            }
            if (opcion6) {
                laberinto[11][6] = 0;
                laberinto[11][7] = 0;
                laberinto[11][8] = 0;
            }
            if (opcion90) {
                laberinto[13][4] = 0;
            }
            if (opcion91) {
                laberinto[5][4] = 0;
            }
            if (opcion92) {
                laberinto[9][9] = 0;
            }
            if (opcion93) {
                laberinto[13][11] = 0;
            }
            if (opcion94) {
                laberinto[13][19] = 0;
            }
            if (opcion95) {
                laberinto[9][18] = 0;
            }
            if (opcion96) {
                laberinto[5][11] = 0;
            }
            if (opcion97) {
                laberinto[2][5] = 0;
            }
            if (opcion98) {
                laberinto[2][13] = 0;
            }
            if (opcion99) {
                laberinto[4][20] = 0;
            }

            lab = laberinto;
        } else if (Juego.obtenernivel() == 2) {
            int laberinto[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 95, 0, 96, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 }, // 2
                    { 1, 23, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 51, 0, 1 }, // 3
                    { 1, 0, 0, 0, 94, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1 }, // 4
                    { 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 21, 0, 0, 1, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 5
                    { 1, 0, 0, 0, 0, 3, 0, 0, 26, 1, 0, 0, 0, 1, 27, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 1 }, // 6
                    { 1, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 90, 0, 3, 0, 0, 0, 0, 0, 0, 1 }, // 7
                    { 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 8
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 9
                    { 1, 0, 93, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 97, 0, 0, 0, 0, 0, 0, 0, 0, 99, 0, 0, 1 }, // 10
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 11
                    { 1, 1, 1, 1, 0, 1, 0, 0, 0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1, 0, 0, 0, 0, 0, 1 }, // 12
                    { 1, 0, 0, 0, 0, 1, 0, 91, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 13
                    { 1, 22, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 52, 0, 0, 0, 98, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 14
                    { 1, 0, 0, 0, 0, 1, 0, 92, 0, 1, 0, 5, 0, 1, 0, 0, 0, 24, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 15
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };// 16
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2
            if (opcion1) {
                laberinto[5][5] = 0;
                laberinto[6][5] = 0;
            }
            if (opcion2) {
                laberinto[4][6] = 0;
                laberinto[4][7] = 0;
                laberinto[4][8] = 0;
                laberinto[6][21] = 0;
                laberinto[5][21] = 0;
            }
            if (opcion3) {
                laberinto[4][19] = 0;
                laberinto[4][18] = 0;
                laberinto[4][17] = 0;
                laberinto[4][16] = 0;
                laberinto[4][15] = 0;
                laberinto[4][14] = 0;
            }
            if (opcion4) {
                laberinto[11][10] = 0;
                laberinto[11][11] = 0;
                laberinto[11][12] = 0;
                laberinto[8][13] = 0;
                laberinto[9][13] = 0;
                laberinto[10][13] = 0;
                laberinto[1][24] = 0;
                laberinto[2][24] = 0;
                laberinto[3][24] = 0;
            }
            if (opcion6) {
                laberinto[8][9] = 0;
                laberinto[9][9] = 0;
                laberinto[10][9] = 0;
            }
            if (opcion7) {
                laberinto[11][19] = 0;
                laberinto[11][20] = 0;
                laberinto[11][21] = 0;
            }
            if (opcion52) {
                laberinto[15][13] = 0;
            }
            if (opcion51) {
                laberinto[2][26] = 0;
            }
            if (opcion90) {
                laberinto[6][19] = 0;
            }
            if (opcion91) {
                laberinto[12][7] = 0;
            }
            if (opcion92) {
                laberinto[14][7] = 0;
            }
            if (opcion93) {
                laberinto[9][2] = 0;
            }
            if (opcion94) {
                laberinto[3][4] = 0;
            }
            if (opcion95) {
                laberinto[1][10] = 0;
            }
            if (opcion96) {
                laberinto[1][12] = 0;
            }
            if (opcion97) {
                laberinto[9][16] = 0;
            }
            if (opcion98) {
                laberinto[13][19] = 0;
            }
            if (opcion99) {
                laberinto[9][25] = 0;
            }

            lab = laberinto;
        } else if (Juego.obtenernivel() == 3) {
            int laberinto[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
                    { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 2
                    { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 3
                    { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 4
                    { 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 0, 94, 0, 1, 0, 0, 0, 1, 0, 93, 0, 1, 0, 98, 0, 1, 21, 1 }, // 5
                    { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, // 6
                    { 1, 0, 26, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, // 7
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 }, // 8
                    { 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0, 92, 0, 0, 0, 1 }, // 9
                    { 1, 5, 0, 0, 97, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 91, 0, 0, 0, 0, 0, 0, 0, 1 }, // 10
                    { 1, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 11
                    { 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 12
                    { 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 13
                    { 1, 0, 0, 52, 0, 0, 1, 0, 0, 0, 96, 0, 0, 0, 1, 0, 0, 0, 1, 99, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 14
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 95, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 15
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };// 16
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2
            if (opcion52) {
                laberinto[12][3] = 0;
            }
            if (opcion1) {
                laberinto[4][3] = 0;
                laberinto[4][2] = 0;
                laberinto[4][1] = 0;
            }
            if (opcion6) {
                laberinto[8][6] = 0;
                laberinto[9][6] = 0;
                laberinto[10][6] = 0;
            }
            if (opcion90) {
                laberinto[8][14] = 0;
            }
            if (opcion91) {
                laberinto[9][20] = 0;
            }
            if (opcion92) {
                laberinto[8][24] = 0;
            }
            if (opcion93) {
                laberinto[4][20] = 0;
            }
            if (opcion94) {
                laberinto[4][12] = 0;
            }
            if (opcion95) {
                laberinto[14][16] = 0;
            }
            if (opcion96) {
                laberinto[13][10] = 0;
            }
            if (opcion97) {
                laberinto[9][4] = 0;
            }
            if (opcion98) {
                laberinto[4][24] = 0;
            }
            if (opcion99) {
                laberinto[13][19] = 0;
            }

            lab = laberinto;
        } else if (Juego.obtenernivel() == 4) {
            int laberinto[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
                    { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 99, 0, 0, 0, 0, 0, 1 }, // 2
                    { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 95, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 3
                    { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1 }, // 4
                    { 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 }, // 5
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 98, 0, 0, 0, 0, 0, 0, 0, 1 }, // 6
                    { 1, 0, 0, 94, 0, 0, 0, 90, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 1 }, // 7
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 8
                    { 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 5, 0, 0, 0, 1 }, // 9
                    { 1, 0, 0, 0, 0, 0, 0, 91, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 97, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 10
                    { 1, 0, 92, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 11
                    { 1, 0, 0, 0, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 12
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 93, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 13
                    { 1, 0, 51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 96, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 14
                    { 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 15
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };// 16
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2
            if (opcion51) {
                laberinto[13][2] = 0;
            }
            if (opcion90) {
                laberinto[6][7] = 0;
            }
            if (opcion91) {
                laberinto[9][7] = 0;
            }
            if (opcion92) {
                laberinto[10][2] = 0;
            }
            if (opcion93) {
                laberinto[12][9] = 0;
            }
            if (opcion94) {
                laberinto[6][3] = 0;
            }
            if (opcion95) {
                laberinto[2][13] = 0;
            }
            if (opcion96) {
                laberinto[13][15] = 0;
            }
            if (opcion97) {
                laberinto[9][19] = 0;
            }
            if (opcion98) {
                laberinto[5][20] = 0;
            }
            if (opcion99) {
                laberinto[1][22] = 0;
            }

            lab = laberinto;
        } else if (Juego.obtenernivel() == 5) {
            int laberinto[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
                    { 1, 26, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 27, 0, 1 }, // 2
                    { 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1 }, // 3
                    { 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1 }, // 4
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 1 }, // 5
                    { 1, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 1 }, // 6
                    { 1, 0, 5, 0, 1, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 29, 0, 1, 3, 3, 3, 1 }, // 7
                    { 1, 0, 0, 0, 1, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 1, 0, 0, 0, 1 }, // 8
                    { 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1 }, // 9
                    { 1, 0, 0, 91, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 1 }, // 10
                    { 1, 0, 0, 0, 0, 0, 21, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 11
                    { 1, 0, 0, 0, 0, 0, 22, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1 }, // 12
                    { 1, 0, 0, 0, 0, 0, 23, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 13
                    { 1, 0, 0, 0, 0, 0, 0, 1, 28, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 14
                    { 1, 0, 0, 90, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 15
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };// 16
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2
            if (opcion1) {
                laberinto[1][13] = 0;
            }
            if (opcion2) {
                laberinto[12][19] = 0;
                laberinto[13][19] = 0;
                laberinto[14][19] = 0;
            }
            if (opcion3) {
                laberinto[5][8] = 0;
                laberinto[6][8] = 0;
                laberinto[7][8] = 0;

                laberinto[5][12] = 0;
                laberinto[6][12] = 0;
                laberinto[7][12] = 0;

                laberinto[5][20] = 0;
                laberinto[6][20] = 0;
                laberinto[7][20] = 0;
            }
            if (opcion6) {
                laberinto[2][25] = 0;
                laberinto[2][26] = 0;
                laberinto[2][27] = 0;
            }
            if (opcion7) {
                laberinto[8][1] = 0;
                laberinto[8][2] = 0;
                laberinto[8][3] = 0;
            }
            if (opcion8) {
                laberinto[6][25] = 0;
                laberinto[6][26] = 0;
                laberinto[6][27] = 0;
            }
            if (opcion9) {
                laberinto[4][25] = 0;
                laberinto[4][26] = 0;
                laberinto[4][27] = 0;
            }
            if (opcion90) {
                laberinto[14][3] = 0;
            }
            if (opcion91) {
                laberinto[9][3] = 0;
            }

            lab = laberinto;
        } else if (Juego.obtenernivel() == 6) {
            int laberinto[][] = {
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, // 1
                    { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 26, 1 }, // 2
                    { 1, 0, 90, 0, 0, 0, 91, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 3, 1 }, // 3
                    { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 }, // 4
                    { 1, 1, 1, 1, 0, 0, 0, 0, 1, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 }, // 5
                    { 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 53, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1 }, // 6
                    { 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, // 7
                    { 1, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1 }, // 8
                    { 1, 0, 0, 0, 0, 21, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 22, 1 }, // 9
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 1 }, // 10
                    { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 }, // 11
                    { 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 3, 3, 3, 1, 0, 0, 0, 0, 0, 1 }, // 12
                    { 1, 0, 1, 0, 0, 92, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 13
                    { 1, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 1 }, // 14
                    { 1, 27, 1, 0, 23, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 0, 5, 0, 1, 0, 0, 0, 0, 0, 1 }, // 15
                    { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 } };// 16
            // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 2

            if (opcion1) {
                laberinto[2][27] = 0;
            }
            if (opcion2) {
                laberinto[11][19] = 0;
                laberinto[11][20] = 0;
                laberinto[11][21] = 0;
            }
            if (opcion3) {
                laberinto[7][23] = 0;
                laberinto[8][23] = 0;
                laberinto[9][23] = 0;
            }
            if (opcion6) {
                laberinto[6][8] = 0;
                laberinto[7][8] = 0;
                laberinto[8][8] = 0;
                laberinto[13][1] = 0;
            }
            if (opcion7) {
                laberinto[4][9] = 0;
                laberinto[4][10] = 0;
                laberinto[4][11] = 0;
            }
            if (opcion90) {
                laberinto[2][2] = 0;
            }
            if (opcion91) {
                laberinto[2][6] = 0;
            }
            if (opcion92) {
                laberinto[12][5] = 0;
            }

            lab = laberinto;
        }

        return lab;
    }
}
