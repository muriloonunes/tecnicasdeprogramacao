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

package aula8.Ex4.application;

import aula8.Ex4.entities.Matriz;
import java.util.Scanner;

/**
 * @author Murilo Nunes <murilo_no@outlook.com>
 * @date 06/09/2024
 * @brief Class Programa
 */

public class Programa {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o número de linhas da matriz:");
        int linhas = ler.nextInt();
        System.out.println("Digite o número de colunas da matriz:");
        int colunas = ler.nextInt();

        Matriz matriz = new Matriz(linhas, colunas);

        int[][] dados = new int[linhas][colunas];
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                dados[i][j] = ler.nextInt();
            }
        }

        matriz.preencherMatriz(dados);

        System.out.println("Digite o número para ser verificado:");
        int numero = ler.nextInt();

        matriz.verificarNumero(numero);
    }
}
