/*
 * Copyright (C) 2024 Murilo Nunes <murilo_no@outlook.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package aula8.Ex4.entities;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 06/09/2024
 * @brief Class Matriz
 */

public class Matriz {
    private int[][] matriz;
    private int linhas;
    private int colunas;

    public Matriz(int linhas, int colunas) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.matriz = new int[linhas][colunas];
    }

    public void preencherMatriz(int[][] dados) {
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = dados[i][j];
            }
        }
    }

    public void verificarNumero(int numero) {
        boolean encontrado = false;
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] == numero) {
                    encontrado = true;
                    System.out.println("Posição " + (i + 1) + ", " + (j + 1) + ": ");
                    if (i > 0) {
                        System.out.println("Cima: " + matriz[i - 1][j]);
                    }
                    if (i < linhas - 1) {
                        System.out.println("Baixo: " + matriz[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < colunas - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }
                    System.out.println();
                }
            }
        }
        if (!encontrado) {
            System.out.println("Esse número não está na matriz.");
        }
    }
}
